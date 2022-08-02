package inicio;

public class Persona {

	private String nombre;
	private String apellido;
	
	
	// CONSTRUCTORES
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Persona() {
		this.nombre = "";
		this.apellido = "";
	}

	
	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
