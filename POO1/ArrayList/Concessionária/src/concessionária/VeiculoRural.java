package concessionária;

/**
 *
 * @author Lucas
 */
public abstract class VeiculoRural extends VeiculoN implements Tributavel{
    
    private String funcao;

    public VeiculoRural(String funcao, String marca, String modelo, int ano, double valor) {
        super(marca, modelo, ano, valor);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}
