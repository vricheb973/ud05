package ejercicios05.futbol2;

public class Futbolista implements Alineable {
	
	private String nombre;
	private int dorsal;
	private String equipo;
	
	private boolean alineado;
	
	public Futbolista(String nombre, int dorsal, String equipo) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.equipo = equipo;
		this.alineado = false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public boolean isAlineado() {
		return alineado;
	}

	@Override
	public String toString() {
		return String.format("Jugador [nombre= %s, dorsal= %d, equipo= %s]", this.nombre, this.dorsal, this.equipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Futbolista other = (Futbolista) obj;
		
		return this.nombre.equals(other.nombre) &&
				this.dorsal == other.dorsal &&
				this.equipo.equals(other.equipo);
	}

	@Override
	public void alinear() {
		if(this.alineado) {
			throw new IllegalArgumentException("El jugador ya estaba alineado");
		}
		
		this.alineado = true;
	}

	@Override
	public void desalinear() {
		if(!this.alineado) {
			throw new IllegalArgumentException("El jugador no estaba alineado");
		}
		
		this.alineado = false;
	}
	
}
