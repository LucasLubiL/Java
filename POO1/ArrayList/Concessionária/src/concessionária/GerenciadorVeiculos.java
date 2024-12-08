package concessionária;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class GerenciadorVeiculos 
{
    private ArrayList<VeiculoN> veiculosN;
    private ArrayList<VeiculoRural> veiculosRurais;
    private ArrayList<VeiculoEixoSimples> veiculosEixoSimples;
    private ArrayList<VeiculoPNE> veiculosPNE;
    
    public GerenciadorVeiculos()
    {
        veiculosN = new ArrayList();
        veiculosRurais = new ArrayList();
        veiculosEixoSimples = new ArrayList();
        veiculosPNE = new ArrayList();
    }
    
    public void adicionarVeiculo(VeiculoN veiculoN) 
    { 
        this.veiculosN.add(veiculoN); 
    }
    
    public void adicionarVeiculoR(VeiculoRural veiculoRural) 
    { 
        this.veiculosRurais.add(veiculoRural); 
    }
    
    public void adicionarVeiculoES(VeiculoEixoSimples veiculoEixoSimples) 
    { 
        this.veiculosEixoSimples.add(veiculoEixoSimples); 
    }
    
    public void adicionarVeiculoPNE(VeiculoPNE veiculoPNE) 
    { 
        this.veiculosPNE.add(veiculoPNE); 
    }
    
    public double calcularImpostoTotalVeiculosN() 
    { 
        double totalImposto = 0; 
        for (VeiculoN veiculo : veiculosN) 
        { 
            totalImposto += veiculo.calcularImposto(); 
        } 
        return totalImposto; 
    }
    
    public double calcularImpostoTotalVeiculosR() 
    { 
        double totalImposto = 0; 
        for (VeiculoRural veiculoR : veiculosRurais) 
        { 
            totalImposto += veiculoR.calcularImposto(); 
        } 
        return totalImposto; 
    }
    
    public double calcularImpostoTotalVeiculosES() 
    { 
        double totalImposto = 0; 
        for (VeiculoEixoSimples veiculoES : veiculosEixoSimples) 
        { 
            totalImposto += veiculoES.calcularImposto(); 
        } 
        return totalImposto; 
    }
    
    public double calcularImpostoTotalVeiculosPNE() 
    { 
        double totalImposto = 0; 
        for (VeiculoPNE veiculoPNE : veiculosPNE) 
        { 
            totalImposto += veiculoPNE.calcularImposto(); 
        } 
        return totalImposto; 
    }
    
    public void listarVeiculosN() 
    { 
        for (VeiculoN veiculo : veiculosN) 
        { 
            System.out.println("Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo() + ", Ano: " + veiculo.getAno() + ", Valor: " + veiculo.getValor() + ", Imposto: " + veiculo.calcularImposto()); 
        } 
    }
    
    public void listarVeiculosR() 
    { 
        for (VeiculoRural veiculoR : veiculosRurais) 
        { 
            System.out.println("Marca: " + veiculoR.getMarca() + ", Modelo: " + veiculoR.getModelo() + ", Ano: " + veiculoR.getAno() + ", Valor: " + veiculoR.getValor() + ", Imposto: " + veiculoR.calcularImposto() + ", Funcao: " + veiculoR.getFuncao()); 
        } 
    }
    
    public void listarVeiculosES() 
    { 
        for (VeiculoEixoSimples veiculoES : veiculosEixoSimples) 
        { 
            System.out.println("Marca: " + veiculoES.getMarca() + ", Modelo: " + veiculoES.getModelo() + ", Ano: " + veiculoES.getAno() + ", Valor: " + veiculoES.getValor() + ", Imposto: " + veiculoES.calcularImposto() + ", Peso: " + veiculoES.getPeso()); 
        } 
    }
    
    public void listarVeiculosPNE() 
    { 
        for (VeiculoPNE veiculoPNE : veiculosPNE) 
        { 
            System.out.println("Marca: " + veiculoPNE.getMarca() + ", Modelo: " + veiculoPNE.getModelo() + ", Ano: " + veiculoPNE.getAno() + ", Valor: " + veiculoPNE.getValor() + ", Imposto: " + veiculoPNE.calcularImposto()); 
        } 
    }
    
    public double impostoPorVeiculoN(VeiculoN veiculo){
    
        return veiculo.calcularImposto();
    
    }
    public double impostoPorVeiculoR(VeiculoRural veiculoR){
    
        return veiculoR.calcularImposto();
    
    }
    
    public double impostoPorVeiculoES(VeiculoEixoSimples veiculoES){
    
        return veiculoES.calcularImposto();
    
    }
    
    public double impostoPorVeiculoPNE(VeiculoPNE veiculoPNE){
    
        return veiculoPNE.calcularImposto();
    
    }
    
}