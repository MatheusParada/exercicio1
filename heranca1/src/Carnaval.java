import javax.swing.JOptionPane;
public class Carnaval {

    public static void main(String[] args) {
        double valor, valorAdicional;
        int opcao;
        String localizacao;

        do {

            opcao = Integer.parseInt(JOptionPane.showInputDialog("<1> Ingresso normal \n<2>Ingresso Vip \n<3>Ingresso camarote \n<4> Sair"));

            switch (opcao) {
                case 1:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("valor do ingresso: "));
                    Normal ingressoNormal = new Normal(valor);
                    JOptionPane.showMessageDialog(null, ingressoNormal.imprimeIngresso(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;
                //System.out.println(ingressoNormal.imprimeIngresso());

                case 2:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("valor do ingresso: "));
                    valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("valor do ingresso: "));
                    Vip ingressoVip = new Vip(valor, valorAdicional);
                    JOptionPane.showMessageDialog(null, ingressoVip.imprimeIngresso(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;
                case 3:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("valor do ingresso: "));
                    valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("valor do ingresso: "));
                    localizacao = JOptionPane.showInputDialog("localizacao: ");
                    camarote ingressoCamarote = new camarote(valor, localizacao, valorAdicional);
                    JOptionPane.showMessageDialog(null, ingressoCamarote.imprimeIngresso(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Escolha corretamente" + JOptionPane.DEFAULT_OPTION);
            }

        }
        while (opcao != 4);
    }
}
