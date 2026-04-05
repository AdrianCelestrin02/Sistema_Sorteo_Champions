/**
 * @author Adrián Celestrín y Camila Lorenzo
 */

package modelo;

public class Equipo {
	//ATRIBUTOS
	private String nombre;
	private String codigoPais;
	
	/**
	 * 
	 * @param nombre
	 * @param codigoPais
	 */
	public Equipo(String nombre, String codigoPais) {
		super();
		this.nombre = nombre;
		this.codigoPais = codigoPais;
	}
	
	/**
	 * 
	 * @return nombre del Equipo
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * @return código del Pís
	 */
     public String getCodigoPais() {
		return codigoPais;
	}
     
     @Override
 	public String toString() {
 		return nombre;
 	}
     
 	@Override
 	public boolean equals(Object obj) {
 		if (this == obj) return true;
 		if (obj == null || getClass() != obj.getClass()) return false;
 		Equipo equipo = (Equipo) obj;
 		return nombre.equals(equipo.nombre) && codigoPais.equals(equipo.codigoPais);
 	}

 	@Override
 	public int hashCode() {
 		return nombre.hashCode() + codigoPais.hashCode();
 	}
 
     
	

}
