/*
 * Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
o n�mero de pessoas calmas; o n�mero de mulheres nervosas; o n�mero de homens agressivos;
o n�mero de outros calmos; o n�mero de pessoas nervosas com mais de 40 anos;
o n�mero de pessoas calmas com menos de 18 anos.
 */

package repeticao;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		int idade, sexo, psi, qtdTotal=0, 
				qtdCal=0, qtdFemNerv=0, qtdMascAgres=0, qtdOutCal=0, qtdNerv40=0, qtdCalm18=0;
		Scanner entrada = new Scanner(System.in);
		
		
		while(qtdTotal<=5) {
			
			System.out.println("\nInsira as informa��es do indiv�duo.");
			System.out.print("\nIdade: ");
			idade = entrada.nextInt();
			
			while(idade<1 || idade>120) {
				System.out.println("\tIdade inv�lida.");
				System.out.print("\nIdade: ");
				idade = entrada.nextInt();
			}
			
			System.out.print("Sexo (1-Feminino 2-Masculino 3-Outros): ");
			sexo = entrada.nextInt();
			
			while(sexo<1 || sexo>3) {
				System.out.println("\tC�digo inv�lido.");
				System.out.print("\nSexo (1-Feminino 2-Masculino 3-Outros): ");
				sexo = entrada.nextInt();
			}
			
			System.out.print("Temperamento (1-calmo 2-nervoso 3-agressivo): ");
			psi = entrada.nextInt();
			
			while(psi<1 || psi>3) {
				System.out.println("\tC�digo inv�lido.");
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
