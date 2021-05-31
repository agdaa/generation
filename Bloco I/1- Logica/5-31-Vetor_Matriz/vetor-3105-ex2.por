programa
{
	/* Um dado é lançado 10 vezes e o valor correspondente é anotado. 
	 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
	 * A seguir determine e imprima a média aritmética dos lançamentos, 
	 * contabilize e apresente também quantas foram as ocorrências da maior pontuação.
	 */
	
	funcao inicio()
	{
		inteiro num_dado, x, lances[10], total=0, maior=0, qtdmaior=0
		
		para (x=0;x<=9;x++){ 
			escreva("Numero sorteado: ")
			leia (num_dado)
			lances[x]=num_dado
			total=total+num_dado
			se (lances[x]>maior) { maior=lances[x] }
		}
		escreva("\nMédia dos lançamentos: ",total/10)
		
		para (x=0;x<=9;x++){ 
			se (lances[x]==maior) { qtdmaior++ }
		}
		escreva("\nMaior número sorteado: ",maior, " (", qtdmaior ," ocorrencias)")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 616; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */