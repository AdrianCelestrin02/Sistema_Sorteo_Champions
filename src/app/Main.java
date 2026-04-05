/**
 * @author Adrián Celestrín y Camila Lorenzo
 */
package app;

import modelo.*;

public class Main {
  public static void main(String[] args) {
	  Sorteo s = new Sorteo();

		s.llenarBombos();
		s.inicializar();
		s.comenzarSorteo();

		s.mostrarTodo();
	
}
}
