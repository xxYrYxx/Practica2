import java.util.Scanner;


public class Ejercicio9 {

	public static void main(String[] args) {
		
		int longLado;
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("¿Qué longitud tendrán los lados del cuadrado? ");
		longLado=teclado.nextInt();
		
		System.out.print("*");
		for (int i = 0; i < longLado-1; i++) {
			System.out.print("   *");
		}
		for (int i = 0; i < longLado-2; i++) {
			System.out.print("\n\n*");
			for (int j = 0; j < longLado-2; j++) {
				System.out.print("    ");
			}
			System.out.print("   *");
		}
		System.out.print("\n\n*");
		for (int i = 0; i < longLado-1; i++) {
			System.out.print("   *");
		}
		

	}

}
