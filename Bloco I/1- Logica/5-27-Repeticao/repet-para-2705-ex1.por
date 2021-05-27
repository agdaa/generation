programa
{
/*
 * A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
 * coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.

 */
	
	funcao inicio()
	{
		real salario, totalsalarios=0.0, mediasalario, maiorsalario=0.0, mediafilhos
		inteiro filhos, totalfilhos=0, x, pessoas=4, qtdsalariocem=0
		cadeia nome

		para(x=1;x<=pessoas;x++){
			//escreva("\n\nNome: ") leia(nome)
			escreva("\nSalário: R$") leia(salario)
			escreva("\nQuantidade de filhos(as): ") leia(filhos)

			se (salario>maiorsalario) maiorsalario=salario
			se (salario<=100.0) qtdsalariocem++

			totalfilhos = totalfilhos + filhos
			totalsalarios = totalsalarios + salario
			//limpa()
		}

		mediafilhos = totalfilhos/pessoas
		mediasalario = totalsalarios/pessoas

		escreva("\n\nMédia do salário da população = R$",mediasalario)
		escreva("\nMédia do número de filhos = ",mediafilhos)
		escreva("\nMaior salário = R$", maiorsalario) 
		escreva("\nPercentual de pessoas com salário até R$100,00 = ", (qtdsalariocem*100)/pessoas, "%")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 529; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */