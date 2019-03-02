package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

//Faça um algoritmo para calcular a área de um cubo retangular ((h*l)+(h*b)+(l*b))*2
public class Ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double altura;
		double lado;
		double base;
		double area;
		
		System.out.println("diga a base:");
		base = Double.parseDouble(in.nextLine());
		
		System.out.println("diga o tamanho do lado:");
		lado = Double.parseDouble(in.nextLine());
		
		System.out.println("diga a altura");
		altura = Double.parseDouble(in.nextLine());
		
		area = ((altura * lado) + (altura * base) + (lado * base)) *  2;
		System.out.println("a are do cubo é:" +area);
		
		in.close();
	}

}
