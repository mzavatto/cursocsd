package pois;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdministradorDePOISTest {

	private AdministradorDePOIS administradorDePOIS;
	
	@Before
	public void inicializacion() {
	
		administradorDePOIS = new AdministradorDePOIS();
	}
	
	@Test
	public void deberiaDevolverLaDistanciaEntreUnPuntoYUnPOI() {
		
		/* Inicializacion */
		Punto miUbicacion = new Punto(-34.6095668,-58.3981758);
		POI cafeLosAngelitos = new POI("Cafe Los Angelitos", -34.6096435, -58.3983699);
		
		/* Operacion */
		Double distanciaObtenida = administradorDePOIS.obtenerDistanciaEntreUnPuntoYUnPOI(miUbicacion, cafeLosAngelitos);
		
		/* Comprobacion */
		Double distanciaEsperada = 19.704947060553895;
		Assert.assertEquals(distanciaEsperada, distanciaObtenida);		
	}
	
	@Test
	public void dadaUnaListaDePOISdeberiaDevolverElPOIMasCercano() {
		
		/* Inicializacion */
		Punto miUbicacion = new Punto(-34.6095668,-58.3981758);
		List<POI> listaDePOIS = new ArrayList<POI>();
		
		listaDePOIS.add(new POI("MC Donalds", -34.6089664,-58.3973174));
		listaDePOIS.add(new POI("Subway", -34.6095274,-58.3944184));
		listaDePOIS.add(new POI("Cafe Los Angelitos", -34.6096435, -58.3983699));

		/* Operacion */
		POI poiMasCercano = administradorDePOIS.obtenerPOIMasCercano(miUbicacion, listaDePOIS);
		
		/* Comprobacion */
		Assert.assertEquals(poiMasCercano.getNombre(), "Cafe Los Angelitos");		
	}
	
}
