package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

/*9 - Fa�a um algoritmo que leia um n� inteiro e mostre uma mensagem indicando se este n�mero
 *  � par ou �mpar. Ex: se (x%2=0) �x � par�, se (x%2=1) �x � impar�*/
public class Ex9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n;
		
		System.out.println("diga um numero e eu direi se � imrpa ou par");
		n = Double.parseDouble(in.nextLine());
		
		if(n%2 == 0) {
			System.out.println("� par");
			
		}
		else {
			System.out.println("� impar");
		}
		in.close();
	}
}
