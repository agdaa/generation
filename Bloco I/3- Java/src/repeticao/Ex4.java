/*
 * Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas; o número de mulheres nervosas; o número de homens agressivos;
o número de outros calmos; o número de pessoas nervosas com mais de 40 anos;
o número de pessoas calmas com menos de 18 anos.
 */

package repeticao;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		int idade, sexo, psi, qtdTotal=0, 
				qtdCal=0, qtdFemNerv=0, qtdMascAgres=0, qtdOutCal=0, qtdNerv40=0, qtdCalm18=0;
		Scanner entrada = new Scanner(System.in);
		
		
		while(qtdTotal<=5) {
			
			System.out.println("\nInsira as informações do indivíduo.");
			System.out.print("\nIdade: ");
			idade = entrada.nextInt();
			
			while(idade<1 || idade>120) {
				System.out.println("\tIdade inválida.");
				System.out.print("\nIdade: ");
				idade = entrada.nextInt();
			}
			
			System.out.print("Sexo (1-Feminino 2-Masculino 3-Outros): ");
			sexo = entrada.nextInt();
			
			while(sexo<1 || sexo>3) {
				System.out.println("\tCódigo inválido.");
				System.out.print("\nSexo (1-Feminino 2-Masculino 3-Outros): ");
				sexo = entrada.nextInt();
			}
			
			System.out.print("Temperamento (1-calmo 2-nervoso 3-agressivo): ");
			psi = entrada.nextInt();
			
			while(psi<1 || psi>3) {
				System.out.println("\tCódigo inválido.");
				System.out.print("\nTemperamento (1-calmo 2-nervoso 3-agressivo): ");
				psi = entrada.nextInt();
			}
			
			System.out.print("\n-----------\n");
			
			if (psi==1) 			{ qtdCal++; }
			if (sexo==1 && psi==2)	{ qtdFemNerv++; }
			if (sexo==2 && psi==3)	{ qtdMascAgres++; }
			if (sexo==3 && psi==1)	{ qtdOutCal++; }
			if (psi==2 && idade>40)	{ qtdNerv40++; }
			if (psi==1 && idade<18)	{ qtdCalm18++; }	
				
			qtdTotal++;
			
		}
		
		System.out.printf(
				"\nResultados:\n\t"
				+ "Pessoas calmas = %d \n\t"
				+ "Mulheres nervosas = %d \n\t"
				+ "Homens agressivos = %d \n\t"
				+ "Outros calmos = %d \n\t"
				+ "Pessoas nervosas com mais de 40 anos = %d \n\t"
				+ "Pessoas calmas com menos de 18 anos = %d ",
				qtdCal, qtdFemNerv, qtdMascAgres, qtdOutCal, qtdNerv40, qtdCalm18);

	}

}
