package aulaherançaconstrutor;

/**
 *
 * @author IFTM
 */
public class FucionarioComissionado extends Funcionario{
    
    private double comissao;
    private int vendas;
    
    public FucionarioComissionado(String primeiroNome, String segundoNome, double salario, double comissao, int vendas){
       super (primeiroNome, segundoNome, salario);
       this.comissao = comissao;
       this.vendas = vendas;
    }
    
    public double getComissao(){
        return comissao;
    }
    
    public int getVendas(){ 
        return vendas;
    }
    
    public double pagamentoTotal(){ 
        return this.vendas * this.comissao + super.getSalario();
    }
 
}
