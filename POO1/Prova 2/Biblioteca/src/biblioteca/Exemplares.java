package biblioteca;

/**
 *
 * @author Lucas
 */
public abstract class Exemplares {

    private int codigo;
    private boolean atraso;
  
    public abstract String realizarEmprestimo(int codigo);
    public abstract String realizarDevolucao(int codigo, boolean atraso);
    
    public Exemplares(){}

    public Exemplares(int codigo, boolean atraso) {
        this.codigo = codigo;
        this.atraso = atraso;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isAtraso() {
        return atraso;
    }

    public void setAtraso(boolean atraso) {
        this.atraso = atraso;
    }
    
    
    public String toString(){
      return "Exemplares [Codigo: " + this.codigo + "; Atraso?: " + (atraso ? "Em atraso; " : "Sem atraso; ");
    }
    
}
