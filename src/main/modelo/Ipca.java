package main.modelo;

public class Ipca {

    private String mes_ano;
    private float variação_mensal;
    private double variação_mensal1;
    private double utilizar;

    public String getMes_ano() {
        return mes_ano;
    }

    public void setMes_ano(String mes_ano) {
        this.mes_ano = mes_ano;
    }

    public float getVariação_mensal() {
        return variação_mensal;
    }

    public void setVariação_mensal(float variação_mensal) {
        this.variação_mensal = variação_mensal;
    }

    public double getVariação_mensal1() {
        return variação_mensal1;
    }

    public void setVariação_mensal1(double variação_mensal1) {
        this.variação_mensal1 = variação_mensal1;
    }

    public double getUtilizar() {
        return utilizar;
    }

    public void setUtilizar(double utilizar) {
        this.utilizar = utilizar;
    }
}

