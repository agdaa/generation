programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real x1, y1, x2, y2, d
		
		escreva("Insira as coordenadas de um ponto.")
		escreva("\nx= ") leia(x1)
		escreva("\ny= ") leia(y1)

		escreva("\nInsira as coordenadas de outro ponto.")
		escreva("\nx= ") leia(x2)
		escreva("\ny= ") leia(y2)

		d=  mat.raiz(mat.potencia(x2-x1, 2.0) + mat.potencia(y2-y1, 2.0), 2.0)
		
		escreva("\nDistância entre os pontos: ",mat.arredondar(d, 1))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 75; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */