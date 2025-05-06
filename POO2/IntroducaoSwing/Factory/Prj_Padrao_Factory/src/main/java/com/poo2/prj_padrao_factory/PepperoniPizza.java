package com.poo2.prj_padrao_factory;

/**
 *
 * @author Lucas
 */
public class PepperoniPizza extends Pizza{
    
    public PepperoniPizza(){
    
        name = "Pepperoni Pizza";
        dough = "crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    
    }
    
}
