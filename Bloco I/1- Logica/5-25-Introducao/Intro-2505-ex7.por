programa
{
	
	funcao inicio()
	{
		inteiro a, b, c, d, ee, f, x, y
		
		escreva("Insira 6 valores")
		escreva("\nA= ") leia(a)
		escreva("\nB= ") leia(b)
		escreva("\nC= ") leia(c)
		escreva("\nD= ") leia(d)
		escreva("\nE= ") leia(ee)
		escreva("\nF= ") leia(f)

		x= (c*ee - b*f)/(a*ee - b*d)
		y= (a*f - c*d)/(a*ee - b*d)

		escreva("\nResultados:")
		escreva("\nX= ",x)
		escreva("\nY= ",y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {a, 6, 10, 1}-{b, 6, 13, 1}-{c, 6, 16, 1}-{d, 6, 19, 1}-{ee, 6, 22, 2}-{f, 6, 26, 1}-{x, 6, 29, 1}-{y, 6, 32, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */