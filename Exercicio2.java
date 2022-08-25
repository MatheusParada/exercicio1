package ProjetoAula2;
import java.util.Scanner;
import java.util.Random;
public class Exercicio2 {

	public static void main(String[] args) {
		int opcao=0;
		String nome, cpf, horario, data;
		Scanner ler = new Scanner(System.in);
		Random numrandomico = new Random();
		
		while(opcao!=4) {
			
		System.out.print("1-Cadastrar Passageiro\n2-Check in\n3-Cancelar voo\n4-Sair");
		opcao = ler.nextInt();
		
		
		switch(opcao)
		{
		case 1:
			System.out.println("Nome:");
			nome = ler.next();
			System.out.println("CPF:");
			cpf = ler.next();
			System.out.println("Data do Voo: ");
			data = ler.next();
			System.out.println("Horario do Voo");
			horario = ler.next();
			System.out.println("voo cadastrado com sucesso: " + numrandomico.nextInt(999));
			break;
		case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
		}
		}
	}

}
