package concessionária;

/**
 *
 * @author Lucas
 */
public abstract class VeiculoN implements Tributavel
{
    private String marca; 
    private String modelo; 
    private int ano; 
    private double valor;
    
    public VeiculoN(String marca, String modelo, int ano, double valor) 
    { 
        this.marca = marca; 
        this.modelo = modelo; 
        this.ano = ano; 
        this.valor = valor; 
    }
    
    public String getMarca() 
    { 
        return marca; 
    } 
    
    public String getModelo() 
    { 
        return modelo; 
    } 
    
    public int getAno() 
    { 
        return ano; 
    }
    
    public double getValor() 
    { 
        return valor; 
    }
}