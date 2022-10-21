package br.com.exemplo.classe;
import java.util.Scanner;
public class Principal {
    public static void main(String [] args){
        String nome;
        int matricula, i;
        String Buscar;

        Aluno[]alunos = new Aluno[10];
        Scanner ler = new Scanner(System.in);

        for (i=0;i<10;i++){

            System.out.println("Digite a matricula");
            matricula=ler.nextInt();
            System.out.println("Digite nome");

            nome = ler.nextLine();
            nome = ler.nextLine();
            alunos[i] = new Aluno(nome,matricula);
            System.out.println(alunos[i].Mostrar());

        }
        System.out.println("Digite um nome para buscar");
        Buscar = ler.nextLine();
        for(i=0;i<10;i++){
            if(alunos[i].getNome().equals(Buscar))
                System.out.println("nome encontrado com sucesso");
        }

    }
}
