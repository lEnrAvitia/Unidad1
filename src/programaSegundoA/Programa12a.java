package programaSegundoA;
import java.util.Scanner;
public class Programa12a {
	public static void main(String args[]){
		int c=0;
		double a=0,r=0;
		String e;
		Scanner op=new Scanner(System.in);

		System.out.println("..:::Gestor de calificaciones:::..");
		System.out.println("No sabia como ponerle :v");
		System.out.println("");

		do{
				c++;
			System.out.println("Ingrese la calificación número "+c);
				r=op.nextDouble();
					a=a+r;
			System.out.println("¿Desea agregar más calificaciónes?");
				e=op.next();	
		}while(e.equals("S"));

			r=a/c;

		if(r>=0 && r<=49){
			System.out.println("El alumno esta suspendido por tener una calificación de "+r);
		}
		if(r>=50 && r<=69){
			System.out.println("El alumno panso con "+r);
		}
		if(r>=70 && r<=89){
			System.out.println("El alumno paso con "+r);
		}
		if(r>=90 && r<=99){
			System.out.println("El alumno es sobresaliente con una calificación de "+r);
		}
		if(r==100){
			System.out.println("Denle un premio a este... alumno por sacar "+r);
		}
	}

}
