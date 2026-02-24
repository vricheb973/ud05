package unidad05.diapositivas.vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		vehiculos.add(new Bicicleta());
		vehiculos.add(new Avion());
		vehiculos.add(new Bicicleta());
		
		for(Vehiculo v : vehiculos) {
			v.desplazarse();
		}

	}

}
