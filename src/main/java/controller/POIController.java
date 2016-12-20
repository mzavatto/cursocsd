package controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import pois.AdministradorDePOIS;
import pois.MapaService;
import pois.POI;
import pois.Punto;

@Path("/")
public class POIController {
	
	
	private MapaService mapaService = new MapaService();
	
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
		
		List<POI> listaPoi = mapaService.getListaDePOIS(mapaNombre);
		AdministradorDePOIS administradorPOIS = new AdministradorDePOIS();
		
		
		POI poiMasCercano = administradorPOIS.obtenerPOIMasCercano(new Punto(latitud, longitud), listaPoi);
		
		
		return Response
				   .status(200)
				   .entity(poiMasCercano.getJsonDescripcion()).build();
	}

}
