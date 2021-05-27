programa
{
/*
Elaborar um programa que efetue a leitura sucessiva de valores numéricos 
e apresente no final o total do somatório, a média e o total de valores lidos. 
O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
*/
	
	funcao inicio()
	{
		inteiro x, total=0, soma=0, media=0
		
		escreva("Insira os valores:\n") leia(x)
		
		enquanto(x>=0)
		{
			total++
			soma=soma+x
			leia(x)
		}
		
		se (total==0){ escreva("\nNão foram inseridos números positivos.")}
		senao {
			media = soma/total
			escreva("\n",total," número(s) positivo(s) inserido(s).")
			escreva("\nSoma: ",soma)
			escreva("\nMédia: ",media)

		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 690; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */