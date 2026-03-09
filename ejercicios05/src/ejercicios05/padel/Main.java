package ejercicios05.padel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ejercicios05.padel.personas.ComparaApellidos;
import ejercicios05.padel.personas.Jugador;
import ejercicios05.padel.personas.Profesional;

public class Main {

	public static void main(String[] args) {
		
		// 1. Creamos la lista para almacenar los objetos
        List<Jugador> listaProfesionales = new ArrayList<>();

        // 2. Creamos los 5 objetos y los añadimos a la lista
        listaProfesionales.add(new Profesional("Juan", "Lebrón", "12345678A", 101, "Remate"));
        listaProfesionales.add(new Profesional("Alejandro", "Galán", "87654321B", 102, "Volea de revés"));
        listaProfesionales.add(new Profesional("Paquito", "Navarro", "11223344C", 103, "Cuchilla"));
        listaProfesionales.add(new Profesional("Arturo", "Coello", "55667788D", 104, "Potencia"));
        listaProfesionales.add(new Profesional("Arturo", "Tapia", "99001122E", 105, "Creatividad/Reflejos"));

        // 3. Mostramos los datos para verificar
        System.out.println("--- Lista de Jugadores Profesionales ---");
        for (Jugador p : listaProfesionales) {
            System.out.println(p);
        }
        
        Collections.sort(listaProfesionales, new ComparaApellidos());
        
        System.out.println("--- Lista de Jugadores Profesionales ---");
        for (Jugador p : listaProfesionales) {
            System.out.println(p);
        }

	}

}
