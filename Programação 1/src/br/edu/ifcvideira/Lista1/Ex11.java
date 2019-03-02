package br.edu.ifcvideira.Lista1;
/*Faça um algoritmo para calcular e exibir o valor de uma prestação em atraso.
 *  prestacao_atrasada <- prestacao + (prestacao*(taxa/100)*num_dias_atraso),
 *   taxa é o percentual de juros por dia, num_dias_atraso é o número de dias em 
 *   atraso e prestação é o valor da prestação normal. O valor da prestação, a taxa 
 *   e o número de dias em atraso devem ser fornecidos pelo usuário.
 */

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in );
			
		double prestacao;
		double taxa;
		double diasAtraso;
		double valorPrestacao;
		
		System.out.println("qual po valo0r da prestação ?");
		prestacao = Double.parseDouble(in.nextLine());
		
		System.out.println("qual po valor da taxa ?");
		taxa = Double.parseDouble(in.nextLine());
		
		System.out.println("quantos dias a prestação esta atrasada ?");
		diasAtraso = Double.parseDouble(in.nextLine());
		
		valorPrestacao = (prestacao + ((prestacao * taxa / 100) * diasAtraso));
		System.out.println("valor da preswtação é " +valorPrestacao);
		in.close();
		
	}
}
