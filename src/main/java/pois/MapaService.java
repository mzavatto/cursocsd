package pois;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapaService {

	private Map<String,Mapa> mapas = new HashMap<String, Mapa>();
	
	public MapaService(){
		Mapa mapaCafeterias = new Mapa("cafeterias");
		mapaCafeterias.addPOI(new POI("Cafe los Angelitos", -34.6096435,-58.3983699));
		this.mapas.put(mapaCafeterias.getNombre(),mapaCafeterias );
	}
	
	

	public List<POI> getListaDePOIS(String nombreMapa) {
		return this.mapas.get(nombreMapa).getLista();
	}

}
