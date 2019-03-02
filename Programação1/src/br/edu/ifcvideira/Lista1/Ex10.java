package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

/*- Faça um algoritmo para calcular e exibir do salário líquido de um professor, onde
 o número de horas, o valor da hora e o percentual do INSS devem ser fornecidos pelo
 usuário:
salario_bruto <- num_hora_aula * valor_hora_aula 
salario_liquido <- salario_bruto – (salario_bruto * percentual_INSS). 
*/
public class Ex10 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 
		 double horas;
		 double ganhoHora;
		 double percentualINSS;
		 double salBruto;
		 double salLiquido;
		 
		 System.out.println("quantas horas vc trabalha por mes?");
		 horas = Double.parseDouble(in.nextLine());
		 
		 System.out.println("quantao vc ganha por hora?");
		 ganhoHora = Double.parseDouble(in.nextLine());
		 
		 System.out.println("qual o seu percentual do iNSS?");
		 percentualINSS = Double.parseDouble(in.nextLine());
		 
		 salBruto = horas * ganhoHora;
		 salLiquido = salBruto - (salBruto * percentualINSS /100);
		 System.out.println("seu salrio liquido é:" +salLiquido);
		 in.close();
		 
		  	}
}
