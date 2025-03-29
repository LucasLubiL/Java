package com.poo2.prj_petshop.utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lucas
 */
public class Conexao {
    
    final private String driver = "org.postgresql.Driver";
    final private String url = "jdbc:postgresql://localhost:5432/" + "bd_petshop";
    final private String usuario = "postgres";
    final private String senha = "iftm";
    
    public Connection conectar(){
    
        Connection conn = null;
        
        try{
        
            Class.forName(driver);
            
            conn = DriverManager.getConnection(url,usuario,senha);
        
        }catch(ClassNotFoundException ex){
            
            ex.printStackTrace();
        
        }catch(SQLException ex){
        
            ex.printStackTrace();
            
        }
        
        return conn;
        
    }
    
}
