package main.java.com.triagem.calc;

public class CALC {
    public static void main(String[] args) {
        double VALOR_BASE=311.82;
        double IPCA= 2.345768526;
        double VALOR_CORRIGIDO= VALOR_BASE*IPCA;
        System.out.println(VALOR_CORRIGIDO);
        double PSS= VALOR_CORRIGIDO* 11/100;
        System.out.println(PSS);
        double VALOR_SEM_PSS= VALOR_CORRIGIDO-PSS;
        System.out.println(VALOR_SEM_PSS);
        double juros_poupança=49.712/100;
        double valorjuros= juros_poupança*VALOR_SEM_PSS;
        System.out.println(valorjuros);
        double txselic= 4.020/100;
        double selicbase= valorjuros+VALOR_SEM_PSS;
        double basecalcselic= selicbase*txselic;
        System.out.println(basecalcselic);
        double s= VALOR_CORRIGIDO+valorjuros+basecalcselic;
        System.out.println(s);
    }
}
