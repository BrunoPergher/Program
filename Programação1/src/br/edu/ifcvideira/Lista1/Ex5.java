package br.edu.ifcvideira.Lista1;

import java.util.Scanner;
//Faça um algoritmo para calcular o volume de um cilindro(pi*r^2*h)


public class Ex5 {
	
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
		
	double raio;
	double altura;
	double volume;
	
	System.out.println("Diga a altura do cilindro:");
	altura = Double.parseDouble(in.nextLine());
	
	System.out.println("Diga o raio do cilindro:");
	raio = Double.parseDouble(in.nextLine());
	
	volume = Math.PI * Math.pow(raio, 2) * altura;
	System.out.println("o volume vai ser" +volume);
	in.close();
	}

}
