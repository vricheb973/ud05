package ejercicios05.padel.instalaciones;

import ejercicios05.padel.instalaciones.enums.TipoPista;
import ejercicios05.padel.instalaciones.enums.UbicacionPista;

public class Pista implements Reservable {
	
	private int numero;
	private TipoPista tipo;
	private UbicacionPista ubicacion;
	
	private boolean reservada;
	
	public Pista(int numero, String tipo, String ubicacion) {
		this.setNumero(numero);
		this.setTipo(tipo);
		this.setUbicacion(ubicacion);
		this.reservada = false;
	}
	
	public Pista(int numero) {
		this.setNumero(numero);
		this.setTipo("CEMENTO");
		this.setUbicacion("AIRE_LIBRE");
		this.reservada = false;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero <= 0) {
			throw new IllegalArgumentException("El número de pista debe ser un entero positivo. ");
		}
		this.numero = numero;
	}

	public String getTipo() {
		return tipo.toString();
	}

	public void setTipo(String tipo) {
		this.tipo = TipoPista.valueOf(tipo.toUpperCase());
	}

	public String getUbicacion() {
		return ubicacion.toString();
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = UbicacionPista.valueOf(ubicacion.toUpperCase());
	}

	public boolean isReservada() {
		return reservada;
	}

	@Override
	public void reservar() {
		if(this.reservada) {
			throw new IllegalStateException("La pista ya estaba reservada. ");
		}
		
		this.reservada = true;
	}

	@Override
	public void anular() {
		if(!this.reservada) {
			throw new IllegalStateException("La pista no estaba reservada. ");
		}

		this.reservada = false;
	}

}
