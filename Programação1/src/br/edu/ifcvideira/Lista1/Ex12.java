package br.edu.ifcvideira.Lista1;
/*12 - Fa�a um algoritmo que calcule a m�dia de quatro n�meros inteiros. 
Os n�meros devem ser dados pelo usu�rio*/

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		double num1;
		double num2;
		double num3;
		double num4;
		double media;
		
		System.out.println("informe um numero: ");
		num1 = Double.parseDouble(in.nextLine());
		
		System.out.println("informe um numero: ");
		num2 = Double.parseDouble(in.nextLine());
		
		System.out.println("informe um numero: ");
		num3 = Double.parseDouble(in.nextLine());
		
		System.out.println("informe um numero: ");
		num4 = Double.parseDouble(in.nextLine());
		
		media = (num1 + num2 + num3 + num4) / 4;
		
		System.out.println("A m�dia dos 4 numeros � " +media );
		
		in.close();
		
		
		
	}

}
