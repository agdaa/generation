/*
 * Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */

package introjava;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		int s, m, h, sTotal;
		
		System.out.print("Escreva a duração do evento em segundos:");
		Scanner entrada = new Scanner(System.in);
		sTotal = entrada.nextInt();
		entrada.close();
		
		h = sTotal/3600;
		m = (sTotal%3600)/60;
		s = (sTotal%3600) - (m*60);
		
		System.out.printf("\nO evento durou %02d:%02d:%02d",h,m,s);

	}

}
