programa
{
	inclua biblioteca Matematica-->mat

	
	funcao inicio()
	{
		inteiro a, b, c
		real d, r, s
		
		escreva("Escreva 3 números inteiros positivos.")
		escreva("\nA: ")
		leia(a)
		escreva("\nB: ")
		leia(b)
		escreva("\nC: ")
		leia(c)

		r= mat.potencia((a+b), 2)
		s= mat.potencia((b+c), 2)
		d= (r+s)/2

		escreva("Resultado da expressão: \nD= ",d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 91; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */