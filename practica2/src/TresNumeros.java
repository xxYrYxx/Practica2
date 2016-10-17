import java.util.Arrays;
import java.util.Scanner;


public class TresNumeros {
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		int[] numeros=new int[3];
		
		//Pido los números
		System.out.println("Inserte tres números...");
		numeros[0]=teclado.nextInt();
		numeros[1]=teclado.nextInt();
		numeros[2]=teclado.nextInt();
		
		//Ordeno el array
		Arrays.sort(numeros);
		
		//Muestro el resultado
		for (int i : numeros) {
			System.out.print(i+" ");
		}
		
	}
}
