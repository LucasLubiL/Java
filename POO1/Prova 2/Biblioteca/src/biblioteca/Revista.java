package biblioteca;

/**
 *
 * @author Lucas
 */
public class Revista extends Exemplares{
    
    private String nome;
    private String categoria;
    private String editora;
    private int ano;
    private int edicao;

    public Revista(){}

    public Revista(String nome, String categoria, String editora, int ano, int edicao, int codigo, boolean atraso) {
        super(codigo, atraso);
        
        if(categoria.equals("ESPIRITUALIDADE") || categoria.equals("PISCOLOGIA") || categoria.equals("AUTO AJUDA")){
            this.categoria = categoria;
        }else{
            this.categoria = "Sem categoria";
        }
        
        this.nome = nome;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if(categoria.equals("ESPIRITUALIDADE") || categoria.equals("PISCOLOGIA") || categoria.equals("AUTO AJUDA")){
            this.categoria = categoria;
        }else{
            this.categoria = "Sem categoria";
        }
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public String realizarEmprestimo(int codigo) {
        
        if(codigo>=1 && codigo<=25){
            return "Prazo de devolução da revista – 15 dias.";
        }else if(codigo>=26 && codigo<=40){
            return "Prazo de devolução da revista – 25 dias.";
        }else{
            return "";
        }
        
    }

    @Override
    public String realizarDevolucao(int codigo, boolean atraso) {
        
        if(codigo>=1 && codigo<=25){
            if(isAtraso()){
               return "Valor do emprestimo - R$10,00. Revista em atraso.";
            }
            return "Valor do emprestimo - R$10,00.";
        }else if(codigo>=26 && codigo<=40){
            if(isAtraso()){
               return "Valor do emprestimo - R$15,00. Revista em atraso.";
            }
            return "Valor do emprestimo - R$15,00.";
        }
        return "";
        
    }

    @Override
    public String toString() {
        return super.toString() + "Revista [Nome: " + this.nome + "; Categoria: " + this.categoria + "; Editora: " + this.editora + "; Ano: " + this.ano + "; Edicao: " + this.edicao + "]"; 
    }
    
    
    
}
