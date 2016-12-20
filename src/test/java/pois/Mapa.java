package pois;

import java.util.LinkedList;
import java.util.List;

public class Mapa {

	private String nombre;
	private List<POI> listPoi;

	public Mapa(String nombre) {
		this.nombre = nombre;
		this.listPoi = new LinkedList<POI>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void addPOI(POI poi) {
		this.listPoi.add(poi);
	}

	public List<POI> getLista() {
		return this.listPoi;
	}

}
