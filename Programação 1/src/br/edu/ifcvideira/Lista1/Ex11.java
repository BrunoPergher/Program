package br.edu.ifcvideira.Lista1;
/*Fa�a um algoritmo para calcular e exibir o valor de uma presta��o em atraso.
 *  prestacao_atrasada <- prestacao + (prestacao*(taxa/100)*num_dias_atraso),
 *   taxa � o percentual de juros por dia, num_dias_atraso � o n�mero de dias em 
 *   atraso e presta��o � o valor da presta��o normal. O valor da presta��o, a taxa 
 *   e o n�mero de dias em atraso devem ser fornecidos pelo usu�rio.
 */

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in );
			
		double prestacao;
		double taxa;
		double diasAtraso;
		double valorPrestacao;
		
		System.out.println("qual po valo0r da presta��o ?");
		prestacao = Double.parseDouble(in.nextLine());
		
		System.out.println("qual po valor da taxa ?");
		taxa = Double.parseDouble(in.nextLine());
		
		System.out.println("quantos dias a presta��o esta atrasada ?");
		diasAtraso = Double.parseDouble(in.nextLine());
		
		valorPrestacao = (prestacao + ((prestacao * taxa / 100) * diasAtraso));
		System.out.println("valor da preswta��o � " +valorPrestacao);
		in.close();
		
	}
}
