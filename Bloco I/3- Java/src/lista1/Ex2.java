/*
 * Faça um sistema que leia a idade de uma pessoa expressa em dias 
 * e mostre-a expressa em anos, meses e dias.
 */

package lista1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int d, m, a, totalDias;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("\nEntre sua idade em dias: ");
		totalDias = entrada.nextInt();
		entrada.close();
		
		a = totalDias/365;
		m = (totalDias%365)/60;
		d = (totalDias%365) - (m*60);	
		
		System.out.println("\nVocê viveu "+a+" anos, "+m+"meses e "+d+" dias." );

	}

}
