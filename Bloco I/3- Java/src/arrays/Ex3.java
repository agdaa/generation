/*
 * Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */
package arrays;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		int [][] matriz = new int[3][3];
		int maior10 = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira números na matriz: ");
		
		for(int l=0;l<3;l++) {
			for (int c=0;c<3;c++) {
				System.out.print("["+l+"]["+c+"] = ");
				matriz[l][c] = entrada.nextInt();
				if (matriz[l][c]>10) {
					maior10++;
				}
			}
		}
		   
		System.out.println("\nMatriz possui "+maior10+" numeros maiores que 10.");    

	}

}
	