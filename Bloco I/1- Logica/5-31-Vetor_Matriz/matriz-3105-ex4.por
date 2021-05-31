programa
{
	/* Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
	 * e em seguida, exiba a soma dos valores dela 
	 * e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
	 */
	
	funcao inicio()
	{
		inteiro matriz[3][3], x, y, soma=0, soma_diag=0

		para (x=0; x<3; x++){
			para (y=0; y<3; y++){
				escreva("> ")	leia (matriz[x][y])
				soma = soma + matriz[x][y]
				se(x==y) soma_diag = soma_diag + matriz[x][y]
			}
		}

		escreva("\nSoma de todos os valores: ", soma)
		escreva("\nSoma da diagonal principal: ", soma_diag)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 163; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */