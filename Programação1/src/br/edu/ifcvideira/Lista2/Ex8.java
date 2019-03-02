package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

//Ler 3 valores e escrevê-los em ordem crescente (Considerando valores distintos).
public class Ex8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double num1;
		double num2;
		double num3;

		
		System.out.println("me diga um numero");
		num1 = Double.parseDouble(in.nextLine());
		
		System.out.println("me diga outro numero");
		num2 = Double.parseDouble(in.nextLine());
		
		System.out.println("diga masi um numerozin");
		num3 = Double.parseDouble(in.nextLine());
		
		
		in.close();
	}
}
