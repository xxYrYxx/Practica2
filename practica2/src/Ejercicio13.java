import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner teclado = new Scanner(System.in);
		boolean primo=true;
		

		do {
			System.out.print("Introduce el primer número (límite menor): ");
			num1 = teclado.nextInt();
			System.out.print("Introduce el segundo número (límite mayor): ");
			num2 = teclado.nextInt();
			if (!(num1 >= 0 && num1 < num2)) {
				System.out.println("ERROR: No son números válidos.");
			}
		} while (!(num1 >= 0 && num1 < num2));

		if(num1==0 || num1==1){
			System.out.println("1");
			System.out.println("2");
			
			num1=3;
		}
		for (int i = num1; i < num2; i++) {
			for (int j = 2; j < i; j++) {
				if(i%j==0){
					primo=false;
					break;
				}
			}
			if(primo){
				System.out.println(i);
				continue;
			}
			primo=true;
		}
	}

}
