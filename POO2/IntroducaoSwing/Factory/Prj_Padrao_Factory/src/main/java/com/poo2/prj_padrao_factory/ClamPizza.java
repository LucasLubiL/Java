package com.poo2.prj_padrao_factory;

/**
 *
 * @author Lucas
 */
public class ClamPizza extends Pizza{
    
    public ClamPizza(){
    
        name = "Cheese Pizza";
        dough = "Thin Crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    
    }
    
}
