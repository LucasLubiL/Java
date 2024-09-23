package carro;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class Carro {
    
    String marca;
    String modelo;
    int ano;
    double valor;
    
    public void cadastrarVeiculo(){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Marca do veiculo: ");
        marca=sc.nextLine();
        
        System.out.print("Modelo do veiculo: ");
        modelo=sc.nextLine();
        
        System.out.print("Ano do veiculo: ");
        ano=sc.nextInt();
        
        System.out.println("");
    
    }
    
    public void mostrarInformaçoes(){
        
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("");
        System.out.println("");
        
    }
    
    public void verificarTabelaFipe(){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite o valor do carro: ");
        valor=sc.nextDouble();
        
         System.out.println("O valor atualizado com mais 20% e de: R$" + String.format("%.2f",valor*0.20+valor));
         System.out.println("");
    }
    
    
}