package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

/*14 - Fa�a um algoritmo que l� o nome de um vendedor, l� o sal�rio fixo do vendedor,
 *l� o total (em reais) de vendas por ele efetuadas e l� o percentual que ganha sobre
 * o total de vendas. O algoritmo deve calcular o sal�rio total do vendedor e exibir,
 * ao final, a seguinte frase:
 * O vendedor <nome do vendedor> recebeu <salario total> reais
 */

public class Ex14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nome;
		double salFixo;
		double salTotal;
		double percVendas;
		double vendas;
		
		System.out.println("qual o nome do vendedor? ");
		nome = String.valueOf(in.nextLine());
		
		System.out.println("qual o salario fixo de " +nome+" ?");
		salFixo = Double.parseDouble(in.nextLine());
		
		System.out.println("quanto o vendedor " +nome+ " vendeu?");
		vendas = Double.parseDouble(in.nextLine());
		
		System.out.println("qual seu precentual de comissao?");
		percVendas = Double.parseDouble(in.nextLine());
		
		salTotal = (vendas * percVendas / 100) + salFixo;
		System.out.println("O vendedor " +nome +" recebeu" +salTotal+ " reais" );
		in.close();
		            
	}
}
