package br.edu.ifcvideira.Lista2;

import java.util.Scanner;
/*4 - Ler 2 valores e escrever o maior deles.
 * 
 */
public class Ex4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("me diga um numero");
		num1 = Double.parseDouble(in.nextLine());
		
		System.out.println("me diga outro numero");
		num2 = Double.parseDouble(in.nextLine());
		
		if (num1 > num2) {
			System.out.println(num1+ " é o mairo numero");
		}
		else {
			System.out.println( num2+ " é maior");
		}
		in.close();
	}
}
