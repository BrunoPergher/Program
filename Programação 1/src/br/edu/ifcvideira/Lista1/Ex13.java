package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

/*Fa�a um algoritmo que receba do usu�rio uma quantidade
 * de chuva dada em polegadas e exiba o equivalente em mil�metros (25,4 mm = 1 polegada).
 */
public class Ex13 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double mm;
		double pol;
		
		System.out.println("qual a quantida de chuva em polegadas ?");
		pol = Double.parseDouble(in.nextLine());
		
		mm = pol * 25.4;
		
		System.out.println("o numero em Milimetros � " +mm);
		in.close();
		
	}
}
