package ie.gmit.sw.ds.carhire.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import ie.gmit.sw.ds.carhire.model.Booking;

@Service
public class BookingService {
//	Other methods
	public Iterable<Booking> findAll() {		
		Client client = Client.create();
		
		WebResource web = client.resource("http://localhost:8080/carhire/bookings");
		
		return web.get(new GenericType<List<Booking>>(){});
		
	} // end method
	
} // end class
