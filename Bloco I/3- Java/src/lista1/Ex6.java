package lista1;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		double x1, y1, x2, y2, d;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira as coordenadas de um ponto.");
		System.out.print("x= ");
		x1 = entrada.nextFloat();
		System.out.print("y= ");
		y1 = entrada.nextFloat();
		
		System.out.println("Insira as coordenadas de outro ponto.");
		System.out.print("x= ");
		x2 = entrada.nextFloat();
		System.out.print("y= ");
		y2 = entrada.nextFloat();
		
		entrada.close();
		
		d= Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );
		System.out.printf("\nDistância entre os pontos: %.2f",d);

	}

}
