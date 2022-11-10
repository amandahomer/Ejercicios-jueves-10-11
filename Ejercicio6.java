/**Este programa calcula el area de un triangulo.
AmandaNR*/

public class Ejercicio6 {

	public static void main (String [] args) {
	 
		String dato;
		System.out.print("Introduce la base del triangulo: ");
		dato = System.console().readLine();
		double base;
		base = Double.parseDouble(dato);
		
		System.out.print("Introduce la altura del triangulo; ");
		dato = System.console().readLine();
		double altura;
		altura = Double.parseDouble( dato);
		
		double total;
		total = (base * altura) / 2;
		
		System.out.print("El area del triangulo es: "+ total);
	 
	}
}
	
