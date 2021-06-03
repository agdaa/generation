package introjava;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		double custoConsum,custoFabrica;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Custo de Fábrica do veículo: R$ ");
		custoFabrica = entrada.nextFloat();
		entrada.close();
		
		custoConsum = custoFabrica + (custoFabrica*0.28) + (custoFabrica*0.45);
		System.out.printf("Custo ao Consumidor = R$ %,.2f", custoConsum);

	}

}
