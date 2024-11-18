package aulaarraylist;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Principal {

    
    public static void main(String[] args) {
        
        
        // ArrayList pertencente no pacote util
        // Estrututra de dados no formato de lista      
        ArrayList lista = new ArrayList();
        
        // Adicionando valores aleatorios na lista
        lista.add("Lucas");
        lista.add("Pedro");
        lista.add("Paulo");
        lista.add("Ian");
        lista.add(2.4);
        lista.add(100);
        lista.add(true);
        
        // Adicionando valor com indice
        lista.add(1, "Amaral");
        
        // Iterando a lista
        for(int i=0;i<lista.size();i++){
            
            System.out.println(lista.get(i));
            
        }
        
        System.out.println("\n//////////////////////////////////////////////////////////////\n");
        
        // Tamanho da lista
        System.out.println("A lista tem " + lista.size() + " posicoes.");
        
        System.out.println("\n//////////////////////////////////////////////////////////////\n");
        
        // Mostrando e removendo um elemento da lista
        System.out.println("Elemento 3: " + lista.get(3));
        System.out.println("Removendo");
        lista.remove(3);
        
        for(int i=0;i<lista.size();i++){
            
            System.out.println(lista.get(i));
            
        }
        
        System.out.println("\n//////////////////////////////////////////////////////////////\n");
        
        // Mostrando e removendo um elemento da lista
        System.out.println("Elemento 5: " + lista.get(5));
        System.out.println("Removendo");
        lista.remove(5);
        
        for(int i=0;i<lista.size();i++){
            
            System.out.println(lista.get(i));
            
        }
        
        System.out.println("\n//////////////////////////////////////////////////////////////\n");
        
        String elemento = "Lucas";
        // Atriuindo valor true se na lista contem o valor na variavel elemento
        boolean teste = lista.contains(elemento);
           
        // Verificando se o valor existe na lista
        if(teste){
            System.out.println("O valor (" + elemento + ") existe na lista");
        }else{
            System.out.println("Este valor nao existe");
        }
        
        System.out.println("\n//////////////////////////////////////////////////////////////\n");
        
        // Printando em qual posição da lista esta o valor 2.4
        System.out.println("O valor 2.4 esta localizado no indice: " + lista.indexOf(2.4));
        
    }
    
}
