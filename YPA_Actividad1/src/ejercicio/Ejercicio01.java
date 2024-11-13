package ejercicio;
import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		float nota;
		while (true) {
			Scanner scanner= new Scanner(System.in);
			System.out.print("Ingrese nota del alumno: ");
			nota= scanner.nextFloat();
			
			if(nota<5) {
				System.out.println("Nota del alumno: insuficiente.");
				break;
				
			}if (nota>= 5 && nota<6){
				System.out.println("Nota del alumno: suficiente.");
				break;
				
			}if (nota >=6 && nota <7) {
				System.out.println("Nota del alumno: Bien.");
				break;
				
			}if (nota <=7 && nota <9) {
				System.out.println("Nota del alumno: Notable");
				break;
				
			}if (nota >=9 && nota <=10) {
				System.out.println("Nota del alumno: Sobresaliente");
				break;
		}
		
		}
	}
	
}
