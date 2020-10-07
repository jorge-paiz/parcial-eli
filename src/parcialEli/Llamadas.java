package parcialEli;
import java.util.Scanner;

public class Llamadas {

	public static void main(String[] args) {
		
		Scanner dato = new Scanner(System.in);
		int minutos;
		int clave;
		double tarifa = 0;
		double total = 0;
		
		

		System.out.println("las zonas son:");
		System.out.println("Clave   Zona                  tarifa por minuto");
		System.out.println("12      America del norte     $2");
		System.out.println("15      America central       $2.2");
		System.out.println("18      America del sur       $4.5");
		System.out.println("19      Europa                $3.5");
		System.out.println("29      Oceania               $8");
		System.out.println();
		
		
		System.out.println("ingrese la clave de una zona");
		clave = dato.nextInt();
		System.out.println();
		
		System.out.println("Ingrese la cantidad de minutos");
		minutos = dato.nextInt();
		
		total = (minutos*tarifa);
		
		if (clave == 12) {
			
			tarifa = 2;
			
		} else if(clave == 15){

			tarifa = 2.2;
			
		} else if (clave ==18) {
			
			tarifa = 4.5;
			
		} else if (clave == 19) {
			
			tarifa = 3.5;
		} else if (clave == 29) {
			
			tarifa = 8;
			
		} else {
			System.out.println("la clave no ha sido asignada a ninguna zona");
		}
		
		
		
		
		
		System.out.println("el costo de la llamada es: $"+ total);
		
	}

}
