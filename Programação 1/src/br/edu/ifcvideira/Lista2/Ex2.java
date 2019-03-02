package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

/*Ler as notas da 1a e 2a avaliação de um aluno. Calcular a média aritmética
 *  simples e escrever uma mensagem que diga se o aluno foi ou não aprovado
 *   (considerar que se a nota for igual ou maior que 7 o aluno é aprovado).
 *    Escrever também a média calculada.
 */
public class Ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double av1;
		double av2;
		double media;
		
		System.out.println("qual a nota d aprimeira Aaliação?");
		av1 = Double.parseDouble(in.nextLine());
		
		System.out.println("qual a nota dz segunda Avaliação?");
		av2 = Double.parseDouble(in.nextLine());
		
		media = (av1 + av2) / 2 ;
		
		if ( media >= 7) {
			System.out.println("aprovado com média " +media);
			
		}
		
		else {
			System.out.println("reprovado com media: " +media);
		}
	in.close();
	} 
	
	
}
