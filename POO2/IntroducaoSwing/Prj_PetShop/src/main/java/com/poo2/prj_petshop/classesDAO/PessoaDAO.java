package com.poo2.prj_petshop.classesDAO;

import com.poo2.prj_petshop.objetos.Pessoa;
import com.poo2.prj_petshop.utilitarios.Conexao;
import com.poo2.prj_petshop.utilitarios.ManipulaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lucas
 */
public class PessoaDAO {
    
    Connection conn;
    ManipulaData md;
    
    public PessoaDAO(){
    
        conn = new Conexao().conectar();
        md = new ManipulaData();
    
    }
    
    public Pessoa Salvar(Pessoa p){
        
        try{
        
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Pessoa(nome, cpf, data_nascimento) values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCpf());
            stmt.setDate(3, md.string2Date(p.getData_nasc()));
            stmt.execute();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
            
                p.setId(rs.getInt("idpessoa"));
                
            }else{
            
                p.setId(-1);
            
            }
            
            
        }catch(SQLException ex){
        
             ex.printStackTrace();
            
        }
          
        return p;
    
    }

    public Pessoa salvar(Pessoa p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
