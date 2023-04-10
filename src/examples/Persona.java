package examples;

public class Persona {
	private String nombre;
	private int edad;
	private double altura;

	
	
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void metodo() {
		int edad;
		edad = 8;
		this.edad = 5;
	}
}
