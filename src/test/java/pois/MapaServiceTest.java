package pois;

import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class MapaServiceTest {

	@Test
	public void meDevuelveUnaListaDePOISSiExisteElMapa() {
		MapaService mapaService = new MapaService();
		List<POI> listaPOIS = mapaService.getListaDePOIS("cafeterias");
		Assert.assertTrue(!listaPOIS.isEmpty());
	}

}
