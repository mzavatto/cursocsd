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
                client.resource("http://localhost:8080/pois/restorando/cafe/mascercano?long=-34.6095698&lat:-58.3989001");
        
    	ClientResponse response = webResource.accept("application/json")
                .get(ClientResponse.class);
    	
		String output = response.getEntity(String.class);
		
		assertEquals(200, response.getStatus());
        assertEquals("Cafe los angelitos", output);
        
    }

}
