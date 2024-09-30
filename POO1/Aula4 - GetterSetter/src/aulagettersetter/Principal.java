package aulagettersetter;

/**
 *
 * @author IFTM
 */
public class Principal {

    
    public static void main(String[] args) {
        Carro fusca = new Carro();
        
        fusca.setMarca("Volkswagen");
        fusca.setModelo("Fusca");
        fusca.setAno(1982);
        
        System.out.println("Carro: " + fusca.getMarca() + "\n- " + fusca.getModelo());
        System.out.println("Ano: " + fusca.getAno());
        
    }
   
}
