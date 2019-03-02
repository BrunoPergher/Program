package br.edu.ifcvideira.Lista1;
//7 – Faça um algoritmo para calcular o volume de um cone (pi*r^2*h) / 3)

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
				
		double raio;
		double altura;
		double area;
		
		System.out.println("diga o raio do cone");
		raio = Double.parseDouble(in.nextLine());
		
		System.out.println("diga a altura do cone");
		altura = Double.parseDouble(in.nextLine());
		
		area = ((Math.PI * (Math.pow(raio, 2)) * 2 * altura) / 3);
		System.out.println("o volume do cone é" +area);
		in.close();
	}
}
