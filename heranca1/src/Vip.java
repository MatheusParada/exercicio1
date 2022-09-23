public class Vip  extends ingresso {
    private double valorAdicional;

    public Vip(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }


    public String imprimeIngresso() {
        return "ingresso vip: " + (getValorIngresso()+getValorAdicional());

    }
}