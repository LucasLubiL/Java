package com.poo2.prj_petshop.classesbo;

import com.poo2.prj_petshop.classesDAO.PessoaDAO;
import com.poo2.prj_petshop.objetos.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class PessoaBO {
  
    PessoaDAO pDAO;
    
    public PessoaBO(){
        
        pDAO = new PessoaDAO();
        
    }
    
    public Pessoa salvar(Pessoa p){
    
        return pDAO.salvar(p);
        
    }
    
    public ArrayList<Pessoa> buscarPessoa(){
        
        return pDAO.buscar();
        
    }
    
    public ArrayList<Pessoa> carregarNome(Pessoa p){
        
        return pDAO.buscarLetra(p);
        
    }

    public Pessoa buscarDono(Pessoa nome) {
        
        return pDAO.buscarDono(nome);
        
    }
    
}
