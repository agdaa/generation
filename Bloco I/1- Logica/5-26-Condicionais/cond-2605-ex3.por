programa
{
	inclua biblioteca Matematica-->mat
	
	/* Desenvolva um sistema em que:
	Leia 4 (quatro) números;
	Calcule o quadrado de cada um;
	Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	Caso contrário, imprima os valores lidos e seus respectivos quadrados.
	
	*/

	funcao inicio()
	{
		real num1, num2, num3, num4, quad1, quad2, quad3, quad4
		escreva("\nInsira um número: ")
		leia(num1, num2, num3, num4)

		quad1 = mat.potencia(num1, 2.0)
		quad2 = mat.potencia(num2, 2.0)
		quad3 = mat.potencia(num3, 2.0)
		quad4 = mat.potencia(num4, 2.0)

		se (quad3>=1000){
			escreva("\n",num3,"² = ",quad3)
		} senao {
			escreva("\nQuadrado dos números: ")
			escreva("\n",num1,"² = ",quad1)
			escreva("\n",num2,"² = ",quad2)
			escreva("\n",num3,"² = ",quad3)
			escreva("\n",num4,"² = ",quad4)	
		} 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 641; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */