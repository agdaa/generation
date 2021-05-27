programa
{

//Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
	
	funcao inicio()
	{
		inteiro s, m, h, sTotal
		
		escreva("Escreva a duração do evento em segundos:")
		leia(sTotal)
		
		h = sTotal/3600
		m = (sTotal%3600)/60
		s = (sTotal%3600) - (m*60)
		
		escreva("\nO evento durou ",h ,":",m, ":",s, ".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 407; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */