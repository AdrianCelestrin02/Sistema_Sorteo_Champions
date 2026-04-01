package modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class Sorteo {
	private Bombo bombo1=new Bombo();
	private Bombo bombo2=new Bombo();
	private Bombo bombo3=new Bombo();
	private Bombo bombo4=new Bombo();
	private HashMap<Equipo,ArrayList<Equipo>> estructuraRivales=new HashMap<Equipo,ArrayList<Equipo>>();
	
     public Sorteo() {
		
	};
	
	public void mostrarSorteoBombo1() {
		for(Equipo e:estructuraRivales.keySet()) {
			if(bombo1.verifcarEquipoenBombo(e)) {
				System.out.println(e+"-> "+estructuraRivales.get(e));
				System.out.println("---------------");
			}
		}
	}
	
	public void mostrarSorteoBombo2() {
		for(Equipo e:estructuraRivales.keySet()) {
			if(bombo2.verifcarEquipoenBombo(e)) {
				System.out.println(e+"-> "+estructuraRivales.get(e));
				System.out.println("---------------");
			}
		}
	}
	
	public void mostrarSorteoBombo3() {
		for(Equipo e:estructuraRivales.keySet()) {
			if(bombo3.verifcarEquipoenBombo(e)) {
				System.out.println(e+"-> "+estructuraRivales.get(e));
				System.out.println("---------------");
			}
		}
	}
	
	public void mostrarSorteoBombo4() {
		for(Equipo e:estructuraRivales.keySet()) {
			if(bombo4.verifcarEquipoenBombo(e)) {
				System.out.println(e+"-> "+estructuraRivales.get(e));
				System.out.println("---------------");
			}
		}
	}
	
	
	public void comenzarSorteoBombo1() {
		for(Equipo e:bombo1.getBombo()) {
			Equipo [] equiposElegidosB1=bombo1.elegir2Equipos(e);
			Equipo [] equiposElegidosB2=bombo2.elegir2Equipos(e);
			Equipo [] equiposElegidosB3=bombo3.elegir2Equipos(e);
			Equipo [] equiposElegidosB4=bombo4.elegir2Equipos(e);
			
			
			estructuraRivales.get(e).add(equiposElegidosB1[0]);
			estructuraRivales.get(e).add(equiposElegidosB1[1]);
			estructuraRivales.get(e).add(equiposElegidosB2[0]);
			estructuraRivales.get(e).add(equiposElegidosB2[1]);
			estructuraRivales.get(e).add(equiposElegidosB3[0]);
			estructuraRivales.get(e).add(equiposElegidosB3[1]);
			estructuraRivales.get(e).add(equiposElegidosB4[0]);
			estructuraRivales.get(e).add(equiposElegidosB4[1]);
			
		}
	}
	
	public void comenzarSorteoBombo2() {
		for(Equipo e:bombo2.getBombo()) {
			Equipo [] equiposElegidosB1=bombo1.elegir2Equipos(e);
			Equipo [] equiposElegidosB2=bombo2.elegir2Equipos(e);
			Equipo [] equiposElegidosB3=bombo3.elegir2Equipos(e);
			Equipo [] equiposElegidosB4=bombo4.elegir2Equipos(e);
			
			
			estructuraRivales.get(e).add(equiposElegidosB1[0]);
			estructuraRivales.get(e).add(equiposElegidosB1[1]);
			estructuraRivales.get(e).add(equiposElegidosB2[0]);
			estructuraRivales.get(e).add(equiposElegidosB2[1]);
			estructuraRivales.get(e).add(equiposElegidosB3[0]);
			estructuraRivales.get(e).add(equiposElegidosB3[1]);
			estructuraRivales.get(e).add(equiposElegidosB4[0]);
			estructuraRivales.get(e).add(equiposElegidosB4[1]);
			
		}
	}
	
	public void comenzarSorteoBombo3() {
		for(Equipo e:bombo3.getBombo()) {
			Equipo [] equiposElegidosB1=bombo1.elegir2Equipos(e);
			Equipo [] equiposElegidosB2=bombo2.elegir2Equipos(e);
			Equipo [] equiposElegidosB3=bombo3.elegir2Equipos(e);
			Equipo [] equiposElegidosB4=bombo4.elegir2Equipos(e);
			
			
			estructuraRivales.get(e).add(equiposElegidosB1[0]);
			estructuraRivales.get(e).add(equiposElegidosB1[1]);
			estructuraRivales.get(e).add(equiposElegidosB2[0]);
			estructuraRivales.get(e).add(equiposElegidosB2[1]);
			estructuraRivales.get(e).add(equiposElegidosB3[0]);
			estructuraRivales.get(e).add(equiposElegidosB3[1]);
			estructuraRivales.get(e).add(equiposElegidosB4[0]);
			estructuraRivales.get(e).add(equiposElegidosB4[1]);
			
		}
	}
	
	public void comenzarSorteoBombo4() {
		for(Equipo e:bombo4.getBombo()) {
			Equipo [] equiposElegidosB1=bombo1.elegir2Equipos(e);
			Equipo [] equiposElegidosB2=bombo2.elegir2Equipos(e);
			Equipo [] equiposElegidosB3=bombo3.elegir2Equipos(e);
			Equipo [] equiposElegidosB4=bombo4.elegir2Equipos(e);
			
			
			estructuraRivales.get(e).add(equiposElegidosB1[0]);
			estructuraRivales.get(e).add(equiposElegidosB1[1]);
			estructuraRivales.get(e).add(equiposElegidosB2[0]);
			estructuraRivales.get(e).add(equiposElegidosB2[1]);
			estructuraRivales.get(e).add(equiposElegidosB3[0]);
			estructuraRivales.get(e).add(equiposElegidosB3[1]);
			estructuraRivales.get(e).add(equiposElegidosB4[0]);
			estructuraRivales.get(e).add(equiposElegidosB4[1]);
			
		}
	}
	
	public void inicializarestructuraRivales() {
		for(Equipo e: bombo1.getBombo()) {
			estructuraRivales.put(e, new ArrayList<Equipo>());
		}
		
		for(Equipo e: bombo2.getBombo()) {
			estructuraRivales.put(e, new ArrayList<Equipo>());
		}
		
		for(Equipo e: bombo3.getBombo()) {
			estructuraRivales.put(e, new ArrayList<Equipo>());
		}
		
		for(Equipo e: bombo4.getBombo()) {
			estructuraRivales.put(e, new ArrayList<Equipo>());
		}
	}
	
	public void llenarBombos() {
		bombo1.añadirEquipo(new Equipo("Paris Saint-Germain","FRA"));
		bombo1.añadirEquipo(new Equipo("Real Madrid","ESP"));
		bombo1.añadirEquipo(new Equipo("Manchester City","ENG"));
		bombo1.añadirEquipo(new Equipo("Bayern München","GER"));
		bombo1.añadirEquipo(new Equipo("Liverpool","ENG"));
		bombo1.añadirEquipo(new Equipo("Inter","ITA"));
		bombo1.añadirEquipo(new Equipo("Chelsea","ENG"));
		bombo1.añadirEquipo(new Equipo("Borussia Dortmund","GER"));
		bombo1.añadirEquipo(new Equipo("FC Barcelona","ESP"));
		
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
