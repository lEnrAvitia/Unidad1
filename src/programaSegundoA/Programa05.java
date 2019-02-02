package programaSegundoA;

import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte calificacion;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Calificacion:");
		calificacion = leer.nextByte();
		if(calificacion>=80){
			System.out.print("Aprobado.");
			
		}
		else
		{
			System.out.print("Reprobado.");
		}

	}

}
