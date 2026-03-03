package unidad05.ejemplos.ordenar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		// 1. DEFINICIÓN DE LA LISTA
		List<Jugador> listaJugadores = new ArrayList<>();
		// Jugadores del Real Betis
		Jugador b1 = new Jugador("Isco Alarcón", 22, "Real Betis", LocalDate.of(1992, 4, 21));
		Jugador b2 = new Jugador("Giovani Lo Celso", 20, "Real Betis", LocalDate.of(1996, 4, 9));
		Jugador b3 = new Jugador("Marc Bartra", 5, "Real Betis", LocalDate.of(1991, 1, 15));

		// Jugadores del Sevilla FC
		Jugador s1 = new Jugador("Jesús Navas", 16, "Sevilla FC", LocalDate.of(1985, 11, 21));
		Jugador s2 = new Jugador("Loïc Badé", 22, "Sevilla FC", LocalDate.of(2000, 4, 11));
		Jugador s3 = new Jugador("Dodi Lukebakio", 11, "Sevilla FC", LocalDate.of(1997, 9, 24));

		// Otros equipos
		Jugador rm1 = new Jugador("Kylian Mbappé", 9, "Real Madrid", LocalDate.of(1998, 12, 20));
		Jugador rm2 = new Jugador("Lamine Yamal", 19, "FC Barcelona", LocalDate.of(2007, 7, 13));
		Jugador am1 = new Jugador("Antoine Griezmann", 7, "Atlético de Madrid", LocalDate.of(1991, 3, 21));
		Jugador ath1 = new Jugador("Nico Williams", 11, "Athletic Club", LocalDate.of(2002, 7, 12));
		Jugador g1 = new Jugador("Bryan Gil", 21, "Girona FC", LocalDate.of(2001, 2, 11));

		// 3. INSERCIÓN EN LA LISTA
		listaJugadores.add(b1);
		listaJugadores.add(b2);
		listaJugadores.add(b3);

		listaJugadores.add(s1);
		listaJugadores.add(s2);
		listaJugadores.add(s3);

		listaJugadores.add(rm1);
		listaJugadores.add(rm2);

		listaJugadores.add(ath1);
		listaJugadores.add(g1);

		listaJugadores.add(am1);

		for (Jugador j : listaJugadores) {
			System.out.println(j);
		}

		Collections.sort(listaJugadores);
		System.out.println("--------------------------------------------------------------------");
		
		
		for (Jugador j : listaJugadores) {
			System.out.println(j);
		}
		
		ComparaNombres cN = new ComparaNombres();
		
		Collections.sort(listaJugadores, cN.reversed());

		System.out.println("--------------------------------------------------------------------");
		
		for (Jugador j : listaJugadores) {
			System.out.println(j);
		}
		
		Collections.sort(listaJugadores, (new ComparaEdades()).reversed());

		System.out.println("--------------------------------------------------------------------");
		
		for (Jugador j : listaJugadores) {
			System.out.println(j);
		}
	}

}
