package pois;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class POISWebappIT {

	@Test
    public void deberiaDevolverElPOIMasCercano() throws Exception {
        
		Client client = Client.create();
        WebResource webResource = 
                client.resource("http://localhost:8080/pois/restorando/cafeterias/mascercano?latitud=-34.60956981&longitud=-58.398900");
        
    	ClientResponse response = webResource.accept("application/json")
                .get(ClientResponse.class);
    	
		String output = response.getEntity(String.class);
		
		assertEquals(200, response.getStatus());
		assertEquals("{\"nombre\":\"Cafe los Angelitos\",\"longitud\":\"-58.3983699\",\"latitud\":\"-34.6096435\"}", output);
    }
	
	@Test
    public void deberiaDevolverError404SiFaltanParametros() throws Exception {
        
		/* Inicializacion */
		Client client = Client.create();
		WebResource webResource = 
                client.resource("http://localhost:8080/pois/restorando/cafe/mascercano");
        
		/* Operacion */
    	ClientResponse response = webResource.accept("application/json")
                .get(ClientResponse.class);

    	/* Operacion */
		assertEquals("Faltan los parametros de longitud y latitud",response.getEntity(String.class));
		assertEquals(404, response.getStatus());
        
    }
	
	@Test
    public void deberiaDevolverUnaListaVacia() throws Exception {
        
		Client client = Client.create();
        WebResource webResource = 
                client.resource("http://localhost:8080/pois/restorando/templobudista/mascercano?latitud=-34.60956981&longitud=-58.398900");
        
    	ClientResponse response = webResource.accept("application/json")
                .get(ClientResponse.class);
    	
		String output = response.getEntity(String.class);
		
		assertEquals(200, response.getStatus());
		assertEquals("", output);
    }
	
	

}
