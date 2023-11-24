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
public class conexao {
     public Connection getConexao() {
         try {
         
         Connection conn = DriverManager.getConnection(
                 "jdbc:mysql://localhost:3306/Biblioteca",
                 "root", 
                 "ribeiro");
         return conn;
         
         } catch (Exception e) {
         System.out.println("Erro ao conectar" + e.getMessage());
         return null;
         }        
     }}

    


