programa
{
	
	funcao inicio()
	{
		inteiro d, m, a, dTotal
		
		escreva("Escreva sua idade em dias:")
		leia(dTotal)
		a = dTotal/365
		m = (dTotal%365)/60
		d = (dTotal%365) - (m*60)
		
		escreva("\nVocê já viveu cerca de ",a ," anos, ",m, " meses e ",d, " dias.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 277; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */