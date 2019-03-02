package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

/*9 - Faça um algoritmo que leia um nº inteiro e mostre uma mensagem indicando se este número
 *  é par ou ímpar. Ex: se (x%2=0) “x é par”, se (x%2=1) “x é impar”*/
public class Ex9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n;
		
		System.out.println("diga um numero e eu direi se é imrpa ou par");
		n = Double.parseDouble(in.nextLine());
		
		if(n%2 == 0) {
			System.out.println("é par");
			
		}
		else {
			System.out.println("é impar");
		}
		in.close();
	}
}
