package gettersetter;

/**
 *
 * @author User
 */
public class Principal {
    public static void main(String[] args) {
        
       Carro fusca = new Carro();
        
       fusca.setMarca("Volkswagen");
       fusca.setModelo("Fusca");
       fusca.setAno(1982);
       fusca.setPreco(7000);
        
       System.out.println("Carro: " + fusca.getMarca() + " - " + fusca.getModelo());
       System.out.println("Ano: " + fusca.getAno()); 
       System.out.println("Valor Tabela Fipe: R$" + fusca.getPreco()); 
    }
    
}
