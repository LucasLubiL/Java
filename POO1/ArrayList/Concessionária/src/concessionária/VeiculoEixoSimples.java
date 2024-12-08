package concessionária;

/**
 *
 * @author Lucas
 */
public abstract class VeiculoEixoSimples extends VeiculoN implements Tributavel{
    
    private double peso;

    public VeiculoEixoSimples(double peso, String marca, String modelo, int ano, double valor) {
        super(marca, modelo, ano, valor);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
