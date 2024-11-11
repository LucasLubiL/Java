package lojaroupa;

/**
 *
 * @author Lucas
 */
public class FilialPatrocinioLojaFisica extends ItemRoupa{
    
    private String gerente;
    private String endereco;

    public FilialPatrocinioLojaFisica(){}
    
    public FilialPatrocinioLojaFisica(String gerente, String endereco, String descricao, double valor, boolean disponivel) {
        
        super(descricao, valor, disponivel);
        this.gerente = gerente;
        this.endereco = endereco;
        
    }

    @Override
    public void emprestar(){
        
        if(isDisponivel()){
            System.out.println("O item " + getDescricao() + " esta disponivel!\nFavor, retirar o produto no endereco: " + this.endereco);
            setDisponivel(false);
        }else{
            System.out.println("O item nao esta disponivel no estoque :(");
            setDisponivel(true);
        }
   
    }
    
    @Override
    public void devolver(){
        
        if(!isDisponivel()){
            System.out.println("A devolucao foi feita com sucesso!");
            setDisponivel(true);
        }else{
            System.out.println("Nao ha nada para devolver.");
        }
        
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString(){
        return super.toString() + "; Gerente: " +this.gerente + "; Endereco: " + this.endereco + "]";
    }
    
}
