package main.controller;


import main.java.com.triagem.calc.CALC;
import main.modelo.Ipca;
import main.modelo.Juros_poup;
import main.modelo.SelicQQD;


import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeralController {
    private CALC alerquina = new CALC();
    private BancoController coringa = new BancoController();

    public String GERALCALC() throws InterruptedException, AWTException {
        String teste="jun/06,jul/06,ago/06,set/06,out/06,nov/06,dez/06,jan/07,fev/07,mar/07,abr/07,mai/07,jun/07,jul/07,ago/07,set/07,out/07,nov/07,dez/07,jan/08,fev/08,mar/08,abr/08,mai/08,jun/08,jul/08,ago/08,set/08,out/08,nov/08,dez/08,jan/09,fev/09,mar/09,abr/09,mai/09,jun/09,jul/09,ago/09,set/09,out/09,nov/09,dez/09,jan/10,fev/10,mar/10,abr/10,mai/10,jun/10,jul/10,ago/10,set/10,out/10,nov/10,dez/10,jan/11,fev/11,mar/11,abr/11,mai/11,jun/11,jul/11,ago/11,set/11,out/11,nov/11,dez/11,jan/12,fev/12,mar/12,abr/12,mai/12,jun/12,jul/12,ago/12,set/12,out/12,out/12,nov/12,dez/12,jan/13,fev/13,mar/13,abr/13,mai/13,jun/13,jul/13,ago/13,set/13,out/13,nov/13,dez/13,jan/14,fev/14,mar/14,abr/14,mai/14,jun/14,jul/14,ago/14,set/14,out/14";
        List<String> id_assuntos = new ArrayList<>(Arrays.asList(teste.split(",")));
        for(int i=0;i<id_assuntos.size();i++) {
            Ipca ipca = coringa.ipcadados(id_assuntos.get(i));
            Juros_poup juros_poup = coringa.juros_poupdados(id_assuntos.get(i));
            SelicQQD selic = coringa.dadosselic(id_assuntos.get(i));
            CALC.calc(ipca.getUtilizar(), juros_poup.getValor(), selic.getN_indice(),i);
        }


        return null;
    }
}
