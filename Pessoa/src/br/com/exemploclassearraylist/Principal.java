package br.com.exemploclassearraylist;
import java.util.ArrayList;
import javax.swing.JOptionPane;


    public class Principal {

        public static void main(String[] args) {
            ArrayList<Pessoa> pessoas = new ArrayList<>();
            Pessoa p1;
            int opcao;

            do {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("<1> cadastrar\n<2>Visualizar\n<3>Sair>"));
                switch (opcao) {

                    case 1:
                        String nome = JOptionPane.showInputDialog("Digite o Nome");
                        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
                        String cpf = JOptionPane.showInputDialog("Digite o CPF");
                        p1 = new Pessoa(nome, idade, cpf);
                        pessoas.add(p1);
                        break;

                    case 2:
                        int i = 0;
                        for (Pessoa contato : pessoas) {
                            JOptionPane.showMessageDialog(null, i + " " + contato.getNome() + " " + contato.getCpf() + " " + contato.getIdade(), "Pessoas", JOptionPane.DEFAULT_OPTION);
                            i++;
                        }
                        break;
                    case 3:
                        String buscar = JOptionPane.showInputDialog(("nome para excluir"));
                        int j;

                        for (j = 0; j < pessoas.size(); j++) {
                            if (pessoas.get(j).getNome().equals(buscar))
                            {

                                pessoas.remove(j);
                            JOptionPane.showMessageDialog(null,"removido com sucesso", "pessoas", JOptionPane.DEFAULT_OPTION);
                        }
                }
                        break;
                case 4:
                    break;

                }
        }while(opcao !=3);
    }
    }

