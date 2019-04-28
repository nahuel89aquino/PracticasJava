// Escriba una aplicacion que solicite al usuario dos enteros y muestre el mas grande con un mesaje
// y si son igual con otro mensaje
import java.util.Scanner;

public class Practica2_16{

	public static void main(String[] args){
	
	int num1, num2;
	Scanner entrada = new Scanner(System.in);

	System.out.println("Ingrese un numero enteros");
	num1 = entrada.nextInt();
	num2 = entrada.nextInt();
	// bloque de decicion de mayor o igual
	
	if(num1 > num2)
		System.out.printf("El mayor es el numero %d\n",num1);

	if(num2 > num1)
		System.out.printf("El mayor es el numero %d\n", num2);

	if(num1 == num2)
		System.out.println("Los numeros son iguales");

	}// fin de metoda main

}// fin de la clase Practica2_16

