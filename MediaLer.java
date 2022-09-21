package br.com.media.ler.exercicio;

import javax.swing.JOptionPane;

public class MediaLer {

	public static void main(String[] args) {
		float nota1, nota2, calculaMedia;
		
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
		calculaMedia = (nota1 + nota2) /2;
		
		JOptionPane.showMessageDialog(null, "resultado da media: " + calculaMedia,"resultado", JOptionPane.ERROR_MESSAGE);
		


	}

}
