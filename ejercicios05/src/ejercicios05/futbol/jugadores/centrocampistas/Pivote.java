package ejercicios05.futbol.jugadores.centrocampistas;

public class Pivote extends Centrocampista {
	
	private int intercepciones;

	public Pivote(String nombre, int dorsal, String equipo, int pasesCompletados, int intercepciones) {
		super(nombre, dorsal, equipo, pasesCompletados);
		this.intercepciones = intercepciones;
	}

	public int getIntercepciones() {
		return intercepciones;
	}

	public void setIntercepciones(int intercepciones) {
		this.intercepciones = intercepciones;
	}

	@Override
	public String toString() {
		return String.format("Pivote [nombre= %s, dorsal= %d, equipo= %s, pasesCompletados= %d, intercepciones= %d]", this.getNombre(), this.getDorsal(), this.getEquipo(), this.getPasesCompletados(), this.intercepciones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Pivote other = (Pivote) obj;

		return super.equals(obj) && this.intercepciones == other.intercepciones;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}

}
