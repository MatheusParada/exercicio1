package br.com.exercicio3.exercicio;

public class Exemplo1 {

	public static void main(String[] args) {
		int x=10, y=11, num, soma;
		num = x++;
		System.out.println("x: " +  x + "\ny: " + y + "\nnum: " + num);
		
		soma = (x + y)-(++y);
		System.out.println("x: " +  x + "\ny: " + y + "\nnum: " + num);

	}

}
