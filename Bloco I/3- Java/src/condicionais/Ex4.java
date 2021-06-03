package condicionais;
import java.util.Scanner;

/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer 
 * e exiba se este n�mero � par ou �mpar. 
 * Se for par exiba tamb�m a raiz quadrada do mesmo; 
 * se for �mpar exiba o n�mero elevado ao quadrado.
 */
public class Ex4 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um n�mero: ");
		num = entrada.nextInt();
		
		entrada.close();
		
		if(num%2 == 0) 
		{
			System.out.print("\nO n�mero � par");
			if (num<0) 
			{
				System.out.print(" e negativo.");
			} 
			else 
			{
				System.out.printf(".\nA raiz quadrada de %d � %.02f", num, Math.sqrt(num));
			}
		} 
		else 
		{
			System.out.printf("\nO n�mero � �mpar.\n%d ao quadrado � %.0f", num, Math.pow(num,2));
		}
		
	}

}
