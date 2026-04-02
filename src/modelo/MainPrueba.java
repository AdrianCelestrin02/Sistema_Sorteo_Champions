package modelo;

public class MainPrueba {

	public static void main(String[] args) {
		Sorteo s = new Sorteo();

		s.llenarBombos();
		s.inicializarestructuraRivales();

		s.comenzarSorteo();

		s.mostrarSorteoBombo1();
	}
}
