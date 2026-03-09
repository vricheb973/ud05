package ejercicios05.futbol2;

public class Delantero extends Futbolista implements Comparable<Delantero> {

	private int goles;

	public Delantero(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo);
		this.goles = goles;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	@Override
	public String toString() {
		return String.format("Delantero [nombre= %s, dorsal= %d, equipo= %s, goles= %d]", this.getNombre(), this.getDorsal(), this.getEquipo(), this.goles);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Delantero other = (Delantero) obj;
		return super.equals(obj) && this.goles == other.goles;
	}

	@Override
	public int compareTo(Delantero o) {
		return Integer.compare(o.goles, this.goles);
	}
	
	

}
