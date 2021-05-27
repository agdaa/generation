programa
{
/* Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
 *  E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
 *  Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
 *  A hora excedente de trabalho vale R$20,00. No final do processamento imprimir o salário total e o salário excedente.
*/
	
	funcao inicio()
	{
		cadeia C
		inteiro Nh
		real S, E = 0.0
		
		escreva("Código do operário: ") leia(C)
		escreva("\nNúmero de horas trabalhadas: ") leia(Nh)

		se (Nh>50)
		{
			E = (Nh-50)*20.0
			S = 500 + E
		} 
		senao 
		{
			S = Nh*10.0
		}

		escreva("\nSalário total= R$", S)
		escreva("\nSalário excedente= R$", E)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 721; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */