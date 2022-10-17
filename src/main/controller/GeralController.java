package main.controller;


import main.java.com.triagem.calc.CALC;
import main.modelo.Ipca;
import main.modelo.Juros_poup;
import main.modelo.SelicQQD;


import java.awt.*;
public class GeralController {
    private CALC alerquina = new CALC();
    private BancoController coringa = new BancoController();

    public String GERALCALC() throws InterruptedException, AWTException {
        String teste="jun/06";
        Ipca ipca = coringa.ipcadados(teste);
        Juros_poup juros_poup= coringa.juros_poupdados(teste);
        SelicQQD selic = coringa.dadosselic(teste);
        CALC.calc(ipca.getUtilizar(),juros_poup.getValor(),selic.getN_indice());



        return null;
    }
}
