package lista1;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		int a, b, c, d, e, f, x, y;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira 6 valores para os coeficientes.");
		System.out.print("a: ");
		a = entrada.nextInt();
		System.out.print("b: ");
		b = entrada.nextInt();
		System.out.print("c: ");
		c = entrada.nextInt();
		System.out.print("d: ");
		d = entrada.nextInt();
		System.out.print("e: ");
		e = entrada.nextInt();
		System.out.print("f: ");
		f = entrada.nextInt();
		
		entrada.close();
		
		x= (c*e - b*f)/(a*e - b*d);
		y= (a*f - c*d)/(a*e - b*d);

		
		System.out.println("\nResultados:");
		System.out.print("x= "+x+"\ny= "+y);
	}

}
