package concessionária;

/**
 *
 * @author Lucas
 */
public class OffRoad extends VeiculoEixoSimples{

    public OffRoad(double peso, String marca, String modelo, int ano, double valor) {
        super(peso, marca, modelo, ano, valor);
    }

    @Override
    public double calcularImposto() {
        return super.getValor() * 0.03;
    }
    
}
