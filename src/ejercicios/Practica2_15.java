//Escriba una aplicacion que pida al usuario que escriba dos enteros, y obtenga la suma, producto, diferencia y cociente. import 
import java.util.Scanner;

public class Practica2_15{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in); //creacion del objeto entrada
		int num1, num2, suma, prod, diff;
		float  div;
		
		System.out.println("Ingrese el primer numero: ");
		num1 = entrada.nextInt();// Lee el primer numero
		
		System.out.println("Ingrese el segundo numero: ");
		num2 = entrada.nextInt();// Lee el segundo nuemro	
		// operaciones aritmeticas
		suma = num1 + num2;
		prod = num1 * num2;
		diff = num1 - num2;
		div =  num1 / num2;
		System.out.printf("La suma es %d, el producto es %d, la diferencia es %d y el cociente es %.2f\n", suma , prod, diff, div);
		
		
	}// fin del metodo main

}//  fin de la clase Practica2_15
