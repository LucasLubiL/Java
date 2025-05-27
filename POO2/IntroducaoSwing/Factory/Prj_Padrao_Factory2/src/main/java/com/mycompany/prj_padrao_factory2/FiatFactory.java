package com.mycompany.prj_padrao_factory2;

/**
 *
 * @author Lucas
 */
public class FiatFactory implements CarFactory{
    
    public Car createCar(){
        
        return new Fiat_Strada();
    
    }
    
}
