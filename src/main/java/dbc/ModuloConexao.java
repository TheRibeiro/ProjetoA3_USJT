package dbc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LEOZI
 */

import java.sql.*;
public class ModuloConexao {
     public static Connection conector() {
        java.sql.Connection conexao = null;
        // chamar o drive importado//
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando Informaçõens//
        String url = "jdbc:mysql://localhost:3306/BibliotecaVirtual";
        String user = "root";
        String password = "ribeiro";
        
        //conexão com o banco de dados//
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        }
        catch (ClassNotFoundException | SQLException e){
            
            return null;
        }
    }

    public ModuloConexao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

