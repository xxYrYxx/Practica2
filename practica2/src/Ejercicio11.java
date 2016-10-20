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
			System.out.print("Raíz única: "+(-c/b));
			return;
		}
		double d=Math.pow(b, 2)-4*a*c;
		if(d<0){
			System.out.println("x1: x + yi");
			System.out.println("x2: x - yi");
			return;
		}
		
		x1=(-b+Math.sqrt(d))/(2*a);
		x2=(-b-Math.sqrt(d))/(2*a);
		
		System.out.println("x1: "+x1);
		System.out.println("x2: "+x2);
		
		

	}

}
