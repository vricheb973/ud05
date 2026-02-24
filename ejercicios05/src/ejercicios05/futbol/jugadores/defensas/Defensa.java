package ejercicios05.futbol.jugadores.defensas;

import ejercicios05.futbol.jugadores.Jugador;

public abstract class Defensa extends Jugador {
	
	private int disputasRealizadas;

	public Defensa(String nombre, int dorsal, String equipo, int disputasRealizadas) {
		super(nombre, dorsal, equipo);
		this.disputasRealizadas = disputasRealizadas;
	}

	public int getDisputasRealizadas() {
		return disputasRealizadas;
	}

	public void setDisputasRealizadas(int disputasRealizadas) {
		this.disputasRealizadas = disputasRealizadas;
	}

	@Override
	public String toString() {
		return String.format("Defensa [nombre= %s, dorsal= %d, equipo= %s, disputasRealizadas= %d]", this.getNombre(), this.getDorsal(), this.getEquipo(), this.disputasRealizadas);
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
		return super.equals(other) && this.disputasRealizadas == other.disputasRealizadas;				
	}		

}
