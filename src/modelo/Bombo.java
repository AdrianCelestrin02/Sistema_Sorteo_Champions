/**
 * @author Adrián Celestrín y Camila Lorenzo
 */
package modelo;

import java.util.ArrayList;

public class Bombo {
	//ATROBUTO
	private ArrayList<Equipo> bombo;
	
	/**
	 * Método Constructor donde instanciamos el atributo bombo
	 */
	public Bombo() {
		this.bombo = new ArrayList<>();
	}
	
	/**
	 * 
	 * @param e
	 */
	public void añadirEquipo(Equipo e) {
		bombo.add(e);
	}
    
	/**
	 * 
	 * @return el bombo
	 */
	public ArrayList<Equipo> getBombo() {
		return bombo;
	}
	
	/**
	 * 
	 * @param e
	 * @return booleano
	 */
	public boolean verifcarEquipoenBombo(Equipo e) {
		return bombo.contains(e);
	}
}