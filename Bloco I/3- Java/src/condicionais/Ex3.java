/*
 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
 */

package condicionais;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira sua idade: ");
		idade = entrada.nextInt();
		
		entrada.close();
		
		if (idade>=10 && idade<=14) {
			System.out.println("\nCategoria INFANTIL");
		} else if (idade>=15 && idade<=17){
			System.out.println("\nCategoria JUVENIL");
		} else if (idade>=18 && idade<=25){
			System.out.println("\nCategoria ADULTO");
		} else {
			System.out.println("\nEsta idade não se enquadra em nenhuma das categorias.");
		}

	}

}
