package modelo;

public class Equipo {
	private String nombre;
	private String codigoPais;
	
	public Equipo(String nombre, String codigoPais) {
		super();
		this.nombre = nombre;
		this.codigoPais = codigoPais;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	

     public String getCodigoPais() {
		return codigoPais;
	}
     
     @Override
 	public String toString() {
 		return nombre;
 	}
	

}
