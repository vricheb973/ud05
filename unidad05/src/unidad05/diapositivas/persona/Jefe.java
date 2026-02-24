package unidad05.diapositivas.persona;

public class Jefe extends Persona {
	
	private String cargo;

	public Jefe(String nombre, int edad, double estatura, String cargo) {
		super(nombre, edad, estatura);
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
//	@Override
//	public void mostrarDatos() {
//		System.out.println("Nombre: " + this.getNombre());
//		System.out.println("Edad: " + this.getEdad());
//		System.out.println("Estatura: " + this.getEstatura());
//		System.out.println("Cargo: " + this.cargo);
//	}

}
