package controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class POIController {
	
	@GET
	@Path("{servicioNombre}/{mapaNombre}/mascercano")
	public String poisMasCercanos(@PathParam("servicioNombre") String servicioNombre,@PathParam("mapaNombre") String mapaNombre){
		return "Cafe los Angelitos";
		
	}

}
