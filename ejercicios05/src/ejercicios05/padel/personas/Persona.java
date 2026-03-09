package ejercicios05.padel.personas;

public abstract class Persona implements Comparable<Persona> {
	
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
	
	public abstract void saludar();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return this.dni.equals(other.dni);
	}
	
	@Override
	public int compareTo(Persona o) {
		int result = this.nombre.compareTo(o.nombre);
		
		if(result == 0) {
			result = this.dni.compareTo(o.dni);
		}
		
		return result;
	}	

}
