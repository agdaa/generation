//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

package repeticao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		int num, x, contpar = 0, contimp = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira 10 n�meros:");
		
		for (x = 0; x <= 9; x++) {
			System.out.print("> ");
			num = entrada.nextInt();
			if (num % 2 == 0) {
				contpar++;
			} else {
				contimp++;
			}
		}

		System.out.printf("\nVoc� inseriu %d n�meros pares e %d n�meros �mpares.", contpar, contimp);

	}

}
