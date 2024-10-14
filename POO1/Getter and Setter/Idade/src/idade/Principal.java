package idade;

/**
 *
 * @author User
 */
public class Principal {

   
    public static void main(String[] args) {
       
        Idade pessoa = new Idade();
        pessoa.setNome("Lucas Amaral");
        pessoa.setSexo('M');
        pessoa.setIdade(22);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println(pessoa.verificarIdade() + "\n");
     
        Idade pessoa2 = new Idade("Paola",17,'F');
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Sexo: " + pessoa2.getSexo());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println(pessoa2.verificarIdade());
        
    }
    
}
