package ie.gmit.sw.ds.carhire.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import ie.gmit.sw.ds.carhire.model.Customer;

@Service
public class CustomerService {
//	Other methods
	public Iterable<Customer> findAll() {		
		Client client = Client.create();
		
		WebResource web = client.resource("http://localhost:8080/carhire/customers");
		
		return web.get(new GenericType<List<Customer>>(){});
		
	} // end method
	
} // end class
