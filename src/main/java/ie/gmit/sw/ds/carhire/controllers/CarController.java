package ie.gmit.sw.ds.carhire.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import ie.gmit.sw.ds.carhire.model.Car;
import ie.gmit.sw.ds.carhire.services.CarService;

@SessionAttributes({"car","cars"})
@Controller
public class CarController {
//	Data members
	@Autowired
	private CarService carService;
	
	
	
	
//	Other methods
	@RequestMapping(value = "/cars", method=RequestMethod.GET)
	public String showCars(Model model) {
		Iterable<Car> cars = carService.findAll();
		model.addAttribute("cars", cars);
		
		return "cars";
		
	} // end method
	
	
	@RequestMapping(value = "/addCar", method=RequestMethod.GET)
	public String addCarGet(Model model) {
		Car car = new Car();
		model.addAttribute("car", car);
		
		return "addCar";
		
	} // end method
	
	
	@RequestMapping(value = "/addCar", method=RequestMethod.POST)
	public String addCarPost(@Valid @ModelAttribute("car") Car car, BindingResult result) {
		if (result.hasErrors()) {
			for (ObjectError oe: result.getAllErrors()) {
				System.out.println(oe.toString());
			}
			return "addCar";
		}
		else {
			System.out.println("car creation ok");
			carService.save(car);
			return "redirect:cars";
		}
		
	} // end addShipPost
	
} // end class
