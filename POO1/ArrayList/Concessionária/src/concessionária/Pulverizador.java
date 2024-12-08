package concessionária;

/**
 *
 * @author Lucas
 */
public class Pulverizador extends VeiculoRural{

    public Pulverizador(String funcao, String marca, String modelo, int ano, double valor) {
        super(funcao, marca, modelo, ano, valor);
    }

    @Override
    public double calcularImposto() {
        return super.getValor() * 0.08;
    }
    
}
