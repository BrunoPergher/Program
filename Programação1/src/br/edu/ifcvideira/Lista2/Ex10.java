package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

/*Leia quantos gols o TIME A marcou em uma partida e leia quantos gols o TIME B marcou.
 *  Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.*/
public class Ex10 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String n1;
		String n2;
		double a; //gols time n1
		double b; // gols time n2
		
		System.out.println("qual o nome do time?");
		n1 = String.valueOf(in.nextLine());
		
		System.out.println("qual o nome do outro time?");
		n2 = String.valueOf(in.nextLine());
		
		System.out.println("e quantos gols o " +n1+ " marcou ?");
		a = Double.parseDouble(in.nextLine());
		
		System.out.println("e quantos gols o " +n2+ " marcou ?");
		b = Double.parseDouble(in.nextLine());
		
		if (a > b) {
		System.out.println(" parabens ao " +n1+ " por ganhar a partida e ter feito " +a+ " Gols");
		}
		else if (a == b) {
			System.out.println("teve um empate entre os times " +n1+" e " +n2);
			
		}
		else {
			System.out.println(" parabens ao " +n1+ " por ganhar a partida e ter feito " +a+ " Gols");
		}
		in.close();
	}
}
