package livro;

/**
 *
 * @author Lucas
 */
public class Principal {

    
    public static void main(String[] args) {
        
        Livro book = new Livro();
        book.setTitulo("Os 3 Porquinhos");
        book.setAutor("Fernando Cabral");
        book.setGenero("Infantil");
        book.setPreco(25.50);
        System.out.println("Titulo: " + book.getTitulo());
        System.out.println("Autor: " + book.getAutor());
        System.out.println("Genero: " + book.getGenero());
        System.out.println("Preco: R$" + book.getPreco() + "\n");  
        
        Livro book2 = new Livro();
        book2.setTitulo("O Suspeito");
        book2.setAutor("Alana dos Santos");
        book2.setGenero("Suspense");
        book2.setPreco(45.5);
        System.out.println("Titulo: " + book2.getTitulo());
        System.out.println("Autor: " + book2.getAutor());
        System.out.println("Genero: " + book2.getGenero());
        System.out.println("Preco: R$" + book2.getPreco());
           
    }
    
}
