package ejercicios05.futbol2;

public class Defensa extends Futbolista implements Comparable<Defensa> {
	
	private double recuperaciones;

	public Defensa(String nombre, int dorsal, String equipo, double recuperaciones) {
		super(nombre, dorsal, equipo);
		this.recuperaciones = recuperaciones;
	}

	public double getRecuperaciones() {
		return recuperaciones;
	}

	public void setRecuperaciones(double recuperaciones) {
		this.recuperaciones = recuperaciones;
	}

	@Override
	public String toString() {
		return String.format("Defensa [nombre= %s, dorsal= %d, equipo= %s, recuperaciones= %.2f]", this.getNombre(), this.getDorsal(), this.getEquipo(), this.recuperaciones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Defensa other = (Defensa) obj;
		return super.equals(other) && this.recuperaciones == other.recuperaciones;				
	}

	
	//mayor a menor numero de recuperaciones
	@Override
	public int compareTo(Defensa o) {
		return Double.compare(o.recuperaciones, this.recuperaciones);
	}		

}
