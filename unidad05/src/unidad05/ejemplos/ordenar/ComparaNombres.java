package unidad05.ejemplos.ordenar;

import java.util.Comparator;

public class ComparaNombres implements Comparator<Jugador> {

	@Override
	public int compare(Jugador o1, Jugador o2) {
		int result = o2.getNombre().compareTo(o1.getNombre());
		
		if(result == 0) {
			result = Integer.compare(o2.getDorsal(), o1.getDorsal());
		}
		
		return result;
	}

}
