//Escriba una aplicacion que reciba dos enteros y determine si el primero es multiplo del segundo
import java.util.Scanner;

public class Practica2_26{

	public static void main(String[] args){
		int num1, num2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese dos numeros enteros");
		System.out.print("Primer numero: ");
		num1 = entrada.nextInt();
		System.out.print("Segundo numero: ");
		num2 = entrada.nextInt();
		
		// determina si el primer numero es multiplo del segundo
		if((num1 % num2) == 0)
			System.out.println("El segundo numero es multiplo del primero");
		
		if((num1 % num2) != 0)
			System.out.println("El segundo numero no es multiplo del primero");
		

	}// fin del metodo main
}// fin de la clase Practica2_26
