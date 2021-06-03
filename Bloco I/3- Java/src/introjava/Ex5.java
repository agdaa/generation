package introjava;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		float n1, n2, n3, media;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira as notas do aluno.");
		System.out.print("Nota1: ");
		n1 = entrada.nextFloat();
		System.out.print("Nota2: ");
		n2 = entrada.nextFloat();
		System.out.print("Nota3: ");
		n3 = entrada.nextFloat();
		
		entrada.close();
		media= ((n1*2) + (n2*3) + (n3*5))/10;
		System.out.println("\nMédia: "+media);
	}

}
