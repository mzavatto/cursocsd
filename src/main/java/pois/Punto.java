package pois;

public class Punto {

	private Double latitud;
	private Double longitud;

	public Punto(Double latitud, Double longitud) {
	
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public Double getLatitud() {
		return latitud;
	}

	public Double getLongitud() {
		return longitud;
	}
}
