package unidad05.ejemplos.ordenar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Jugador implements Comparable<Jugador> {
	
	private String nombre;
	private int dorsal;
	private String equipo;
	private LocalDate fechaNacimiento;

	public Jugador(String nombre, int dorsal, String equipo, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.equipo = equipo;
		this.fechaNacimiento = fechaNacimiento;
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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return String.format("Jugador [nombre= %s, dorsal= %d, equipo= %s, fechaNacimiento=%s]", this.nombre, this.dorsal, this.equipo, this.fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		
		return this.nombre.equals(other.nombre) &&
				this.dorsal == other.dorsal &&
				this.equipo.equals(other.equipo);
	}

	@Override
	public int compareTo(Jugador o) {
		// Usamos el wrapper para tipos primitivos 
		/* int -> Integer.compare
		 * double -> Double.compare
		 * boolean -> Boolean.compare
		 */
		int result = Integer.compare(o.dorsal, this.dorsal);
		
		if(result == 0) {
			//Usamos el compareTo para tipos objetos
			// String, LocalDate, LocalDateTime, Objetos de nosotros
			result = this.equipo.compareTo(o.equipo);
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
