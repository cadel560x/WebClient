package ie.gmit.sw.ds.carhire.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import ie.gmit.sw.ds.carhire.model.Customer;
import ie.gmit.sw.ds.carhire.services.CustomerService;

@SessionAttributes({"customer","customers"})
@Controller
public class CustomerController {
//	Data members
	@Autowired
	private CustomerService customerService;
	
	
	
	
//	Other methods
	@RequestMapping(value = "/customers", method=RequestMethod.GET)
	public String showCustomers(Model model) {
		Iterable<Customer> customers = customerService.findAll();
		model.addAttribute("customers", customers);
		
		return "customers";
		
	} // end showShips
	
} // end class
