package main.controller;

import main.Banco.ConexaoSQLite;
import main.modelo.Ipca;
import main.modelo.Juros_poup;
import main.modelo.SelicQQD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class BancoController {

    public Ipca ipcadados(String mes_ano) {
        Ipca ipca = new Ipca();
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        conexaoSQLite.conectar();
        String sql = "SELECT * FROM ipca where Mes_ano ="+"'"+mes_ano+"'"+";";
        PreparedStatement statement = conexaoSQLite.criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            ResultSet resultSet = statement.executeQuery() ;
            String teste="";
                ipca.setMes_ano(resultSet.getString("Mes_ano"));
                teste = resultSet.getString("variação_mensal");
            ipca.setVariação_mensal(Float.parseFloat(teste.replace(",",".")));
                teste = resultSet.getString("variação_mensal1");
            ipca.setVariação_mensal1(Double.parseDouble(teste.replace(",",".")));
               teste = resultSet.getString("UTILIZAR");
            ipca.setUtilizar(Double.parseDouble(teste.replace(",",".")));
            }
            catch (Exception e){

            }
        conexaoSQLite.desconectar();
        return ipca;
    }
    public Juros_poup juros_poupdados(String mes_ano) {
        Juros_poup Juros = new Juros_poup();
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        conexaoSQLite.conectar();
        String sql = "SELECT * FROM juros_poup where Mes_ano="+"'"+mes_ano+"'"+";";
        PreparedStatement statement = conexaoSQLite.criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            String teste="";
            ResultSet resultSet = statement.executeQuery();
            Juros.setMes_ano(resultSet.getString("Mes_ano"));
            teste = resultSet.getString("valor");
            Juros.setValor(Float.parseFloat(teste.replace(",",".")));
        }
        catch (Exception e){

        }
        conexaoSQLite.desconectar();
        return Juros;
    }
    public SelicQQD dadosselic(String Mes_ano) {
        SelicQQD selic = new SelicQQD();
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        conexaoSQLite.conectar();
        String sql = "SELECT * FROM SelicQQD where Mes_ano="+"'"+Mes_ano+"'"+";";
        PreparedStatement statement = conexaoSQLite.criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            String teste="";
            ResultSet resultSet = statement.executeQuery();

            selic.setId(resultSet.getInt("field1"));
            selic.setMes_ano(resultSet.getString("Mes_ano"));
            teste = resultSet.getString("indice mensal");
            selic.setIndice_mensal(Float.parseFloat(teste.replace(",",".")));
            teste= resultSet.getString("acumulado ate data");
            selic.setAcumulado(Float.parseFloat(teste.replace(",",".")));
            teste= resultSet.getString(6);
            selic.setN_indice(Float.parseFloat(teste.replace(",",".")));

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        conexaoSQLite.desconectar();
        return selic;
    }


}

