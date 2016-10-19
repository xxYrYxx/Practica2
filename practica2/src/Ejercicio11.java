import java.util.Scanner;


public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		double x1;
		double x2;
		
		System.out.print("Introduce a: ");
		a=teclado.nextDouble();
		
		System.out.print("Introduce b: ");
		b=teclado.nextDouble();
		
		System.out.print("Introduce c: ");
		c=teclado.nextDouble();
		
		if(a==0){
			if(b==0){
				System.out.println("Ecuación degenerada");
				return;
			}
			
			
		}
		
		x1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		x2=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		
		
		

	}

}
