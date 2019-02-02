package programaSegundoA;
import java.util.Scanner;
public class Programa11 {
	public static void main(String args[]){
		float n1,r;
		byte m;
		Scanner op=new Scanner(System.in);
		
		System.out.println("...::Menú::...");
		System.out.println("1.- Pulgadas a centimetros");
		System.out.println("2.- Pies a centimetros");
		System.out.println("3.- Pies a pulgadas");
		System.out.println("4.- Salir");
			m=op.nextByte();
			
		switch(m){
		case 1:
			System.out.println("...::Pulgadas a centimetros::...");
			System.out.println("Ingrese el valor a convertir");
				n1=op.nextFloat();
					r=(float) (n1*2.54);
			System.out.println("La convercion en cm es "+r);
			break;
		case 2:
			System.out.println("...::Pies a centimetros::...");
			System.out.println("Ingrese el valor a convertir");
				n1=op.nextFloat();
					r=(float) (n1*30.48);
			System.out.println("La convercion en cm es "+r);
			break;
		case 3:
			System.out.println("...::Pies a pulgadas::...");
			System.out.println("Ingrese el valor a convertir");
				n1=op.nextFloat();
					r=(float) (n1*12);
			System.out.println("La convercion en pulgadas es "+r);
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("Solo números del 1 al 4");
			break;
		}
	}

}
