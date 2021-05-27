programa
{
	
	funcao inicio()
	{
		inteiro d, m, a, dTotal
		
		escreva("Escreva sua idade em dias, meses e anos.")
		escreva("\nAnos:")
		leia(a)
		escreva("\nMeses:")
		leia(m)
		escreva("\nDias:")
		leia(d)

		dTotal = d + (m*30) + (a*365)
		
		escreva("\nVocê já viveu cerca de "+dTotal+ " dias!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 248; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */