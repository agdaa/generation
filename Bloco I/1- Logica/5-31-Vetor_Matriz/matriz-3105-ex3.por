programa
{
	/* Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	 *  a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	 *  b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
	 */
	
	funcao inicio()
	{
		inteiro M1[4][6], M2[4][6], Msoma[4][6], Mdiferenca[4][6], x, y

		escreva ("\nInsira valores para Matriz 1\n") 
		para (x=0; x<4; x++){
			para (y=0; y<6; y++){
				escreva("> ")	leia (M1[x][y])
			}
		}

		limpa()
		escreva ("\nInsira valores para Matriz 2\n") 
		para (x=0; x<4; x++){
			para (y=0; y<6; y++){
				escreva("> ")	leia (M2[x][y])
			}
		}
		
		limpa()
		para (x=0; x<4; x++){
			para (y=0; y<6; y++){
				Msoma[x][y] = M1[x][y] + M2[x][y]
				Mdiferenca[x][y] = M1[x][y] - M2[x][y]
				escreva("\n[",x,"][",y,"] \t> ",M1[x][y],"+",M2[x][y],"= ",Msoma[x][y],"\t> ",M1[x][y],"-",M2[x][y]," = ",Mdiferenca[x][y])
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 976; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {M1, 10, 10, 2}-{M2, 10, 20, 2}-{Msoma, 10, 30, 5}-{Mdiferenca, 10, 43, 10}-{x, 10, 61, 1}-{y, 10, 64, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */