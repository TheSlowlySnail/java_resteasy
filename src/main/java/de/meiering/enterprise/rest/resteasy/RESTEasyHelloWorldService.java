package de.meiering.enterprise.rest.resteasy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/test")
public class RESTEasyHelloWorldService {

	@GET
	@Path("/{parameter}")
	public Response responseText(@PathParam("parameter") String parameter) {
		return Response.status(Status.ACCEPTED).entity("Hallo " + parameter).build();
	}
}
