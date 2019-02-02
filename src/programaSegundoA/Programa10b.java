package programaSegundoA;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Programa10b {
	public static void main(String args[]){
	Scanner op=new Scanner(System.in);
	DecimalFormat f=new DecimalFormat("###,###.##");
	double s, c=0;
	int p=-1;
	
	System.out.println("Bienvenido");
	System.out.println("Ingrese números del 0 al 76");
	System.out.println("Si se ingresa un valor mayor a 76, ya no se tomara en cuenta");

	do {
		System.out.println("Ingrese los números");
			s=op.nextDouble();
			if (s>=0 && s<=76){
				c+=s;
				p++;
			}
	}while(s<=76);
	System.out.println("La suma total es "+c);
	System.out.println("El promedio de la suma es "+f.format(c/p));
}
}

