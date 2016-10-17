package practica2;

import java.util.Scanner;

public class Nombre {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String nombre;

		System.out.println("Introduce tu nombre: ");
		nombre = teclado.nextLine();

		System.out.println("El nombre introducido es " + nombre);
	}
}
