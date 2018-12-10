package ie.gmit.sw.ds.carhire.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import ie.gmit.sw.ds.carhire.model.Car;

@Service
public class CarService {
//	Other methods
	public Iterable<Car> findAll() {		
		Client client = Client.create();
		
		WebResource web = client.resource("http://localhost:8080/carhire/cars");
		
		return web.get(new GenericType<List<Car>>(){});
		
	} // end method
	
	
	public Car save(Car car) {
		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:8080/carhire/car");
		ClientResponse response = webResource.type("application/xml").post(ClientResponse.class, car);
		
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}
		
		return response.getEntity(Car.class);
		
	} // end method
	
} // end class
