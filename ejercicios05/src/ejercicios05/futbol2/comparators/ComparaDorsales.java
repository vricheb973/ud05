package ejercicios05.futbol2.comparators;

import java.util.Comparator;

import ejercicios05.futbol2.Futbolista;

public class ComparaDorsales implements Comparator<Futbolista> {

	@Override
	//							this			  o
	public int compare(Futbolista o1, Futbolista o2) {
		return Integer.compare(o1.getDorsal(), o2.getDorsal());
	}

}
