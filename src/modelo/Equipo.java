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
     
  // 🔥 NECESARIO PARA QUE HashMap FUNCIONE BIEN
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
