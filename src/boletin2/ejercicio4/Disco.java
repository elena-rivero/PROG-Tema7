package boletin2.ejercicio4;

public class Disco {
	
	enum Genero {Rock, Pop, Electrónica, Reggaeton};
	
	private String codigo = "LIBRE";
	private String autor = "";
	private String titulo = "";
	private Genero genero;
	private int duracion = 0;

	public Disco() {

	}

	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = Genero.valueOf(genero);
		if (duracion > 0) {
			this.duracion = duracion;
		}
	}

	/**
	 * Constructor copia. Copio los valores de otro objeto del mismo tipo
	 * 
	 * @param d Objeto de tipo Disco del cual voy a copiar los valores.
	 */
	public Disco(Disco d) {
		this.codigo = d.codigo;
		this.autor = d.autor;
		this.titulo = d.titulo;
		this.genero = d.genero;
		this.duracion = d.duracion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}		

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = Genero.valueOf(genero);
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		if (duracion > 0) {
			this.duracion = duracion;
		} 
	}

	/**
	 * El método toString me devuelve una cadena con una representación de los
	 * valores de los atributos.
	 */
	public String toString() {
		String result = "";
		result += "Código: " + this.codigo + "\n";
		result += "Autor: " + this.autor + "\n";
		result += "Título: " + this.titulo + "\n";
		result += "Género: " + this.genero + "\n";
		result += "Duración: " + this.duracion + "\n";
		return result;
	}

}
