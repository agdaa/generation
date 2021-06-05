//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

package repeticao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		int num, x, contpar = 0, contimp = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira 10 números:");
		
		for (x = 0; x <= 9; x++) {
			System.out.print("> ");
			num = entrada.nextInt();
			if (num % 2 == 0) {
				contpar++;
			} else {
				contimp++;
			}
		}

		System.out.printf("\nVocê inseriu %d números pares e %d números ímpares.", contpar, contimp);

	}

}
