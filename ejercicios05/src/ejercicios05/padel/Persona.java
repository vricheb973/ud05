package ejercicios05.padel;

public abstract class Persona {
	
	private String nombre;
	private String apellidos;
	private String dni;
	
	public Persona(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.setDni(dni);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		if(dni.length() != 9) {
			throw new IllegalArgumentException("El DNI debe tener exactamente 9 caracteres. "); 
		}
		
		this.dni = dni;
	}
	
	

}
