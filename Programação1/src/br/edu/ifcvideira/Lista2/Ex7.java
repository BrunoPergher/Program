package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

//Ler 3 valores e escrever a soma dos 2 maiores (Considerando valores distintos).
public class Ex7 {
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
					
					double num1;
					double num2;
					double num3;
					double soma;
					
					System.out.println("me diga um numero");
					num1 = Double.parseDouble(in.nextLine());
					
					System.out.println("me diga outro numero");
					num2 = Double.parseDouble(in.nextLine());
					
					System.out.println("diga masi um numerozin");
					num3 = Double.parseDouble(in.nextLine());
					
					if (num1 > num2 && num3 > num2) {
						soma = num1 + num3;
						System.out.println("o valor da soma dos dois maiores é :" +soma);
					}
					
					else if (num2 > num1 && num3 > num1) {
						soma = num2 + num3;
						System.out.println("a soma dos dois maiores é" +soma);
						
						
					}
					else {
						soma = num1 + num3;
						System.out.println("a soma dos dois maiores é" +soma);
					}
					in.close();
	}
}
