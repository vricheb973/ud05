package unidad05.diapositivas.persona;

public class Persona {
	
	private String nombre;
	private int edad;
	private double estatura; //Se mide en metros 
	
	public Persona(String nombre, int edad, double estatura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getEstatura() {
		return estatura;
	}
	
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Estatura: " + this.estatura);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
