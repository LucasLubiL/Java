package biblioteca2;

/**
 *
 * @author Lucas
 */
public class Livro extends Exemplares{
    
    private String autor;
    private String titulo;
    private int ISBN;
    
    public Livro(){}

    public Livro(String autor, String editora, String titulo, int edicao, int ISBN, int codigo, boolean atraso) {
        super(codigo, atraso , editora, edicao);
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String realizarEmprestimo(int codigo) {
        
        if(codigo>=1 && codigo<=10){
            return "Prazo de devolucao do livro – 10 dias";
        }else if(codigo>=11 && codigo<=20){
            return "Prazo de devolucao do livro – 15 dias";
        }else{
            return "Prazo de devolucao do livro - indetermiado";
        }
  
    }

    @Override
    public String realizarDevolucao(int codigo, boolean atraso){
        
        if(codigo>=1 && codigo<=10){
            if(isAtraso()){
               return "Valor do emprestimo do livro - R$10,00. Livro em atraso";
            }
            return "Valor do emprestimo do livro - R$10,00";
        }else if(codigo>=11 && codigo<=20){
            if(isAtraso()){
                return "Valor do emprestimo do livro - R$15,00. Livro em atraso";
            }
            return "Valor do emprestimo do livro - R$15,00";
        }else{
            if(isAtraso()){
                return "Valor do emprestimo do livro - R$50,00. Livro em atraso";
            }
            return "Valor do emprestimo do livro - R$50,00";
        }

    }

    @Override
    public String toString() {
        return super.toString() + "Livro [Autor: " + this.autor + "; Titulo: " + this.titulo + "; ISBN: " + this.ISBN + "]";
    }
 
}
