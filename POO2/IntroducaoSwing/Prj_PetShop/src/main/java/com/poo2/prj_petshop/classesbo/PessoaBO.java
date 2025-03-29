package com.poo2.prj_petshop.classesbo;

import com.poo2.prj_petshop.classesDAO.PessoaDAO;
import com.poo2.prj_petshop.objetos.Pessoa;

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
    
}
