package com.poo2.prj_petshop.classesbo;

import com.poo2.prj_petshop.classesDAO.PessoaDAO;
import com.poo2.prj_petshop.objetos.Pessoa;
import java.util.ArrayList;
import java.util.List;

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
    
    public List<Pessoa> getPessoas(String nome){
    
        return pDAO.getPessoas(nome);
    }

    public void exc(Pessoa pessoa) {
        
       pDAO.excluir(pessoa);
      
    }

    public void edit(Pessoa pessoa) {
        
        pDAO.editar(pessoa);
        
    }
    
}
