package ejercicios05.futbol2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ejercicios05.futbol2.comparators.ComparaDorsales;
import ejercicios05.futbol2.comparators.ComparaEquipos;

public class Main {

	public static void main(String[] args) {
		
		Delantero f1 = new Delantero("Manolo", 12, "Betis", 10);
		Delantero f2 = new Delantero("pepe", 43, "Sevilla", 20);
		
		List<Delantero> delanteros = new ArrayList<Delantero>();
		delanteros.add(f1);
		delanteros.add(f2);
		
		System.out.println(delanteros);

		Collections.sort(delanteros,new ComparaDorsales());
		
		System.out.println(delanteros);
		

	}

}
