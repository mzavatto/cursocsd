package pois;

public class POI {

	private String nombre;
	private Double latitud;
	private Double longitud;
	
	public POI(String nombre, double latitud, double longitud) {
		
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public POI() {
	}

	public Double getLatitud() {
		return latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public String getNombre() {
		return nombre;
	}

	public String getJsonDescripcion() {
		return "{\"nombre\":\""+this.nombre+"\",\"longitud\":\""+this.longitud.toString()+"\",\"latitud\":\""+this.latitud.toString()+"\"}";
	}
}
