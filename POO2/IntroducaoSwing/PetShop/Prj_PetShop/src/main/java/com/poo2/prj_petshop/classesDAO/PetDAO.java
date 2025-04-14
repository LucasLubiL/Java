package com.poo2.prj_petshop.classesDAO;

import com.poo2.prj_petshop.objetos.Pessoa;
import com.poo2.prj_petshop.objetos.Pet;
import com.poo2.prj_petshop.utilitarios.Conexao;
import com.poo2.prj_petshop.utilitarios.ManipulaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

    public List<Pet> consultar(String nome) {
        
        List<Pet> lstPet = new ArrayList<>();
        ResultSet rs;
        
        try{
            
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM Pet WHERE nome LIKE ?");
            ppStmt.setString(1,nome+"%");
            rs = ppStmt.executeQuery();
            while(rs.next()){
                
                lstPet.add(getPet(rs));
                
            }
                    
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return lstPet;
        
    }
    
    public Pet getPet(ResultSet rs) throws SQLException{
    
        Pet pet = new Pet();
        
        pet.setId_pet(rs.getInt("idpet"));
        pet.setNome(rs.getString("nome"));
        pet.setEspecie(rs.getString("especie"));
        pet.setRaca(rs.getString("raca"));
        pet.setPorte(rs.getString("porte"));
        pet.setCor(rs.getString("cor"));
        pet.setData_nasc(md.date2String(rs.getString("data_nascimento")));
        
        return pet;
    
    }

    public void excluir(Pet pet) {
        
        try{
        
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM Pet WHERE idpet = ?");
            
            stmt.setInt(1, pet.getId_pet());
            stmt.executeUpdate();
                  
        }catch(SQLException ex){
            ex.printStackTrace();
        }    
    }

    public void editar(Pet pet) {
        
        try{
            
            PreparedStatement stmt = conn.prepareStatement("UPDATE Pet SET nome = ?, raca = ?, porte = ?, cor = ?, especie = ?, data_nascimento = ? WHERE idpet = ?");
            
            stmt.setString(1, pet.getNome());
            stmt.setString(2, pet.getRaca());
            stmt.setString(3, pet.getPorte());
            stmt.setString(4, pet.getCor());
            stmt.setString(5, pet.getEspecie());
            stmt.setDate(6, md.string2Date(pet.getData_nasc()));
            stmt.setInt(7, pet.getId_pet());
            
            stmt.executeUpdate();
        
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
    }
    
}
