package br.com.Estoque.exercicio2;

public class Estoque {
	
	private String nome;
	private int qtdAtual;
	private int qtdMinima;
	
	public Estoque() {
	}
	
	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		super();
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}

	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	public void darBaixa(int qtde) {
		if (qtdAtual>=qtde)
		this.qtdAtual-=qtde;
		else 
			System.out.println("Saldo indisponivel");
	}	
		public boolean precisaRepor() {
			if (qtdAtual<=qtdMinima)
				return true;
			else
				return false;
		}
		
		public String mostra() {
			return "produto: " + getNome() + "\nEstoque Atual" + getQtdAtual() + "\nEstoque Minima" + getQtdMinima();
		}
	}
	

