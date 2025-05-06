package com.poo2.prj_padrao_factory;

/**
 *
 * @author Lucas
 */
public class PizzaStore {
    
    SimplePizzaFactory factory;
    
    public PizzaStore(SimplePizzaFactory factory){
    
        this.factory = factory;
        
    }
    
    public Pizza orderPizza(String type){
    
        Pizza pizza;
        
        pizza = factory.createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    
    }
    
}
