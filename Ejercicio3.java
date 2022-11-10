/**Este programa es un conversor de pesetas a euros.
@AmandaNR */
public class Ejercicio3 {

	public static void main (String [] args) {
	
		String pesetas;
		
		System.out.print("Introduce la cantidad en pesetas: ");
		pesetas = System.console().readLine();
		double cantidad;
		cantidad = Double.parseDouble( pesetas );
	
		double euros;
		euros = 166.38;
		
		double total;
		total = cantidad / euros;
		//"%.2f"
		//System.out.printf(pesetas +"%.s"," pesetas son "+ total +"%d.3f"," euros");
		System.out.print(pesetas +" pesetas son "+ total +" euros");
	}
}
