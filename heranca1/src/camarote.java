public class camarote  extends ingresso{
    private String localizacao;
    private double valorAdicional;

    public camarote(double valorIngresso, String localizacao, double valorAdicional) {
        super(valorIngresso);
        this.localizacao = localizacao;
        this.valorAdicional = valorAdicional;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    public String imprimeIngresso(){
        return "ingresso camarote: " + (getValorIngresso()+ getValorAdicional()) + "\n" +getLocalizacao();
    }
}
