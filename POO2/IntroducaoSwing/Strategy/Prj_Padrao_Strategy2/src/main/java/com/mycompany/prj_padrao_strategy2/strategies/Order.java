package com.mycompany.prj_padrao_strategy2.strategies;

/**
 *
 * @author Lucas
 */
public class Order {
    
    private int totalCost = 0;
    private boolean isClosed = false;
    
    public void processOrder(PayStrategy strategy){
    
        strategy.collectPaymentDetails();
        
    }
    
    public void setTotalCost(int cost){
        
       this.totalCost += cost;
       
    }
    
    public int getTotalCost(){
        
        return totalCost;
        
    }
    
    public boolean isClosed(){
        
        return isClosed;
        
    }
    
    public void setClosed(){
    
        isClosed = true;
      
    }
    
}
