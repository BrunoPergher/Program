package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

/*- Faça um algoritmo que leia o nome de um piloto, leia a distância percorrida em km
 *  e o tempo que o piloto levou para percorrê-la (em horas). O algoritmo deve calcular
 *   a velocidade média (velocidade = distancia / tempo) - em km/h, e exibir a seguinte frase:
 *   A velocidade média do <nome do piloto> foi <velocidade media calculada> km/h.
 */


public class Ex15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nome;
		double km;
		double hr;
		double vm;
		
		System.out.println("qual o nome do piloto");
		nome = String.valueOf(in.nextLine());
		
		System.out.println("quanto km o " +nome+ " percorreu?" );
		km = Double.parseDouble(in.nextLine());
		
		System.out.println("quantas horas o piloto " +nome+ " demorou para realiza esses km?");
		hr = Double.parseDouble(in.nextLine());
		
		vm = km / hr ;
		
		System.out.println("a velocidade media do piloto " +nome+ " foi de " +vm+ " km/h.");
		in.close();
	}
}
