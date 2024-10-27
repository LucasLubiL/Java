package aluno;

/**
 *
 * @author Lucas
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Aluno pessoa = new Aluno();
        pessoa.setNome("Lucas Amaral");
        pessoa.setIdade(22);
        pessoa.setNota(10.0);
        pessoa.setMatricula("12345-6");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Nota: " + pessoa.getNota());
        System.out.println("Matricula: " + pessoa.getMatricula() + "\n");
        
        Aluno pessoa2 = new Aluno();
        pessoa2.setNome("Ana Clara");
        pessoa2.setIdade(95);
        pessoa2.setNota(15.0);
        pessoa2.setMatricula("78910-1");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("Nota: " + pessoa2.getNota());
        System.out.println("Matricula: " + pessoa2.getMatricula() + "\n");
        
        Aluno pessoa3 = new Aluno("Joel de Oliveira", 10, -2.0, "56789-2");
        System.out.println("Nome: " + pessoa3.getNome());
        System.out.println("Idade: " + pessoa3.getIdade());
        System.out.println("Nota: " + pessoa3.getNota());
        System.out.println("Matricula: " + pessoa3.getMatricula() + "\n");
        
        Aluno pessoa4 = new Aluno("Clarice Almeida", 25, 5.0, "54321-0");
        System.out.println("Nome: " + pessoa4.getNome());
        System.out.println("Idade: " + pessoa4.getIdade());
        System.out.println("Nota: " + pessoa4.getNota());
        System.out.println("Matricula: " + pessoa4.getMatricula() + "\n");
        
    }
    
}
