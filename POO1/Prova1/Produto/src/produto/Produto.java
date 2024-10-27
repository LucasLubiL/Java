package produto;

/**
 *
 * @author Lucas
 */
public class Produto {
    
    private String nome;
    private String categoria;
    private double preco;
    private int quantidadeEmEstoque;

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
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco<=0){
           this.preco = 10.0;
        }else{
           this.preco = preco;
        }
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if(quantidadeEmEstoque<=0){
            this.quantidadeEmEstoque = 1;
        }else{
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }
    }
    
    
    
}
