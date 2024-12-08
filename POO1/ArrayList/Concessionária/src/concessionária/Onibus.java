package concessionária;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Onibus extends VeiculoPNE{

    public Onibus(String marca, String modelo, int ano, double valor, ArrayList<String> modificacoes) {
        super(marca, modelo, ano, valor, modificacoes);
    }

    @Override
    public double calcularImposto() {
        return getValor() * 0.02;
    }
    
    
    
}
