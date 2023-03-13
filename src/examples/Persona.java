package examples;

public class Persona {
	protected String nombre;
	int edad;
	double altura;
	
	
	public Persona() {
		edad = 18;
	}

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre, int edad, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}



	public void metodo() {
		int edad;
		edad = 8;
		this.edad = 5;
	}
}
