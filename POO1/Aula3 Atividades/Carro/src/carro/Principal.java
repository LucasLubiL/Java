package carro;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class Principal {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Carro veiculo = new Carro();
        
        int op=1;
        
        while(op!=0){
            
            System.out.println("Escolha a operacao desejada:");
            System.out.println("Digite 1 - cadastrar veiculo");
            System.out.println("Digite 2 - verificar tabela fipe");
            System.out.println("Digite 3 - mostrar informacoes");
            System.out.println("Digite 0 - sair do sistema");
            op=sc.nextInt();
            
            if(op==1){
               veiculo.cadastrarVeiculo();
            }else if(op==2){
               veiculo.mostrarInformaçoes();
            }else if(op==3){
                veiculo.verificarTabelaFipe();
                
            } 
                
                
            
            
        
            
        }
        
        
    
        
        
        
        sc.close();
        
        
        
        
        
    }
    
}
