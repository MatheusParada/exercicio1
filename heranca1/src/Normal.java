public class Normal extends ingresso{

    public Normal(double valorIngresso) {
        super(valorIngresso);
    }

    public String imprimeIngresso(){
        return "ingresso normal" + getValorIngresso();
    }
}
