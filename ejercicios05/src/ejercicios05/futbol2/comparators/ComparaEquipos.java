package ejercicios05.futbol2.comparators;

import java.util.Comparator;

import ejercicios05.futbol2.Futbolista;

public class ComparaEquipos implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		return o1.getEquipo().compareTo(o2.getEquipo());
	}

}
