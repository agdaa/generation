programa
{
	//Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.

	funcao inicio()
	{
		inteiro num
		escreva("Escreva um número: ")		
		leia(num)
		
		escreva("\nO número é ")

		se (num%2==0 e num!=0){
			escreva("par ") 
		} senao se (num!=0){
			escreva("ímpar ") }

		se (num>0){
			escreva("e positivo.") 
		} senao se (num<0){
			escreva("e negativo.") 
		} senao {
			escreva("zero.") 
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 329; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */