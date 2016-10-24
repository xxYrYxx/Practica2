
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		String letra;
		int numero = 0;
		int aux;
		Scanner numScan = new Scanner(System.in);
		Scanner letraScan = new Scanner(System.in);

		
		do {
			System.out.println("Introduce un número: ");
			aux = numScan.nextInt();
			if (numero < aux) numero = aux;		//Comparo y almaceno el mayor
			System.out.println("¿Quieres introducir más números?");
			letra = letraScan.nextLine();
		} while (letra.equals("s"));

		System.out.println("El mayor de los números introducidos es el "
				+ numero);
	}
}
