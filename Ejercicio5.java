/**Este programa calcula el area de un rectangulo.
AmandaNR*/

public class Ejercicio5 {

	public static void main (String [] args) {
	
		String dato;
		System.out.print("Introduce el ancho del rectangulo: ");
		dato = System.console().readLine();
		double ancho;
		ancho = Double.parseDouble( dato);
		
		System.out.print("Introduce el largo de un rectangulo; ");
		dato = System.console().readLine();
		double largo;
		largo = Double.parseDouble( dato);
		
		double total;
		total = ancho * largo;
		
		System.out.print("El area del rectangulo es: "+ total);
		
	}
}
