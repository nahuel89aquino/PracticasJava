// Escriba una aplicacion que reciba 3 numeros y determine  la suma el promedio el mayor y el menor
import java.util.Scanner;

public class Practica2_17{

	public static void main(String[] args){
		int num1, num2, num3, sum, prom, prod;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el primer numero: ");
		num1 = entrada.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		num2 = entrada.nextInt();
		System.out.print("Ingrese el tercer numero: ");
		num3 = entrada.nextInt();
		
		// calcula de suma  producto y promedio
		sum = num1 + num2 + num3;
		prod = num1 * num2 * num3;
		prom= sum / 3;
		
		// determinacion del mayor y menor
		if (num1 > num2){
			if(num1 > num3){
				System.out.printf("\nEl mayor es el numero %d\n",num1);
			}
		}
		if (num2 > num1){
			if(num2 > num3){
				System.out.printf("\nEl mayor es el numero %d\n",num2);
			}
		}
		if (num3 > num1){
			if(num3 > num2){
				System.out.printf("\nEl mayor es el numero %d\n",num3);
			}
		}
		System.out.printf("la suma es %d, el promedio es %d y el producto es %d\n",sum, prom, prod);

	}// fin del metodo main
}// fin de la clase Practica2_17
