package ejercicio;
import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[]args) {
		String realpassword, password;
		realpassword= "Sarita";
		
		Scanner line=new Scanner(System.in);
		System.out.print("Insert password: ");
		password= line.nextLine();
		if (password.equals(realpassword)){
			System.out.println("Correct password");
		}else {
			System.out.println("Wrong password");
		}
	}
}
