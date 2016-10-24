import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero;
		int factorial;

		System.out.print("Introduzca un número entero positivo: ");
		numero = teclado.nextInt();

		if (numero < 0)
			System.out.println("Debe ser un entero positivo...");
		else {
			factorial=numero;
			for (int i = numero-1; i > 0; i--) {
				factorial *= i;
			}
			System.out.println("Su factorial es " + factorial);
		}
	}

}