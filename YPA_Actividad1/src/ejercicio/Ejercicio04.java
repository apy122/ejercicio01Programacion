package ejercicio;
import java.util.Scanner;
public class Ejercicio04 {
	public static void main(String[] args) {
		int number=1;
		int parnumber=0;
		int imparnumber=0;
		int sumapar=0;
		int sumaimpar=0;
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Inserte un numero: ");
		number= scanner.nextInt();
		while(true) {
			if(number==0) {
				
				break;
				
			}if (number%2 ==0) {
				
				System.out.println("Inserte un numero: ");
				number= scanner.nextInt();
					
				parnumber +=1;
				sumapar +=number;
					
			}else{
					
				System.out.println("Inserte un numero: ");
				number= scanner.nextInt();
					
				imparnumber +=1;
				sumaimpar +=number;
			}
		}
		System.out.println("La cantidad de numeros pares son: "+ parnumber);
		System.out.println("La suma de todos los pares dados es: "+ sumapar);
		System.out.println("La cantidad de numeros pares son: "+ imparnumber);
		System.out.println("La suma de todos los impares dados es: "+ sumaimpar);
	}
}

