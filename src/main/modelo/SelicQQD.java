package main.modelo;

public class SelicQQD {

    private int id;
    private String mes_ano;
    private float indice_mensal;
    private float acumulado;
    private float N_indice;

    public float getIndice_mensal() {
        return indice_mensal;
    }

    public void setIndice_mensal(float indice_mensal) {
        this.indice_mensal = indice_mensal;
    }

    public float getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(float acumulado) {
        this.acumulado = acumulado;
    }

    public float getN_indice() {
        return N_indice;
    }

    public void setN_indice(float n_indice) {
        N_indice = n_indice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMes_ano() {
        return mes_ano;
    }

    public void setMes_ano(String mes_ano) {
        this.mes_ano = mes_ano;
    }
}
