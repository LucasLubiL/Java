package lojaroupa;

/**
 *
 * @author Lucas
 */
public class FilialPatosLojaVirtual extends ItemRoupa{

    private String URL;
    private String nomeEntregador;
    private boolean statusEntregador;

    public FilialPatosLojaVirtual() {
    }

    public FilialPatosLojaVirtual(String URL, String nomeEntregador, boolean statusEntregador, String descricao, double valor, boolean disponivel) {
        
        super(descricao, valor, disponivel);
        this.URL = URL;
        this.nomeEntregador = nomeEntregador;
        this.statusEntregador = statusEntregador;
        
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getNomeEntregador() {
        return nomeEntregador;
    }

    public void setNomeEntregador(String nomeEntregador) {
        this.nomeEntregador = nomeEntregador;
    }

    public boolean isStatusEntregador() {
        return statusEntregador;
    }

    public void setStatusEntregador(boolean statusEntregador) {
        this.statusEntregador = statusEntregador;
    }

    
    @Override
    public void emprestar() {
        
        if(isDisponivel() && isStatusEntregador()){
            System.out.println("O item esta disponivel para emprestimo, ira ser entregue");
            setDisponivel(false);
            setStatusEntregador(false);
        }else{
            System.out.println("O item nao esta disponivel, logo nao podera ser entregue");
        }
        
    }

    @Override
    public void devolver() {
        
        if(isStatusEntregador()){
            System.out.println("O entregador esta a caminho!");
            setStatusEntregador(false);
            System.out.println("Devolucao feita com sucesso!");
        }else{
            System.out.println("O entregador nao esta disponivel.");
        } 
        
    }
    
    @Override
    public String toString(){
        return super.toString() + " URL: " + this.URL + "; Entregador: " + this.nomeEntregador + "; Disponibilida do Entregador: " + (isStatusEntregador() ? "Sim" : "Nao") + "]";   
    }
  
}
