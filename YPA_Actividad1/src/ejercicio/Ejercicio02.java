package ejercicio;

public class Ejercicio02 {
	public static void main(String[] args) {
		int suma=0;
		int producto=1;
		int contador=0;
		for(int i=1; contador< 10; i+=2) {
			suma =suma+ i;
			producto = producto* i;
			contador ++;
		}
		System.out.println("La suma de los primeros 10 impares es: "+ suma);
		System.out.println("El producto de los primeros 10 impares es: "+ producto);
	}
}