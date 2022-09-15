package br.com.rendimento.pratica2;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite o valor inicial ");
		double vrInicial = ler.nextDouble();
		
		System.out.println("digite a taxa de juros ");
		double txJuros = ler.nextDouble();
		
		System.out.println("digite o numero de meses para o Rendimento ");
		int numMeses = ler.nextInt();
		
		 Rendimento r1 = new Rendimento(vrInicial,txJuros,numMeses);
		 r1.calculaRendimento();
	}

}

