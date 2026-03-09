package ejercicios05.padel.personas;

public class Empleado extends Persona {
	
	private int codEmpleado;

	public Empleado(String nombre, String apellidos, String dni, int codEmpleado) {
		super(nombre, apellidos, dni);
		this.codEmpleado = codEmpleado;
	}

	public int getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(int codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	@Override
	public String toString() {
		return String.format("Empleado [nombre=%s, apellidos=%s, dni=%s, codEmpleado=%d]", this.getNombre(), this.getApellidos(), this.getDni(), this.codEmpleado);
	}

	@Override
	public void saludar() {
		System.out.printf("Hola, me llamo %s y soy empleado. ", this.getNombre());
		
	}

}
