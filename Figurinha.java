package br.com.figurinha;
import java.util.Scanner;

public class Figurinha {

	public static void main(String[] args) {

		        String nome[] = new String[5];
		        String selecao[] = new String[5];
		        int idade[] = new int[5];
		        int sumIdade = 0, mediaIdade = 0;

		        Scanner entrada = new Scanner(System.in);

		        for (int i = 0; i < nome.length; i++) {
		            System.out.print("Entre com o nome do jogador da figurinha: ");
		            nome[i] = entrada.nextLine();
		            System.out.print("Entre com a idade deste jogador:");
		            idade[i] = entrada.nextInt();
		            entrada.nextLine();
		            System.out.print("Entre com a seleção deste jogador: ");
		            selecao[i] = entrada.nextLine();
		        }
		        for (int i = 0; i < idade.length; i++) {
		            if (nome[i].equals("Marquinhos")) {
		                System.out.println("Marquinhos vai levantar a taça do Hexa");
		            } else if (nome[i].equals("Hulk")) {
		                System.out.println("Dessa vez não vai dar para você!");
		            }
		            if (selecao[i].equals("Argentina")) {
		                System.out.println("Adeus los hermanos!!!");
		            }
		            sumIdade = sumIdade + idade[i];
		        }

		        mediaIdade = (sumIdade / idade.length);
		        System.out.println("A copa do mundo possui média de idade " + mediaIdade);
		    
		


	}

}
