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
		inteiro industria
		real indice
		
		escreva ("Insira o índice de poluição atual: ") leia(indice)
		escreva ("Industria (1, 2 ou 3): ") leia(industria)

		se (indice >=0.05 e indice<=0.25)
		{
			escreva ("\nÍndice de poluição está dentro do aceitável.")
		} 
		senao se (indice>0.25)
		{
			escreva ("\nÍndice de poluição acima do aceitável.")

			escolha (industria){
				caso 1:
					se (indice>=0.3){
						escreva ("\nEsta indústria está intimada a suspender suas atividades.")
					}
				caso 2:
					se (indice>=0.4){
						escreva ("\nEsta indústria está intimada a suspender suas atividades.")
					}
				caso 3:
					se (indice>=0.5){
						escreva ("\nEsta indústria está intimada a suspender suas atividades.")
					}
			}
		}
		senao 
		{
			escreva ("\nÍndice fora da classificação.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1229; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */