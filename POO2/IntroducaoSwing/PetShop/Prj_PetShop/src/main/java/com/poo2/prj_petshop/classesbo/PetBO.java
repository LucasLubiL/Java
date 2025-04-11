package com.poo2.prj_petshop.classesbo;

import com.poo2.prj_petshop.classesDAO.PetDAO;
import com.poo2.prj_petshop.objetos.Pessoa;
import com.poo2.prj_petshop.objetos.Pet;

/**
 *
 * @author Lucas
 */
public class PetBO {
    
    PetDAO petDAO;
    
    public PetBO(){
    
        petDAO = new PetDAO();
        
    }
    
    public Pet salvar(Pet pet){
    
        return petDAO.salvar(pet);
        
    }
    
}
