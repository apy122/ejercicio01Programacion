package ejercicio;

public class Ejercicio03 {
	public static void main(String[] args) {
		int contador, suma, pares;
		contador=0;
		suma=0;
		pares=0;
		
		for(int i=100; i >= 0; i -=7) {
			System.out.println("Numero por el que me llego: "+ i);
			contador ++;
			suma +=i;
			if (i%2 ==0) {
				pares= pares+1;
			}
			
			System.out.println("El numero total de numeros escritos es:"+ contador);
			System.out.println("La suma total de los numeros es:"+ suma);
			System.out.println("La cantidad total de numeros pares es:"+ pares);
		}
	}
}
