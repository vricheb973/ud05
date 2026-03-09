package ejercicios05.padel.instalaciones;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ejercicios05.padel.personas.Empleado;
import ejercicios05.padel.personas.Jugador;

public class Partido {
	
	private static int contador = 0;
	
	private int codigo;
	private Pista pista;
	private int numJugadores;
	private List<Jugador> jugadores;
	private LocalDateTime firmaEmpleado;
	private LocalDateTime firmaJugadores;
	private Empleado empleado;
	
	public Partido(Pista pista, int numJugadores) {
		this.codigo = ++Partido.contador;				
		this.pista = pista;
		this.setNumJugadores(numJugadores);
		this.jugadores = new ArrayList<Jugador>();
		this.firmaEmpleado = null;
		this.firmaJugadores = null;
		this.empleado = null;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Pista getPista() {
		return pista;
	}
	public void setPista(Pista pista) {
		this.pista = pista;
	}
	public int getNumJugadores() {
		return numJugadores;
	}
	public void setNumJugadores(int numJugadores) {
		if(numJugadores < 2) {
			throw new IllegalArgumentException("Debe haber al menos 2 jugadores para jugar el partido. ");
		}
		this.numJugadores = numJugadores;
	}
	public List<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public LocalDateTime getFirmaEmpleado() {
		return firmaEmpleado;
	}
	public void setFirmaEmpleado(LocalDateTime firmaEmpleado) {
		this.firmaEmpleado = firmaEmpleado;
	}
	public LocalDateTime getFirmaJugadores() {
		return firmaJugadores;
	}
	public void setFirmaJugadores(LocalDateTime firmaJugadores) {
		this.firmaJugadores = firmaJugadores;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	public boolean completo() {
		return this.jugadores.size() == this.numJugadores;
	}
	
	public String estado() {
		String estado = "PENDIENTE";
		
		if(this.firmaJugadores != null && this.firmaEmpleado != null) {
			estado = "CONFIRMADO";
		}
		else if(this.firmaJugadores != null) {
			estado = "RESERVADO";
		}
		
		return estado;
	}
	
	public void asociarJugador(Jugador j) {
		if(completo()) {
			throw new IllegalArgumentException("El partido está completo. ");
		}
		
		this.jugadores.add(j);
	}
	
	public void eliminarJugador(int posicion) {
		// Guard clauses
		if(posicion < 0 || posicion >= this.jugadores.size()) {
			throw new IllegalArgumentException("No se puede eliminar al jugador de la posición " + posicion);
		}
		if(this.jugadores.size() == 0) {
			throw new IllegalArgumentException("No hay ningún jugador asociado");
		}
		
		this.jugadores.remove(posicion);
	}
	
	public void reservar() {
		if(!this.completo()) {
			throw new IllegalArgumentException("Faltan jugadores por asignar. ");
		}
		if(this.firmaJugadores != null) {
			throw new IllegalArgumentException("Los jugadores ya han reservado. ");
		}
		
		this.firmaJugadores = LocalDateTime.now();
	}
	
	public void reservar(Empleado e) {
		if(!this.completo()) {
			throw new IllegalArgumentException("Faltan jugadores por asignar. ");
		}
		if(this.firmaJugadores == null) {
			throw new IllegalArgumentException("Los jugadores no han reservado aún. ");
		}
		if(this.firmaEmpleado != null) {
			throw new IllegalArgumentException("Ya está reservado por el empleado con código " + this.empleado.getCodEmpleado());
		}
		
		this.empleado = e;
		this.firmaEmpleado = LocalDateTime.now();
	}
	
}
