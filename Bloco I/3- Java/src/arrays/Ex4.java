/*
 * Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. 
 * Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor
da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na
pr�pria matriz.
 */

package arrays;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		int [][] matriz1 = new int [2][2], matriz2 = new int [2][2], 
				matrizSoma = new int [2][2], matrizSubtracao= new int [2][2];
		int opcao;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("\nInsira n�meros na primeira matriz: ");
		for(int l=0;l<2;l++) {
			for (int c=0;c<2;c++) {
				System.out.print("["+l+"]["+c+"] = ");
				matriz1[l][c] = entrada.nextInt();
			}
		}
		
		System.out.println("\nInsira n�meros na segunda matriz: ");
		for(int l=0;l<2;l++) {
			for (int c=0;c<2;c++) {
				System.out.print("["+l+"]["+c+"] = ");
				matriz2[l][c] = entrada.nextInt();
			}
		}
		
		
		System.out.println("\nEscolha uma opera��o: "
				+ "\n1) somar as duas matrizes\r\n"
				+ "\n2) subtrair a primeira matriz da segunda\r\n"
				+ "\n3) adicionar uma constante as duas matrizes\r\n"
				+ "\n4) imprimir as matrizes");
		
		opcao = entrada.nextInt();
		
		switch (opcao) {
		case 1:
			
		
		}
		

	}

}
