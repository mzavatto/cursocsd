package pois;

import java.util.HashMap;
import java.util.LinkedList;
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
		if(this.mapas.get(nombreMapa) != null){
			return this.mapas.get(nombreMapa).getLista();	
		}
		return new LinkedList<POI>();
		
	}

}
