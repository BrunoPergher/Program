package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

//Ler 3 valores e escrevę-los em ordem crescente (Considerando valores distintos).
public class Ex8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double v1;
		double v2;
		double v3;

		System.out.println(" Indique um numero ");
		v1 = Double.parseDouble(in.nextLine());

		System.out.println(" Indique outro numero ");
		v2 = Double.parseDouble(in.nextLine());

		System.out.println(" Indique mais um numero ");
		v3 = Double.parseDouble(in.nextLine());

		if( v1 < v2 && v2 < v3 ) {

			System.out.println ( v1 + " " + v2 + " " + v3);

		} else if( v1 < v3 && v3 < v2 ) {

			System.out.println ( v1 + " " + v3 + " " + v2);

		} else if( v2 < v1 && v1 < v3 ) {

			System.out.println ( v2 + " " + v1 + " " + v3);

		} else if( v2 < v3 && v3 < v1 ) {

			System.out.println ( v2 + " " + v3 + " " + v1);

		} else if( v3 < v2 && v2 < v1 ) {

			System.out.println ( v3 + " " + v2 + " " + v1);

		} else  {

			System.out.println ( v3 + " " + v1 + " " + v2);

		}
		in.close();
	}

	}
