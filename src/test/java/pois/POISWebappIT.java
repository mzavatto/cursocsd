package pois;
import static org.junit.Assert.assertEquals;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class POISWebappIT {

    @Test
    public void test() throws Exception {
        URL url = new URL("http://localhost:8080/pois/mascercano");
        HttpURLConnection connection =  (HttpURLConnection) 
                                            url.openConnection();
        connection.connect();
        assertEquals(200, connection.getResponseCode()); 
    }

}
