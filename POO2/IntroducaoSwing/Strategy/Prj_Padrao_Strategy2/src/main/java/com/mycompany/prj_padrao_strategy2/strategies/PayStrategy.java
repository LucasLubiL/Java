package com.mycompany.prj_padrao_strategy2.strategies;

/**
 *
 * @author Lucas
 */
public interface PayStrategy {
    
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
    
}
