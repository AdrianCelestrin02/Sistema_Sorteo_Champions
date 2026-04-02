package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sorteo {

	private Bombo bombo1 = new Bombo();
	private Bombo bombo2 = new Bombo();
	private Bombo bombo3 = new Bombo();
	private Bombo bombo4 = new Bombo();

	private HashMap<Equipo, HashSet<Equipo>> estructuraRivales = new HashMap<>();


	private HashSet<Equipo> equiposYaAsignados = new HashSet<>();

	public void inicializarestructuraRivales() {
		for (Equipo e : bombo1.getBombo()) {
			estructuraRivales.put(e, new HashSet<>());
		}
		for (Equipo e : bombo2.getBombo()) {
			estructuraRivales.put(e, new HashSet<>());
		}
		for (Equipo e : bombo3.getBombo()) {
			estructuraRivales.put(e, new HashSet<>());
		}
		for (Equipo e : bombo4.getBombo()) {
			estructuraRivales.put(e, new HashSet<>());
		}
	}

	// 🔥 MÉTODO GENÉRICO (evita repetir código)
	private void sorteoPorBombo(Bombo bombo) {
		for (Equipo e : bombo.getBombo()) {

			Equipo[] rivalesB1 = bombo1.elegir2Equipos(e);
			Equipo[] rivalesB2 = bombo2.elegir2Equipos(e);
			Equipo[] rivalesB3 = bombo3.elegir2Equipos(e);
			Equipo[] rivalesB4 = bombo4.elegir2Equipos(e);

			añadirRivales(e, rivalesB1);
			añadirRivales(e, rivalesB2);
			añadirRivales(e, rivalesB3);
			añadirRivales(e, rivalesB4);
		}
	}

	private void añadirRivales(Equipo e, Equipo[] rivales) {

		for (Equipo r : rivales) {

			if (!equiposYaAsignados.contains(r)) {

				estructuraRivales.get(e).add(r);
				estructuraRivales.get(r).add(e);

				equiposYaAsignados.add(r);
			}
		}
	}

	public void comenzarSorteo() {
		sorteoPorBombo(bombo1);
		sorteoPorBombo(bombo2);
		sorteoPorBombo(bombo3);
		sorteoPorBombo(bombo4);
	}

	// ----------- MOSTRAR --------------

	public void mostrarSorteoBombo1() {
		for (Equipo e : estructuraRivales.keySet()) {
			if (bombo1.verifcarEquipoenBombo(e)) {
				System.out.println(e + " -> " + estructuraRivales.get(e));
				System.out.println("---------------");
			}
		}
	}

	public void mostrarSorteoBombo2() {
		for (Equipo e : estructuraRivales.keySet()) {
			if (bombo2.verifcarEquipoenBombo(e)) {
				System.out.println(e + " -> " + estructuraRivales.get(e));
				System.out.println("---------------");
			}
		}
	}

	public void mostrarSorteoBombo3() {
		for (Equipo e : estructuraRivales.keySet()) {
			if (bombo3.verifcarEquipoenBombo(e)) {
				System.out.println(e + " -> " + estructuraRivales.get(e));
				System.out.println("---------------");
			}
		}
	}

	public void mostrarSorteoBombo4() {
		for (Equipo e : estructuraRivales.keySet()) {
			if (bombo4.verifcarEquipoenBombo(e)) {
				System.out.println(e + " -> " + estructuraRivales.get(e));
				System.out.println("---------------");
			}
		}
	}

	// ----------- LLENAR BOMBOS -----------

	public void llenarBombos() {
		bombo1.añadirEquipo(new Equipo("Paris Saint-Germain", "FRA"));
		bombo1.añadirEquipo(new Equipo("Real Madrid", "ESP"));
		bombo1.añadirEquipo(new Equipo("Manchester City", "ENG"));
		bombo1.añadirEquipo(new Equipo("Bayern München", "GER"));
		bombo1.añadirEquipo(new Equipo("Liverpool", "ENG"));
		bombo1.añadirEquipo(new Equipo("Inter", "ITA"));
		bombo1.añadirEquipo(new Equipo("Chelsea", "ENG"));
		bombo1.añadirEquipo(new Equipo("Borussia Dortmund", "GER"));
		bombo1.añadirEquipo(new Equipo("FC Barcelona", "ESP"));

	}
}