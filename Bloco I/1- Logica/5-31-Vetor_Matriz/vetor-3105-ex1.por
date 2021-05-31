programa
{
	/* Faça um programa que crie um vetor por leitura 
	 *  com 5 valores de pontuação de uma atividade 
	 *  e o escreva em seguida. 
	 *  Encontre após a maior pontuação e a apresente.
	 */
	
	funcao inicio()
	{
		inteiro cont=1, x, xmaior=0
		real pontuacao[5], maiorpont=0.0

		para (x=0;x<=4;x++)
		{
			escreva("Insira pontuação ",cont,": ")
			leia(pontuacao[x])
			cont++
			se (pontuacao[x]>maiorpont){
				maiorpont=pontuacao[x]
				xmaior=x
			}
		}

		limpa()
		cont=0

		para (x=0;x<=4;x++)
		{
			escreva("\nPontuação ",cont," = ",pontuacao[x])
			cont++ 
		}

		escreva("\nPontuação ",xmaior," é a maior: ",maiorpont)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 554; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */