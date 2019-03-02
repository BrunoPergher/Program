package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

/*Faça um algoritmo para ler uma temperatura em graus Fahrenheit,
calcular e escrever o valor correspondente em graus Celsius ( C=(F-32)/1.8) */
public class Ex8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double temperatura;
		double celsius;
		
		System.out.println("diga a temperatura em fahrenheit");
		temperatura = Double.parseDouble(in.nextLine());
		
		celsius = ((temperatura - 32) / 1.8);
		System.out.println("a temperatura em celsius é: " +celsius);
		in.close();
		
	}
}
