package com.mycompany.prj_padrao_factory2;

/**
 *
 * @author Lucas
 */
public class VolkswagenFactory implements CarFactory{
    
    public Car createCar(){
    
        return new Polo();
    
    }
    
}
