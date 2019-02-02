package programaSegundoA;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Programa10a {
	public static void main(String args[]){
		DecimalFormat f=new DecimalFormat("###,###.##");
		Scanner op=new Scanner(System.in);
		byte s=1;
		byte c;
		double n=0, t=0;
		
		System.out.println("Beinvenido");
		System.out.println("¿Cuántos productos desea registrar?");
			c=op.nextByte();
			
		do{
			System.out.println("Ingrese el valor del producto "+s);
				n=op.nextDouble();
					t=t+n;
				s++;
		}while(s<=c);
		
			System.out.println("El monto total es "+f.format(t));
		
		if(t>=1500){
			t=t*1.11;
		}else{
			t=t*1.1;
		}
		
			System.out.println("El resultado con aumento es "+f.format(t));
	}

}
