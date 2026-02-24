package ejercicios05.futbol.jugadores.delanteros;

import ejercicios05.futbol.jugadores.Puesto;

public class Extremo extends Delantero {

	private Puesto puesto;

	public Extremo(String nombre, int dorsal, String equipo, int disputasRealizadas, String puesto) {
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
		return String.format("Extremo [nombre= %s, dorsal= %d, equipo= %s, goles= %d, golesDePenalti= %d, puesto= %s]", this.getNombre(), this.getDorsal(), this.getEquipo(), this.getGoles(), this.puesto.toString());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Extremo other = (Extremo) obj;
		return super.equals(obj) && this.puesto.equals(other.puesto);
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}	

}
