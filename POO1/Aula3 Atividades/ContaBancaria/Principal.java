package exercícioContaBancária;

import java.util.Scanner;

/**
 *
 * @author IFTM
 */
public class Principal {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);
    
    ContaBancaria cliente = new ContaBancaria();
    
    System.out.println("Digite seu nome:");   
    cliente.titular = sc.nextLine();
    System.out.println("Digite seu saldo:"); 
    cliente.saldo = sc.nextDouble();
    
    int x=1;
    
    while(x!=0){
    
    System.out.println("Qual operaçao voce deseja fazer?");
    System.out.println("Digite 1 - sacar:");
    System.out.println("Digite 2 - depositar:"); 
    System.out.println("Digite 3 - saldo:"); 
    System.out.println("Digite 0 - finalizar operação:"); 
  
    int qual;
    
    qual=sc.nextInt();
    
    while(qual<0 || qual>3){
        
        System.out.println("Por favor digite um valor válido");
        System.out.println("Digite 1 - sacar:");
        System.out.println("Digite 2 - depositar:"); 
        System.out.println("Digite 3 - saldo:"); 
        System.out.println("Digite 0 - finalizar operação:"); 
        
        qual=sc.nextInt();
        
    }
    
    if(qual==1){
        cliente.sacar();
    }else if(qual==2){
        cliente.depositar();
    }else if(qual==3){
        cliente.saldo();
    }else{
        System.out.println("OPERAÇÃO FINALIZADA!");
        break;
    }
    
    
    
    }
    
    sc.close();
        

    }
    
}
