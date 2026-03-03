package unidad05.ejemplos.ordenar;

import java.util.Comparator;

public class ComparaEdades implements Comparator<Jugador> {

	@Override
	public int compare(Jugador o1, Jugador o2) {
		return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
	}

}
