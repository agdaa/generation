/*
 * Faça um programa que entre com três números e coloque em ordem crescente.
 */

package condicionais;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira 3 números: ");
		System.out.print("> ");
		a = entrada.nextInt();
		System.out.print("> ");
		b = entrada.nextInt();
		System.out.print("> ");
		c = entrada.nextInt();
		
		System.out.print("\nNúmeros em ordem crescente: ");
		
		if (a<=b && b<=c) 
		{
			System.out.println(a+" "+b+" "+c);
		} 
		else if (a<=c && c<=b) 
		{
			System.out.println(a+" "+c+" "+b);
		}
		else if (b<=a && a<=c) 
		{
			System.out.println(b+" "+a+" "+c);
		}
		else if (b<=c && c<=a) 
		{
			System.out.println(b+" "+c+" "+a);
		}
		else if (c<=a && a<=b) 
		{
			System.out.println(c+" "+a+" "+b);
		}
		else if (c<=b && b<=a) 
		{
			System.out.println(c+" "+b+" "+a);
		}
		
	}
}
