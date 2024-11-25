package biblioteca2;

/**
 *
 * @author Lucas
 */
public class Principal {

    public static void main(String[] args) {
       
        Livro livro1 = new Livro();
        livro1.setAutor("Lucas");
        livro1.setEdicao(3);
        livro1.setEditora("Editora Azevedo");
        livro1.setTitulo("O Malvado");
        livro1.setISBN(1234);
        livro1.setAtraso(true);
        livro1.setCodigo(5);
        System.out.println(livro1.toString());
        System.out.println(livro1.realizarEmprestimo(5));
        System.out.println(livro1.realizarDevolucao(5, true));
        System.out.println(livro1.toString());
        
        System.out.println("\n");
        
        Livro livro2 = new Livro();
        livro2.setAutor("Amaral");
        livro2.setEdicao(5);
        livro2.setEditora("Editora Carvalho");
        livro2.setTitulo("Peixonalta");
        livro2.setISBN(4321);
        livro2.setAtraso(false);
        livro2.setCodigo(100);
        System.out.println(livro2.toString());
        System.out.println(livro2.realizarEmprestimo(100));
        System.out.println(livro2.realizarDevolucao(100, false));
        System.out.println(livro2.toString());
        
        System.out.println("\n////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n");
        
        Revista revista1 = new Revista();
        revista1.setAno(2010);
        revista1.setAtraso(true);
        revista1.setCategoria("PISCOLOGIA");
        revista1.setCodigo(20);
        revista1.setEdicao(1);
        revista1.setEditora("Editora Pietra");
        revista1.setNome("Veja");
        System.out.println(revista1.toString());
        System.out.println(revista1.realizarEmprestimo(100));
        System.out.println(revista1.realizarDevolucao(100, true));
        System.out.println(revista1.toString());
        
        System.out.println("\n");
        
        Revista revista2 = new Revista();
        revista2.setAno(2010);
        revista2.setAtraso(false);
        revista2.setCategoria("Engenharia");
        revista2.setCodigo(-5);
        revista2.setEdicao(6);
        revista2.setEditora("Editora Lucia");
        revista1.setNome("Ivone");
        System.out.println(revista2.toString());
        System.out.println(revista2.realizarEmprestimo(5));
        System.out.println(revista2.realizarDevolucao(5, false));
        System.out.println(revista2.toString());
        
    }
    
}
