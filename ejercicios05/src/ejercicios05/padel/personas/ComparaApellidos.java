package ejercicios05.padel.personas;

import java.util.Comparator;

public class ComparaApellidos implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return o2.getApellidos().compareTo(o1.getApellidos());
	}

}
