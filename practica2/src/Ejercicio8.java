import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		double numero;
		int decimales;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca un número con decimales (introduzca 0 para salir): ");
		numero = teclado.nextDouble();
		while (numero != 0) {
			System.out.print("¿A cuántos decimales se debe redondear? ");
			decimales = teclado.nextInt();
			numero = Math.rint(numero * (Math.pow(10, decimales)))
					/ Math.pow(10, decimales);
			System.out.println("El número redondeado es " + numero);
			System.out.print("Introduzca un número con decimales (introduzca 0 para salir): ");
			numero = teclado.nextDouble();
			
		}
	}

}
