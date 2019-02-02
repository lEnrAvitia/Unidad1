package programaSegundoA;
import java.util.Scanner;
public interface Programa11a {
	public static void main(String[] args) {
		   int c=0, a=0;
		   double isr=0;
		   Scanner op=new Scanner(System.in);
		   System.out.println("¿Cuántos empleados va a registrar?");
		   		int e=op.nextInt();
	      int[] valores = new int[e];

	      for (int i = 0; i < e; i++) {
	         do {
	        	 c++;
	        	 System.out.println("Ingrese el sueldo del trabajador "+c);
	        	 	valores[i]=op.nextInt();
	        	 	a+=valores[i];
	         }while(c<=e);
	      }
	      int min = valores[0];
	      int max = valores[0];

	      for (int i = 1; i < e; i++) {
	         if (valores[i] < min) {
	            min = valores[i];
	         } else if (valores[i] > max) {
	            max = valores[i];
	         }      }
	      System.out.println("El sueldo minimo es: " + min);
	      System.out.println("El sueldo maximo es: " + max);
	      System.out.println("El monto total es de: "+a);
	      System.out.println("El monto con el ISR es de: "+(isr=a*.67));
	    }
}
