programa
{
/*FACA ENQUANTO
 * Faça um programa que pegue um número do teclado e 
 * calcule a soma de todos os números  de 1 até ele. 
 * Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
 */
	
	funcao inicio()
	{
		inteiro x, soma=0, cont=0
		
		escreva("Insira um número: ") leia(x)
		
		faca
		{	cont++
			soma = soma+cont
		} enquanto (cont<x) 
	
		escreva(soma)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 375; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {x, 11, 10, 1}-{soma, 11, 13, 4}-{cont, 11, 21, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */