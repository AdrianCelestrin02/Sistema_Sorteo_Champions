package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bombo {
	private ArrayList<Equipo> bombo;
	
	public Bombo() {
		this.bombo=new ArrayList<Equipo>();
	}
	
	public void añadirEquipo(Equipo e) {
		bombo.add(e);
	}
	
	@SuppressWarnings("null")
	public Equipo[] elegir2Equipos(Equipo e) {
		Equipo[] equiposElegidos = null;
		List<Equipo>listaAuxiliar=new ArrayList<Equipo>();
		listaAuxiliar.addAll(this.bombo);
		listaAuxiliar.remove(e);
		Collections.shuffle(listaAuxiliar);
		equiposElegidos[0]=listaAuxiliar.get(0);
		equiposElegidos[1]=listaAuxiliar.get(1);
		
		
		return equiposElegidos;
	}

}
