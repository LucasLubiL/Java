package concessionária;

/**
 *
 * @author Lucas
 */
public class Trator extends VeiculoRural{

    public Trator(String funcao, String marca, String modelo, int ano, double valor) {
        super(funcao, marca, modelo, ano, valor);
    }

    @Override
    public double calcularImposto() {
       return super.getValor() * 0.05;
    }

}
