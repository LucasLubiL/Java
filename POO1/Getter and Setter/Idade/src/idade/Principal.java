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
        pessoa.verificarIdade(22);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println(pessoa.verificarIdade(pessoa.getNome));
        
        
    }
    
}
