package br.com.exemplo.Banco;

public class Main {

	public static void main(String[] args) {
	ContaCorrente cc1 = new ContaCorrente("123-8",1000,5000);
	System.out.println("Saldo: " + cc1.getSaldo());
	System.out.println("Saldo total: "+ cc1.consultaSaldoTotal());
	
	ContaPoupanca cp1 = new ContaPoupanca("789-0",1000,2);
	System.out.println("Saldo " + cp1.getSaldo());
	cp1.calculaRendimento();
	System.out.println("Saldo apos o primeiro rendimento : " + cp1.getSaldo());

	}

}
