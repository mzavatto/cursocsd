package pois;

import static org.junit.Assert.*;

import org.junit.Test;

public class POITest {

	@Test
	public void testGetDescripcionMeDevuelvaUnJson() {
		POI poi = new POI("Cafe los Angelitos", -34.6096435,-58.3983699);
		String jsonDescription = poi.getJsonDescripcion();
		assertEquals("{\"nombre\":\"Cafe los Angelitos\",\"longitud\":\"-58.3983699\",\"latitud\":\"-34.6096435\"}", jsonDescription);
		
	}

}
