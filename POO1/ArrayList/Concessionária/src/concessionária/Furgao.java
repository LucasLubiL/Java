package concessionária;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Furgao extends VeiculoPNE
{

    public Furgao(String marca, String modelo, int ano, double valor, ArrayList<String> modificacoes) {
        super(marca, modelo, ano, valor, modificacoes);
    }

    @Override
    public double calcularImposto() 
    {
        return getValor() * 0.01;
    }
    
}