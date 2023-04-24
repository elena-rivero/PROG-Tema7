package crud.ejercicio2;

import java.util.Arrays;

public class PrincipalArticulo {

	static Articulo[] articulos = new Articulo[0];
	
	public static void main(String[] args) {
		
		Articulo art = new Articulo();
		alta(art);
		
		System.out.println(Arrays.toString(articulos));
		
		int[] numeros = new int[5];
		añadeNumero(numeros);
		System.out.println(Arrays.toString(numeros));
	}

	public static void alta(Articulo a) {
		articulos = Arrays.copyOf(articulos, articulos.length+1);
		articulos[articulos.length-1] = a;
	}
	
	public static void añadeNumero(int[] numeros) {
		numeros[0] = 5;
	}
}
