package unidad05.diapositivas.persona;

public class Empleado extends Persona {
	
	private double salario;

	public Empleado(String nombre, int edad, double estatura, double salario) {
		super(nombre, edad, estatura);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Salario: " + this.salario);
	}

}
