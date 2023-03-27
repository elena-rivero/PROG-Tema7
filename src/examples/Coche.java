package examples;

public class Coche {
	// Atributos
	String marca;
	String modelo;
	String color;
	String matricula;
	double precio;
	
	// Constructores
	public Coche() {
		super();
	}

	public Coche(String marca, String modelo, String color, String matricula) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
	}

	public Coche(String matricula) {
		super();
		this.matricula = matricula;
	}

	public Coche(String marca, String modelo, String matricula) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
	}
	

}
