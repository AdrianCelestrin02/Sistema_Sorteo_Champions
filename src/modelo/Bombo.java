package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Bombo {
	private ArrayList<Equipo> bombo;
	
	public Bombo() {
		this.bombo=new ArrayList<Equipo>();
	}
	
	public void añadirEquipo(Equipo e) {
		bombo.add(e);
	}
	
	
	public Equipo[] elegir2Equipos(Equipo e) {
		Equipo[] equiposElegidos=new Equipo[2];
		List<Equipo>listaAuxiliar=new ArrayList<Equipo>();
		listaAuxiliar.addAll(this.bombo);
		listaAuxiliar.remove(e);
		
		Iterator<Equipo> it = listaAuxiliar.iterator();

        while (it.hasNext()) {
            Equipo eq = it.next();
            
            if(eq.getCodigoPais().equals(e.getCodigoPais())) {
            	it.remove();
            }
        }
		
		Collections.shuffle(listaAuxiliar);
		equiposElegidos[0]=listaAuxiliar.get(0);
		equiposElegidos[1]=listaAuxiliar.get(1);
		
		
		return equiposElegidos;
	}

	public ArrayList<Equipo> getBombo() {
		return bombo;
	}
	
	public boolean verifcarEquipoenBombo(Equipo e) {
		if(bombo.contains(e)) {
			return true;
		}
		return false;
	}

}
