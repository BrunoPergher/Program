package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

//1 – Ler um valor e escrever se é positivo, negativo ou zero.
public class Ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num;
		
		System.out.println("Diga um numero");
		num = Double.parseDouble(in.nextLine());
		
		if (num < 0) {
		System.out.println("é negativo");
			
		}
		
		else if (num > 0) {
			System.out.println("é positivo");
		}
	
		else {
			System.out.println("é zero");
			
		}
	in.close();
	}
}
