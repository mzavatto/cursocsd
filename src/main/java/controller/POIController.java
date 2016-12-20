package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import pois.POI;

@Path("/")
public class POIController {
	
	@GET
	@Path("{servicioNombre}/{mapaNombre}/mascercano")
	@Produces("application/json")
	public Response poisMasCercanos(@PathParam("servicioNombre") String servicioNombre,@PathParam("mapaNombre") String mapaNombre,
			@QueryParam("latitud") Double latitud,@QueryParam("longitud") Double longitud){
		
		if(longitud == null || latitud == null){
			return Response
					   .status(404)
					   .entity("Faltan los parametros de longitud y latitud").build();
		}
		
		POI poiMasCercano = new POI("Cafe los Angelitos",-34.6096435,-58.3983699);
		
		
		return Response
				   .status(200)
				   .entity(poiMasCercano.getJsonDescripcion()).build();
	}

}
