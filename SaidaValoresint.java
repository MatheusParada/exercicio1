package br.com.saida.exercicio;

import javax.swing.JOptionPane;

public class SaidaValoresint {

	public static void main(String[] args)  throws NumberFormatException {
		int valA = Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor A: "));
		int valB = Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor B: "));
		int resultado = valA * valB;
		
		JOptionPane.showMessageDialog(null, "Resultado Final: " + resultado,"resultado", JOptionPane.ERROR_MESSAGE);
		


	}

}
