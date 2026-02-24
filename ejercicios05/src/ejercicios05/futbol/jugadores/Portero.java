package ejercicios05.futbol.jugadores;

public class Portero extends Jugador {
	
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
	public void mostrarDatos() {
		System.out.println(this.toString());		
	}
	
}
