package com.poo2.prj_petshop.classesDAO;

import com.poo2.prj_petshop.objetos.Pet;
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
public class PetDAO {
    
    Connection conn;
    ManipulaData md;
    
    public PetDAO(){
    
        conn = new Conexao().conectar();
        md = new ManipulaData();
    
    }
    
    public Pet salvar(Pet pet){
    
        try{
                      
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Pet(nome, especie, raca, porte, cor, data_nascimento, idpessoa) values(?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, pet.getNome());
            stmt.setString(2, pet.getEspecie());
            stmt.setString(3, pet.getRaca());
            stmt.setString(4, pet.getPorte());
            stmt.setString(5, pet.getCor());
            stmt.setDate(6, md.string2Date(pet.getData_nasc()));
            stmt.setInt(7, pet.getP().getId());
               
            stmt.execute();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
            
                pet.setId_pet(rs.getInt("idpet"));
                
            }else{
            
                pet.setId_pet(-1);
            
            }
            
            
        }catch(SQLException ex){
    
            ex.printStackTrace();
            
        }

        return pet;

    }
    
}
