package ejercicios05.futbol.jugadores.centrocampistas;

import ejercicios05.futbol.jugadores.Jugador;

public abstract class Centrocampista extends Jugador {
	
	private int pasesCompletados;

	public Centrocampista(String nombre, int dorsal, String equipo, int pasesCompletados) {
		super(nombre, dorsal, equipo);
		this.pasesCompletados = pasesCompletados;
	}

	public int getPasesCompletados() {
		return pasesCompletados;
	}

	public void setPasesCompletados(int pasesCompletados) {
		this.pasesCompletados = pasesCompletados;
	}

	@Override
	public String toString() {
		return String.format("Centrocampista [nombre= %s, dorsal= %d, equipo= %s, pasesCompletados= %d]", this.getNombre(), this.getDorsal(), this.getEquipo(), this.pasesCompletados);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Centrocampista other = (Centrocampista) obj;
		
		return super.equals(obj) && this.pasesCompletados == other.pasesCompletados;
	}
	
	

}
