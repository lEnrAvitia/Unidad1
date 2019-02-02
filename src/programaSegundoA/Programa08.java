package programaSegundoA;
import java.util.Scanner;
public class Programa08 {
	public static void main(String args[]){
		int d;
		Scanner op=new Scanner(System.in);
		
		System.out.println("Teclea una opcion del 1 al 7 para mostrar el dia");
		System.out.println("Ten en cuanta que Lunes es el primero");
			d=op.nextInt();
			
		switch(d){
		case 1:
			System.out.println("Has seleccionado el dia lunes");
		break;
		case 2:
			System.out.println("Has seleccionado el dia martes");
		break;
		case 3:
			System.out.println("Has seleccionado el dia miercoles");
		break;
		case 4:
			System.out.println("Has seleccionado el dia jueves");
		break;
		case 5:
			System.out.println("Has seleccionado el dia viernes");
		break;
		case 6:
			System.out.println("Has seleccionado el dia sabado");
		break;
		case 7:
			System.out.println("Has seleccionado el dia domingo");
		break;
		default:
			System.out.println("Solo numeros del 1 al 7");
		break;
		}
	}

}
