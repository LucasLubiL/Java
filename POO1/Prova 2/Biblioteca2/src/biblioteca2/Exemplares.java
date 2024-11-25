package biblioteca2;

/**
 *
 * @author Lucas
 */
public abstract class Exemplares {

    private int codigo;
    private boolean atraso;
    private int edicao;
    private String editora;
  
    public abstract String realizarEmprestimo(int codigo);
    public abstract String realizarDevolucao(int codigo, boolean atraso);
    
    public Exemplares(){}

    public Exemplares(int codigo, boolean atraso, String editora, int edicao) {
        this.codigo = codigo;
        this.atraso = atraso;
        this.editora = editora;
        this.edicao = edicao;
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

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    public String toString(){
      return "Exemplares [Codigo: " + this.codigo + "; Atraso?: " + (atraso ? "Em atraso; " : "Sem atraso;" + "Editora: " + this.editora + "; Edicao: " + this.edicao);
    }
    
}
