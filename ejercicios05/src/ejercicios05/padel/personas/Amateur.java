package ejercicios05.padel.personas;

public class Amateur extends Jugador {
	
	private String puntoDebil;

	public Amateur(String nombre, String apellidos, String dni, int codSocio, String puntoDebil) {
		super(nombre, apellidos, dni, codSocio);
		this.puntoDebil = puntoDebil;
	}

	public String getPuntoDebil() {
		return puntoDebil;
	}

	public void setPuntoDebil(String puntoDebil) {
		this.puntoDebil = puntoDebil;
	}
	
	@Override
	public String toString() {
		return String.format("Amateur [nombre=%s, apellidos=%s, dni=%s, codSocio=%d, puntoDebil=%s]", this.getNombre(), this.getApellidos(), this.getDni(), this.getCodSocio(), this.puntoDebil);
	}
	
	@Override
	public void saludar() {
		System.out.printf("Hola, me llamo %s y soy amateur. ", this.getNombre());
		
	}

}
