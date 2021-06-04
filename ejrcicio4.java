package ejercicio4;

import java.util.Scanner;

public class ejrcicio4 {

  Scanner lector = new Scanner(System.in);

	public  ejrcicio4() {

			double rad, area, longitud;

			System.out.println("ingrese el radio del circulo");
			rad = lector.nextDouble();

			area = Math.PI*Math.pow(rad,2);
			longitud = 2*Math.PI*rad;

			System.out.println("el area del circulo es:"+area);

			System.out.println("la longitud de la circuferencia es"+longitud);

	}

}