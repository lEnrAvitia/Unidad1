package programaSegundoA;
	import java.util.Scanner;
public class Programa06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner l = new Scanner(System.in);
		System.out.print("Ingrese un numero.");
		int n = l.nextInt();
		int m;
		m = n%2;
		if(m==0){
			System.out.print("El numero es par");
		}
		else{
			System.out.print("El numero no es par");
		}
	}

}
