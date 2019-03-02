package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

/*- Ler 2 valores e escrevê-los em ordem crescente*/

public class Ex5 {
	public static void main(String[] args) {
		
Scanner in = new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("me diga um numero");
		num1 = Double.parseDouble(in.nextLine());
		
		System.out.println("me diga outro numero");
		num2 = Double.parseDouble(in.nextLine());
		
		if (num1 > num2) {
			System.out.println(num1+" , "+num2 );
		}
		else {
			System.out.println(num2+" , "+num1);
		}
		in.close();
	}
		
}

