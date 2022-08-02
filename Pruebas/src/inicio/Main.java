package inicio;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		
		// Crear linkedlist de personas
		LinkedList<Persona> personas = new LinkedList<Persona>();
		
		// Ingresar datos a la lista
		personas.add(new Persona("Galileo", "Galilei"));
		personas.add(new Persona("Edward", "Elric"));
		personas.add(new Persona("Issa", "Kobayashi"));
		personas.add(new Persona("Ada", "Lovelace"));
		personas.add(new Persona("Genghis", "Khan"));
		
		// Mostrar en consola contenido de la lista
		System.out.println("LISTA DE PERSONAS");
		System.out.println("-----------------");
		for (Persona p : personas) {
			System.out.println(p.getNombre() + " " + p.getApellido());
		}

	}

}
