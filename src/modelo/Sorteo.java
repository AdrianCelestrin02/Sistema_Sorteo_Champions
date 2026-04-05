/**
 * @author Adrián Celestrín y Camila Lorenzo
 */
package modelo;

import java.util.*;

public class Sorteo {
    
	//Instanciamos atributos de tipo bombo, uno por cada bombo que sortearemos
	private Bombo bombo1 = new Bombo();
	private Bombo bombo2 = new Bombo();
	private Bombo bombo3 = new Bombo();
	private Bombo bombo4 = new Bombo();
    
	//Estructura de datos elegida para guardar los resultados del Sorteo
	private HashMap<Equipo, HashSet<Equipo>> estructuraRivales = new HashMap<>();

	public void inicializar() {
		for (Equipo e : getTodosEquipos()) {
			estructuraRivales.put(e, new HashSet<>());
		}
	}
    
	//Obtener todos los equipos participantes
	private List<Equipo> getTodosEquipos() {
		List<Equipo> todos = new ArrayList<>();
		todos.addAll(bombo1.getBombo());
		todos.addAll(bombo2.getBombo());
		todos.addAll(bombo3.getBombo());
		todos.addAll(bombo4.getBombo());
		return todos;
	}

	// METODO PRINCIPAL
	public void comenzarSorteo() {

		int intentos = 0;
		boolean completo = false;

		while (!completo && intentos < 2000) {

			intentos++;

			// limpiar
			for (Equipo e : estructuraRivales.keySet()) {
				estructuraRivales.get(e).clear();
			}

			emparejar(bombo1, bombo1);
			emparejar(bombo1, bombo2);
			emparejar(bombo1, bombo3);
			emparejar(bombo1, bombo4);

			emparejar(bombo2, bombo2);
			emparejar(bombo2, bombo3);
			emparejar(bombo2, bombo4);

			emparejar(bombo3, bombo3);
			emparejar(bombo3, bombo4);

			emparejar(bombo4, bombo4);

			completo = esCompleto();
		}

		if (completo) {
			System.out.println("✅ Sorteo correcto en " + intentos + " intentos");
		} else {
			System.out.println("❌ No se pudo completar el sorteo");
		}
	}

	// -------- EMPAREJAR --------

	private void emparejar(Bombo b1, Bombo b2) {

		ArrayList<Equipo> lista1 = new ArrayList<>(b1.getBombo());
		ArrayList<Equipo> lista2 = new ArrayList<>(b2.getBombo());

		Collections.shuffle(lista1);
		Collections.shuffle(lista2);

		for (Equipo e1 : lista1) {

			int intentos = 0;

			while (contarRivalesDeBombo(e1, b2) < 2 && intentos < 100) {

				Equipo e2 = lista2.get(new Random().nextInt(lista2.size()));

				añadirRival(e1, e2, b2);

				intentos++;
			}
		}
	}

	// -------- AÑADIR RIVAL --------

	private boolean añadirRival(Equipo e1, Equipo e2, Bombo b2) {

		if (e1.equals(e2)) return false;

		if (e1.getCodigoPais().equals(e2.getCodigoPais())) return false;

		if (estructuraRivales.get(e1).contains(e2)) return false;

		if (contarRivalesDeBombo(e1, b2) >= 2) return false;

		estructuraRivales.get(e1).add(e2);
		estructuraRivales.get(e2).add(e1);

		return true;
	}

	// -------- CONTAR RIVALES POR BOMBO --------

	private int contarRivalesDeBombo(Equipo e, Bombo b) {

		int count = 0;

		for (Equipo rival : estructuraRivales.get(e)) {
			if (b.getBombo().contains(rival)) {
				count++;
			}
		}

		return count;
	}

	// -------- COMPROBAR SI ESTÁ BIEN --------

	private boolean esCompleto() {

		for (Equipo e : estructuraRivales.keySet()) {

			if (contarRivalesDeBombo(e, bombo1) != 2) return false;
			if (contarRivalesDeBombo(e, bombo2) != 2) return false;
			if (contarRivalesDeBombo(e, bombo3) != 2) return false;
			if (contarRivalesDeBombo(e, bombo4) != 2) return false;
		}

		return true;
	}

	// -------- MOSTRAR --------

	public void mostrarTodo() {
		for (Equipo e : estructuraRivales.keySet()) {
			System.out.println(e + " -> " + estructuraRivales.get(e));
			System.out.println("---------------");
		}
	}

	// -------- LLENAR BOMBOS --------

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

		bombo2.añadirEquipo(new Equipo("Arsenal","ENG"));
		bombo2.añadirEquipo(new Equipo("Bayer Leverkusen","GER")); 
		bombo2.añadirEquipo(new Equipo("Atlético de Madrid","ESP")); 
		bombo2.añadirEquipo(new Equipo("Benfica","POR"));
		bombo2.añadirEquipo(new Equipo("Atalanta","ITA")); 
		bombo2.añadirEquipo(new Equipo("Villarreal","ESP"));
		bombo2.añadirEquipo(new Equipo("Juventus","ITA"));
		bombo2.añadirEquipo(new Equipo("Eintracht Frankfurt","GER")); 
		bombo2.añadirEquipo(new Equipo("Club Brugge","BEL")); 

		bombo3.añadirEquipo(new Equipo("Tottenham Hotspur","ENG")); 
		bombo3.añadirEquipo(new Equipo("PSV Eindhoven","NED")); 
		bombo3.añadirEquipo(new Equipo("Ajax","NED")); 
		bombo3.añadirEquipo(new Equipo("Napoli","ITA"));
		bombo3.añadirEquipo(new Equipo("Sporting CP","POR"));
		bombo3.añadirEquipo(new Equipo("Olympiacos","GRE")); 
		bombo3.añadirEquipo(new Equipo("Slavia Prague","CZE")); 
		bombo3.añadirEquipo(new Equipo("Bodø/Glimt","NOR"));
		bombo3.añadirEquipo(new Equipo("Olympique Marseille","FRA"));

		bombo4.añadirEquipo(new Equipo("Copenhagen","DEN"));
		bombo4.añadirEquipo(new Equipo("Monaco","FRA")); 
		bombo4.añadirEquipo(new Equipo("Galatasaray","TUR")); 
		bombo4.añadirEquipo(new Equipo("Union Saint-Gilloise","BEL")); 
		bombo4.añadirEquipo(new Equipo("Qarabağ","AZE")); 
		bombo4.añadirEquipo(new Equipo("Athletic Club","ESP")); 
		bombo4.añadirEquipo(new Equipo("Newcastle United","ENG")); 
		bombo4.añadirEquipo(new Equipo("Pafos","CYP")); 
		bombo4.añadirEquipo(new Equipo("Kairat Almaty","KAZ"));
	}
}