package aulapoo1polimorfismo;

/**
 *
 * @author Lucas
 */
public class Principal {

    public static void main(String[] args) {
        
       Personalidade personalidade = new Personalidade();
       Pessimista pessimista = new Pessimista();
       Otimista otimista = new Otimista();
       Introvertida introvertida = new Introvertida();
       Extrovertida extrovertida = new Extrovertida();
       Proativo proativo = new Proativo();
       
       Personalidade[] variasPersonalidades = new Personalidade[6];
       variasPersonalidades[0] = personalidade;
       variasPersonalidades[1] = extrovertida;
       variasPersonalidades[2] = introvertida;
       variasPersonalidades[3] = otimista;
       variasPersonalidades[4] = pessimista;
       variasPersonalidades[5] = proativo;
       
       System.out.println("Personalidade:" + variasPersonalidades[0].falar());
       System.out.println("Extrovertida:" + variasPersonalidades[1].falar());
       System.out.println("Introvertida:" + variasPersonalidades[2].falar());
       System.out.println("Otimista:" + variasPersonalidades[3].falar());
       System.out.println("Pessimista:" + variasPersonalidades[4].falar());
       System.out.println("Proativo: " + variasPersonalidades[5].falar());
       
        System.out.println("\n////////////////////////////////////////////////////////////////////////////");
        
        pessimista.acionarFalar(variasPersonalidades[0]);
        personalidade.acionarFalar(variasPersonalidades[1]);
        personalidade.acionarFalar(variasPersonalidades[2]);
        personalidade.acionarFalar(variasPersonalidades[3]);
        personalidade.acionarFalar(variasPersonalidades[4]);
        personalidade.acionarFalar(variasPersonalidades[5]);
      
    }
    
}
