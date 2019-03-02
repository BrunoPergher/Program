package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

//Faça um algoritmo para calcular a área de um cone(pi*r*h)


public class Ex4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double raio;
		double altura;
		double area;
		
		System.out.println("Diga o raio do cone:");
		raio = Double.parseDouble(in.nextLine());
		
		System.out.println("Diga o raio da altua:");
		altura = Double.parseDouble(in.nextLine());
		
		area = Math.PI * raio * altura;
		System.out.println("area do cone é:  " +area);
		
		in.close();
	}
}
