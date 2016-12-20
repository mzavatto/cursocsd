package pois;

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
		Punto miUbicacion = new Punto(100.0, 20.0);
		POI cafeLosAngelitos = new POI("Cafe Los Angelitos", 10.0, 20.0);
		
		/* Operacion */
		Double distanciaObtenida = administradorDePOIS.obtenerDistanciaEntreUnPuntoYUnPOI(miUbicacion, cafeLosAngelitos);
		
		/* Comprobacion */
		Double distanciaEsperada = 10007.543398010286;
		Assert.assertEquals(distanciaEsperada, distanciaObtenida);		
	}
}
