package concessionária;

/**
 *
 * @author Lucas    
 */
public class Caminhao extends VeiculoEixoSimples {

    public Caminhao(double peso, String marca, String modelo, int ano, double valor) {
        super(peso, marca, modelo, ano, valor);
    }

    @Override
    public double calcularImposto() {
        return super.getValor() * 0.06;
    }
    
}
