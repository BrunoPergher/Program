package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

//Ler 3 valores e escrever o maior deles (Considerando valores distintos).
public class Ex6 {
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
		
		if (num1 > num2 && num1 > num3) {
			
			System.out.println(num1+" é o maior");
		}
		
		else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 +" é o maior");
		}
		else {
			System.out.println(num3 +" é o maior");
		}
		in.close();
	}
}
