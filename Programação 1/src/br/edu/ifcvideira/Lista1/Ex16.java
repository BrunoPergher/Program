package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

/*
 * um bloco de madeira tem massa de 200g e volume de 500cm³
 * a) calcue a densidade desse bloco
 * b) qual e a pressao exercida pelo bloconuma superficie horizontal de 100cm²
 */
public class Ex16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double massa;
		double volume;
		double superficie1;
		double superficie2;
		
		
		System.out.println("dia o valor da massa");
		massa = Double.parseDouble(in.nextLine());
		
		System.out.println("dia o valor do volume");
		volume = Double.parseDouble(in.nextLine());
		
		System.out.println("dia o valor da superficie com o objeto deitado");
		superficie1 = Double.parseDouble(in.nextLine());
		
		System.out.println("dia o valor da superficie com o objeto em pé");
		superficie2  = Double.parseDouble(in.nextLine());
		
		double gravidade = Math.pow(10, -3);
		double densidade = massa/volume;
		double peso = massa*gravidade;
		double pressao1 = peso/superficie1;
		double pressao2 = peso/superficie2;
				
		
		System.out.println("a) a densidade é " +densidade);
		System.out.println("b)a pressao exercida em 50cm² é " +pressao2+ " ja a pressao exercida em 100cm² é" +pressao1);
		
		in.close();
	}
}
