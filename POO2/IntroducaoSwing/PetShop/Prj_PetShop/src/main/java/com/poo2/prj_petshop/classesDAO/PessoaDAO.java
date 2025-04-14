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
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public Pessoa salvar(Pessoa p){
        
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

    public ArrayList<Pessoa> buscar(){
        
        ArrayList<Pessoa> pessoa = new ArrayList();

        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT nome FROM Pessoa");
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Pessoa tutor = new Pessoa();
                tutor.setNome(rs.getString("nome"));
                pessoa.add(tutor);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
        
        return pessoa;
        
    }

    public ArrayList<Pessoa> buscarLetra(Pessoa p) {
        
        ArrayList<Pessoa> pessoa = new ArrayList<>();
        
        try{
            
            ResultSet rs;
            PreparedStatement stmt;
            
            if(p.getNome().equals("")){
            
                stmt = conn.prepareStatement("SELECT nome FROM Pessoa");
                
            }else{
                
                stmt = conn.prepareStatement("SELECT nome FROM Pessoa WHERE nome like ?");
                stmt.setString(1,p.getNome() + "%");
                 
            }
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Pessoa pe = new Pessoa();
                pe.setNome(rs.getString("nome"));
                pessoa.add(pe);
                
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return pessoa;
        
    }

    public Pessoa buscarDono(Pessoa nome) {
        
        Pessoa tutor = new Pessoa();
        
        try{
            
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Pessoa WHERE nome = ?");
            
            stmt.setString(1, nome.getNome());
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                           
                tutor.setId(rs.getInt("idpessoa"));
                tutor.setNome(rs.getString("nome"));
                tutor.setCpf(rs.getString("cpf"));
                tutor.setData_nasc(md.date2String("data_nascimento"));    
                         
            }
                  
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return tutor;
        
    }
    
    public List<Pessoa> getPessoas(String nome){
    
        List<Pessoa> lstP = new ArrayList<>();
        ResultSet rs;
        
        try{
            
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM Pessoa WHERE nome LIKE ?");
            ppStmt.setString(1,nome+"%");
            rs = ppStmt.executeQuery();
            while(rs.next()){
                
                lstP.add(getPessoa(rs));
                
            }
                    
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return lstP;
        
    }
    
    public Pessoa getPessoa(ResultSet rs) throws SQLException{
    
        Pessoa p = new Pessoa();
        
        p.setId(rs.getInt("idpessoa"));
        p.setNome(rs.getString("nome"));
        p.setCpf(rs.getString("cpf"));
        p.setData_nasc(md.date2String(rs.getString("data_nascimento")));
     
        return p;
        
    }

    public void excluir(Pessoa pessoa) {
        
        try{
        
            PreparedStatement stmt1 = conn.prepareStatement("UPDATE Pet SET idpessoa = null WHERE idpessoa = ?");
            stmt1.setInt(1, pessoa.getId());
            stmt1.executeUpdate();
            
            PreparedStatement stmt2 = conn.prepareStatement("DELETE FROM Pessoa WHERE idpessoa = ?");
            
            stmt2.setInt(1, pessoa.getId());
            stmt2.executeUpdate();
                  
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
    }

    public void editar(Pessoa pessoa) {
        
        
        try{
            
            PreparedStatement stmt = conn.prepareStatement("UPDATE Pessoa SET nome = ?, cpf = ?, data_nascimento = ? WHERE idpessoa = ?");
            
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getCpf());
            stmt.setDate(3, md.string2Date(pessoa.getData_nasc()));
            stmt.setInt(4, pessoa.getId());
            
            stmt.executeUpdate();
        
        }catch(SQLException ex){
            ex.printStackTrace();
        }
           
    }
    
}