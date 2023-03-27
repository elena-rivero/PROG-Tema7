package examples2;

import java.util.Scanner;

import examples.Prueba;
import funciones.Principal;

public class Matias {

	enum DiaSemana {
		LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO
	}

	enum Colores { blanco, rojo, negro}
	
	enum Monedas {uno, dos, cinco, diez, veinte, cincuenta}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String color = sc.nextLine();
		int color = sc.nextInt();
		Colores colorCoche = Colores.valueOf(String.valueOf(color));
		System.out.println(colorCoche);
		
		sc.close();
	}

}
