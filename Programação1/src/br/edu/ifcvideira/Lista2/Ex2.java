package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

/*Ler as notas da 1a e 2a avalia��o de um aluno. Calcular a m�dia aritm�tica
 *  simples e escrever uma mensagem que diga se o aluno foi ou n�o aprovado
 *   (considerar que se a nota for igual ou maior que 7 o aluno � aprovado).
 *    Escrever tamb�m a m�dia calculada.
 */
public class Ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double av1;
		double av2;
		double media;
		
		System.out.println("qual a nota d aprimeira Aalia��o?");
		av1 = Double.parseDouble(in.nextLine());
		
		System.out.println("qual a nota dz segunda Avalia��o?");
		av2 = Double.parseDouble(in.nextLine());
		
		media = (av1 + av2) / 2 ;
		
		if ( media >= 7) {
			System.out.println("aprovado com m�dia " +media);
			
		}
		
		else {
			System.out.println("reprovado com media: " +media);
		}
	in.close();
	} 
	
	
}
