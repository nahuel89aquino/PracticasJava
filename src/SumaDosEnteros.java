// programa que suma dos enteros
import java.util.Scanner; //importacion de la clase Scanner

public class SumaDosEnteros {

	public static void main(String[] args) {
		// crea el objeto Scanner para obtener la entrada de la ventana de comandos
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Programa para sumar dos enteros");
		int num1; //primer numero a sumar
		int num2; // segundo numero a sumar
		int suma; // suma de num1 y num2
		System.out.println("Escriba el primer numero a sumar: ");
		num1 = entrada.nextInt(); // lee el primer numero del usuario
		
		System.out.println("Escriba el segundo numero a sumar: ");
		num2 = entrada.nextInt(); // lee el segundo numero del usuario
		
		suma = num1 + num2; // suma los numero enteros y los almacena en suma
		
		System.out.printf("La suma de %d y %d es %d\n\n", num1, num2, suma); // muestra la suma
		
		entrada.close();
	}// fin del metodo main

}// fin de la clase SumaDeEnteros
