package br.com.saida.exercicio;

import javax.swing.JOptionPane;

public class Saida {

	public static void main(String[] args) {
	
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		String sobreNome = JOptionPane.showInputDialog("Digite o sobrenome: ");
		String nomeCompleto = nome + " " + sobreNome;
		
		JOptionPane.showMessageDialog(null, "nome completo: " + nomeCompleto,"informaçao", JOptionPane.ERROR_MESSAGE);
		

	}

}
