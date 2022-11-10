/**Este programa realiza la suma, la resta, la multiplicacion
 * y la division de dos numeros.
 * @AmandaNR */
public class Ejercicio4 {
	
	public static void main (String []args) {
		
		String linea;
		System.out.print("Introduce un numero: ");
		linea = System.console().readLine();
		int primerNumero;
		primerNumero = Integer.parseInt( linea );
		
		System.out.print("Introduce otro numero: ");
		linea = System.console().readLine();
		int segundoNumero;
		segundoNumero = Integer.parseInt( linea );
		
		int suma;
		suma = primerNumero + segundoNumero;
		
		int resta;
		resta = primerNumero - segundoNumero;
		
		int multiplicacion;
		multiplicacion = primerNumero * segundoNumero;
		
		double division;
		division = (double) primerNumero / (double) segundoNumero;
		
		System.out.println("La suma de los dos numeros es: "+ suma);
		System.out.println("La resta de los dos numeros es: "+ resta);
		System.out.println("La multiplicacion de los dos numeros es: "+ multiplicacion);
		System.out.println("La division de los dos numeros es: "+ division);

	}
}
