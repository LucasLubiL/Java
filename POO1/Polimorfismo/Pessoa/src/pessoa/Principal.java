package pessoa;

/**
 *
 * @author Lucas
 */
public class Principal {

    
    public static void main(String[] args) {
        
        Pessoa pessoa1= new Pessoa();
        pessoa1.setNome("Lucas");
        pessoa1.setCodigo(66);
        pessoa1.setCadastro("12345");
        System.out.println("Nome: " + pessoa1.getNome() + "\nCodigo: " + pessoa1.getCodigo() + "\nCadastro: " + pessoa1.getCadastro() + "\n\n");
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Pedro");
        pessoa2.setCodigo(55);
        pessoa2.setCadastro("54321");
        System.out.println("Nome: " + pessoa2.getNome() + "\nCodigo: " + pessoa2.getCodigo() + "\nCadastro: " + pessoa2.getCadastro() + "\n\n");
        
        Usuario usuario1 = new Usuario();
        usuario1.setNome("Ana");
        usuario1.setCodigo(44);
        usuario1.setCadastro("98765");
        usuario1.setLogin("Ana123");
        usuario1.setSenha("123#123");
        System.out.println("Nome: " + usuario1.getNome() + "\nCodigo: " + usuario1.getCodigo() + "\nCadastro: " + usuario1.getCadastro() + "\nLogin: " + usuario1.getLogin() + "\nSenha: " + usuario1.getSenha() + "\n\n");
        
        Usuario usuario2 = new Usuario();
        usuario2.setNome("Julia");
        usuario2.setCodigo(33);
        usuario2.setCadastro("56789");
        usuario2.setLogin("Julia123");
        usuario2.setSenha("321#321");
        System.out.println("Nome: " + usuario2.getNome() + "\nCodigo: " + usuario2.getCodigo() + "\nCadastro: " + usuario2.getCadastro() + "\nLogin: " + usuario2.getLogin() + "\nSenha: " + usuario2.getSenha() + "\n\n");

        
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Rodrigo");
        cliente1.setCodigo(22);
        cliente1.setCadastro("91827");
        cliente1.setEmail("Rodrigo123@gmail.com");
        cliente1.setEndereco("Rua Antunes");
        cliente1.setTelefone("8899-5544");
        System.out.println("Nome: " + cliente1.getNome() + "\nCodigo: " + cliente1.getCodigo() + "\nCadastro: " + cliente1.getCadastro() + "\nEmail: " + cliente1.getEmail() + "\nEndereco: " + cliente1.getEndereco() + "\nTelefone: " + cliente1.getTelefone() + "\n\n");
        
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Pietra");
        cliente2.setCodigo(11);
        cliente2.setCadastro("675648");
        cliente2.setEmail("Pietra123@gmail.com");
        cliente2.setEndereco("Rua Cavalcante");
        cliente2.setTelefone("7744-3322");
        System.out.println("Nome: " + cliente2.getNome() + "\nCodigo: " + cliente2.getCodigo() + "\nCadastro: " + cliente2.getCadastro() + "\nEmail: " + cliente2.getEmail() + "\nEndereco: " + cliente2.getEndereco() + "\nTelefone: " + cliente2.getTelefone() + "\n\n");

    }
    
}
