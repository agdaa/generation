package lista1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		int a, b, c;
		double d, r, s;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escreva 3 números inteiros positivos.");
		
		System.out.print("A= ");
		a = entrada.nextInt();
		System.out.print("B= ");
		b = entrada.nextInt();
		System.out.print("C= ");
		c = entrada.nextInt();
		
		entrada.close();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = (r+s)/2;
		
		System.out.printf("\nResultado da expressão: \nD= %.0f",d);
	}

}
