package pois;

public class AdministradorDePOIS {

	private static final Double RADIO_TIERRA_METROS = 6371d;

	public Double obtenerDistanciaEntreUnPuntoYUnPOI(Punto miUbicacion, POI poi) {
		
		Double distancia = calcularDistancia(miUbicacion.getLatitud(), miUbicacion.getLongitud(),
				poi.getLatitud(), poi.getLongitud());
		
		return distancia;
	}
	
    public Double calcularDistancia(Double latitudPunto, Double longitudPunto,
    								Double latitud, Double longitud) {

    	Double lat1R = Math.toRadians(latitudPunto);
        Double lat2R = Math.toRadians(latitud.doubleValue());
        Double dLatR = Math.abs(lat2R - lat1R);
        Double dLngR = Math.abs(Math.toRadians(longitudPunto - longitud.doubleValue()));
        Double a = Math.sin(dLatR / 2) * Math.sin(dLatR / 2) + Math.cos(lat1R)
                * Math.cos(lat2R) * Math.sin(dLngR / 2) * Math.sin(dLngR / 2);
        Double distancia = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a)) * RADIO_TIERRA_METROS;
        
        return distancia;
        
    }

}