package br.com.barin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/user")
public class UserResource {

	@GET
	@Produces(value = "application/json")
	public String sayHello() {
		return "User Service Api";
	}
}
