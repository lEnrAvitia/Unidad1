package programaSegundoA;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Programa10 {
	public static void main(String[] args) {
		DecimalFormat f=new DecimalFormat("###,###.##");
		Scanner op=new Scanner(System.in);
		float n1, n2, n3;
		double r,r1;
		System.out.println("Ingrese el valor del primer producto");
			n1=op.nextFloat();
		System.out.println("Ingrese el valor del producto dos");
			n2=op.nextFloat();
		System.out.println("Y por ultimo ingrese el valor del tercer producto");
			n3=op.nextFloat();
				r=n1+n2+n3;
			
		if(r>=1500) {
				r1=r*1.11;
		}
		else{
				r1=r*1.1;
		}

		System.out.println("El valor sin aumento es "+f.format(r));
		System.out.println("El valor total es "+f.format(r1));
	}
}
