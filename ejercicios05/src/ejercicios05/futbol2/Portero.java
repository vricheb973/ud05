package ejercicios05.futbol2;

public class Portero extends Futbolista implements Comparable<Portero> {
	
	private int paradas;

	public Portero(String nombre, int dorsal, String equipo, int paradas) {
		super(nombre, dorsal, equipo);
		this.paradas = paradas;
	}

	public int getParadas() {
		return paradas;
	}

	public void setParadas(int paradas) {
		this.paradas = paradas;
	}

	@Override
	public String toString() {
		return String.format("Portero [nombre= %s, dorsal= %d, equipo= %s, paradas= %d]", this.getNombre(), this.getDorsal(), this.getEquipo(), this.paradas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Portero other = (Portero) obj;
		return super.equals(other) && this.paradas == other.paradas;
	}

	@Override
	public int compareTo(Portero o) {
		return Integer.compare(this.paradas, o.paradas);
	}
	
}
