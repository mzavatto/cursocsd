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
		Punto miUbicacion = new Punto(-34.6095668,-58.3981758);
		POI cafeLosAngelitos = new POI("Cafe Los Angelitos", -34.6096435, -58.3983699);
		
		/* Operacion */
		Double distanciaObtenida = administradorDePOIS.obtenerDistanciaEntreUnPuntoYUnPOI(miUbicacion, cafeLosAngelitos);
		
		/* Comprobacion */
		Double distanciaEsperada = 19.704947060553895;
		Assert.assertEquals(distanciaEsperada, distanciaObtenida);		
	}
}
