package pois;
import static org.junit.Assert.assertEquals;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.junit.Test;

public class POISWebappIT {

    @SuppressWarnings("resource")
	@Test
    public void deberiaDevolverElPOIMasCercano() throws Exception {
        URL url = new URL("http://localhost:8080/pois/restorando/cafe/mascercano?long=-34.6095698&lat:-58.3989001");
        HttpURLConnection connection =  (HttpURLConnection) 
                                            url.openConnection();
        connection.connect();
        Scanner scanner = new Scanner(connection.getInputStream()).useDelimiter("\\A");
        String theString = scanner.hasNext() ? scanner.next() : "";
        assertEquals(200, connection.getResponseCode());
        assertEquals("Cafe los angelitos", theString);
        
    }

}
