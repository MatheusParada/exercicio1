package br.com.aula1.exemplo1;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		String placa;
		int ano;
		
		System.out.println("Entre com a placa do carro");
		placa = ler.next();
		
		System.out.println("entre com o ano do carro");
		ano = ler.nextInt();
	
		
		if (ano<=2010)
		System.out.println("carro velho");
		
		else if(ano<=2021)
			System.out.println("carro semi-novo");
		
		else if (ano==2022)
		System.out.println("carro novo");
		else 
			System.out.println("Lançamento");
	}

}
