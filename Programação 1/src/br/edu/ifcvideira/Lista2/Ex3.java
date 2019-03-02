package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

/*Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se
 *  ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
 */


public class Ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double idade;
		
		System.out.println("qual sua idade?");
		idade = Double.parseDouble(in.nextLine());
		
		if (idade >= 16) {
			
			System.out.println("pode votar");
		}
		
		else {
			System.out.println("nao pode votar");
		}
		in.close();
	}
}
	
