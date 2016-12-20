package pois;

import org.junit.Test;

import junit.framework.Assert;

public class MapaTest {

	@Test
	public void conNombreYListadoDePOIS() {
		Mapa mapa = new Mapa("Cafeterias");
		mapa.addPOI(new POI("Cafe los Angelitos", -34.6096435,-58.3983699));
		Assert.assertEquals("Cafeterias", mapa.getNombre());
		Assert.assertTrue(!mapa.getLista().isEmpty());
		
	}

}
