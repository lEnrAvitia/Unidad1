package programaSegundoA;
	import java.util.Scanner;
public class Programa07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner l = new Scanner(System.in);
		Double f,c;
		
		System.out.println("Ingrese grados Fahrenheit.");
		f = l.nextDouble();
		c = (f-32)/1.8;
		
		System.out.println("La temperatura en grados Fahrenheit es de: "+f+" grados.");
		System.out.println("La temperatura en grados centigrados es de: "+c+" grados.");
	}

}
