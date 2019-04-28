//Escriba una aplicacion que reciba un numero de 5 digitos y separe ese numero sus digitos individuales separados por 3 
// espacios
import java.util.Scanner;

public class Practica2_30{
	
	public static void main(String[] args){
	
		int num, c1, c2, c3, c4, c5, aux;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un numero de 5 cifras");
		num = entrada.nextInt();
		
		// separacion en cifras individuales
		c1 = num / 10000;
		aux = num % 10000;
		c2 = aux / 1000;
		aux = aux % 1000;
		c3 = aux / 100;
		aux = aux % 100;
		c4 = aux / 10;
		aux = aux % 10;
		c5 = aux;
		
		System.out.printf("%d   %d    %d    %d    %d\n", c1, c2, c3, c4, c5);
   

	}// end method main


}// end class Practica2_30
