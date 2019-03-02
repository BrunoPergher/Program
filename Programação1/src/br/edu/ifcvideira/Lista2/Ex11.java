package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

/*Faça um programa que receba um valor qualquer,
 *  ao usuário digitar 1 converta para m2, ao usuário digitar 2, converta para m3.*/


public class Ex11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double val;
		double m2;
		double m3;
		double umdois;
		
		
		System.out.println("qual o numero a ser convertido (em centimetros)?");
		val = Double.parseDouble(in.nextLine());
		
		m2 = val / 1000;
		m3 = val / 1000000;
		
		System.out.println("digite 1 para transformar em m² ou digite 2 para transformar par m³");
		umdois = Double.parseDouble(in.nextLine());
		
		if (umdois == 1) {
			System.out.println("em m² fica: " +m2);
		}
		
		else if (umdois == 2) {
			System.out.println("em m³ fica " +m3);
			
		}
		
		in.close();
	}
}
