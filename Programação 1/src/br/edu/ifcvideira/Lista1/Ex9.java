package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

/*Fa�a um algoritmo para calcular e exibir
um sal�rio reajustado em 23,75%. O sal�rio atual deve ser fornecido pelo usu�rio*/

public class Ex9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double porcentagem = 23.75;
		double salario;
		double ajustado;
		
		System.out.println("diga seu salrio");
		salario = Double.parseDouble(in.nextLine());
		
		ajustado =  (porcentagem *  salario) / 100 + salario ;
		
		System.out.println(ajustado);
		in.close();
	}
}
