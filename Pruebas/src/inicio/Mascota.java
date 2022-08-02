package inicio;

public class Mascota {

	private String nombre;
	private String especie;

	
	// CONSTRUCTORES
	public Mascota(String nombre, String especie) {
		this.nombre = nombre;
		this.especie = especie;
	}
	
	public Mascota() {
		this.nombre = "";
		this.especie = "";
	}

	
	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
}
