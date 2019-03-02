package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

//1 – Faça um algoritmo para calcular a área superficial de um cilindro (2*pi*r*h)

public class Ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double raio;
		double altura;
		double area;
		
		System.out.println("Diga o raio");
		raio = Double.parseDouble(in.nextLine());
		
		System.out.println("Diga a altura");
		altura = Double.parseDouble(in.nextLine());
		
		area = 2	*	Math.PI	*	raio	*	altura;
		
		System.out.println("a area do clindro é:" +area);
		
		
		in.close();
		
		
		
	}
}
