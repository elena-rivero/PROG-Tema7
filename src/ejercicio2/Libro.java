package ejercicio2;

public class Libro {
	/**
	 * 
	 */
	String titulo;
	String autor;
	int numEjemplares;
	int prestados;
	
	public Libro() {
		super();
	}

	public Libro(String titulo, String autor, int numEjemplares, int prestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.prestados = prestados;
	}
	
	boolean prestamo(){
		boolean estado=false;
		if(prestados<numEjemplares) {
			estado = true;
			prestados++;
		}
		return estado;
	}
	
	boolean devolucion() {
		boolean estado = false;
		if(prestados>0) {
			estado = true;
			prestados--;
		}
		return estado;
	}
}
