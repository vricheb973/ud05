package unidad05.diapositivas.persona;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Persona("Jose", 56, 2.03);		
		Empleado e1 = new Empleado("Manuel", 43, 1.80, 2000.0);
		Jefe j1 = new Jefe("Pablo", 34, 1.70, "DIRECTOR");
		
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(p1); //0
		personas.add(e1); //1
		personas.add(j1); //2

		Persona p2 = e1;
		
		Empleado e2 = (Empleado) p2;
		
		
		for(Persona p : personas) {
			p.mostrarDatos();
		
		}
		
		
	}

}
