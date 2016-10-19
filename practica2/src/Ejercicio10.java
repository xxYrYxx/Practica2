import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero;
		int factorial = 1;

		System.out.print("Introduzca un número entero positivo: ");
		numero = teclado.nextInt();

		if (numero < 0)
			System.out.println("Debe ser un entero positivo...");
		else {
			for (int i = 1; i < numero + 1; i++) {
				factorial *= i;
			}
			System.out.println("Su factorial es " + factorial);
		}
	}

}