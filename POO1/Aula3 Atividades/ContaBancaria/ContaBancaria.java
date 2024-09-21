package exercícioContaBancária;


import java.util.Scanner;
/**
 *
 * @author IFTM
 */
public class ContaBancaria {
    
    
    Scanner sc = new Scanner(System.in);
    public double saldo;
    public String titular;
    
    
    public void depositar(){
        
        System.out.println("Valor do depósito:");
        double quant=sc.nextDouble();
        
        saldo=saldo+quant;
        
    }
    
    public void sacar(){
        
        System.out.println("Valor a sacar:");
        double sac=sc.nextDouble();
        
        saldo = saldo - sac;
       
    }
    
    public void saldo(){
        
        System.out.println("Seu saldo é de: " + String.format("%.2f", saldo));
      
    }
    
}
