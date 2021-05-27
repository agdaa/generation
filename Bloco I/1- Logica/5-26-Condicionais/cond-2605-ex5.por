programa
{
	/*3 grupos de indústrias
	 * índice de poluição aceitável varia de 0,05 até 0,25
	 * Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, 
	 * se o índice crescer para 0,4 as indústrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, 
	 * se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades.
	 */
	
	funcao inicio()
	{
		real indice
		escreva ("Insira o índice de poluição atual:") leia(indice)

		se (indice >=0.05 e indice<=0.25)
		{
			escreva ("\nÍndice de poluição está dentro do aceitável.")
		} 
		senao se (indice>0.25)
		{
			escreva ("\nÍndice de poluição acima do aceitável.")
			se (indice>=0.3 e indice<0.4)
			{
				escreva ("\nIndústria 1 está intimada a suspender suas atividades.")
			} senao se (indice>=0.4 e indice<0.5){
				escreva ("\nIndústrias 1 e 2 estão intimadas a suspenderem suas atividades.")
			} senao se (indice>=0.5){
				escreva ("\nIndústrias 1, 2 e 3 estão intimadas a suspenderem suas atividades.")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1056; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */