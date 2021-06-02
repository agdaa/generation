/*
 * Faça um sistema que leia a idade de uma pessoa 
 * expressa em anos, meses e dias 
 * e mostre-a expressa apenas em dias.
 */

package lista1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d, m, a, totalDias;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nEntre sua idade. \nAnos: ");
		a = entrada.nextInt();
		System.out.println("\nMeses: ");
		m = entrada.nextInt();
		System.out.println("\nDias: ");
		d = entrada.nextInt();
		entrada.close();
		
		totalDias = d + (m*30) + (a*365);
		
		System.out.println("\nVocê viveu "+totalDias+" dias no total." );

	}

}
