package ejercicios05.futbol.jugadores.defensas;

import ejercicios05.futbol.jugadores.Puesto;

public class Lateral extends Defensa {
	
	private Puesto puesto;

	public Lateral(String nombre, int dorsal, String equipo, int disputasRealizadas, String puesto) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		setPuesto(puesto);
	}

	public String getPuesto() {
		return puesto.toString();
	}

	public void setPuesto(String puesto) {
		this.puesto = Puesto.valueOf(puesto);
	}

	@Override
	public String toString() {
		return String.format("Lateral [nombre= %s, dorsal= %d, equipo= %s, disputasRealizadas= %d, puesto= %s]", this.getNombre(), this.getDorsal(), this.getEquipo(), this.getDisputasRealizadas(), this.puesto.toString());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Lateral other = (Lateral) obj;
		return super.equals(obj) && this.puesto.equals(other.puesto);
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
		
	}

}
