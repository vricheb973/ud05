package unidad05.ejemplos.interfaces;

public class Perro extends Animal implements Sonido {

	@Override
	public void sonido() {
		System.out.println("GUAU!!!");
	}


}
