package condicionais;
import java.util.Scanner;

/*
 * Faça um programa em que permita a entrada de um número qualquer 
 * e exiba se este número é par ou ímpar. 
 * Se for par exiba também a raiz quadrada do mesmo; 
 * se for ímpar exiba o número elevado ao quadrado.
 */
public class Ex4 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		num = entrada.nextInt();
		
		entrada.close();
		
		if(num%2 == 0) 
		{
			System.out.print("\nO número é par");
			if (num<0) 
			{
				System.out.print(" e negativo.");
			} 
			else 
			{
				System.out.printf(".\nA raiz quadrada de %d é %.02f", num, Math.sqrt(num));
			}
		} 
		else 
		{
			System.out.printf("\nO número é ímpar.\n%d ao quadrado é %.0f", num, Math.pow(num,2));
		}
		
	}

}
