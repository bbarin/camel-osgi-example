package br.com.barin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/customer")
public class CustomerServiceImpl {

	@GET
	@Produces(value = "application/json")
	public String sayHello() {
		return "Hello World!";
	}
}
