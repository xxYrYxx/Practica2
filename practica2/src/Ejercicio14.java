import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.print("Introduce el primer número (límite menor): ");
			num1 = teclado.nextInt();
			System.out.print("Introduce el segundo número (límite mayor): ");
			num2 = teclado.nextInt();
			if (!(num1 > 1 && num1 < num2)) {
				System.out.println("ERROR: No son números válidos.");
			}
		} while (num1 > 1 && num1 < num2);

		for (int i = num1; i < num2; i++) {
			for (int j = 2; j < num1; j++) {
				
			}
		}
	}

}
