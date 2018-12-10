package ie.gmit.sw.ds.carhire.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import ie.gmit.sw.ds.carhire.model.Booking;
import ie.gmit.sw.ds.carhire.services.BookingService;

@SessionAttributes({"booking","bookings"})
@Controller
public class BookingController {
//	Data members
	@Autowired
	private BookingService bookingService;
	
	
	
	
//	Other methods
	@RequestMapping(value = "/bookings", method=RequestMethod.GET)
	public String showBookings(Model model) {
		Iterable<Booking> bookings = bookingService.findAll();
		model.addAttribute("bookings", bookings);
		
		return "bookings";
		
	} // end showShips
	
} // end class
