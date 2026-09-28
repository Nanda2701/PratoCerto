/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prato_certo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fernanda
 */
public class LigaBD {
  private static final String URL = "jdbc:mysql://localhost:3306/prato_certo";
    private static final String USER = "root";
    private static final String PWD ="";
    
    public static Connection Ligacao(){
        
        try{
            
            Connection pratocerto = DriverManager.getConnection(URL, USER, PWD);
            
            System.out.println("Conexão estabelecido com sucesso!");
            
            return pratocerto;
            
        }catch(SQLException e){
            
            System.out.println("ERRO na ligação");
            e.printStackTrace();
            
            return null;
            
        }catch(Exception e){
            
            System.out.println("ERRO na ligação");
            e.printStackTrace();
            
            return null;
        }
        
    }       
}
