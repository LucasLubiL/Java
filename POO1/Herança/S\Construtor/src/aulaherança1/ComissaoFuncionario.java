package aulaherança1;

/**
 *
 * @author IFTM
 */
public class ComissaoFuncionario extends Funcionario{
    
    private double comissao;
    private int vendas;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }
    
    public void adicionarVendas(int vendas){
        this.vendas += vendas;
    }
    
    public void zerarVendas(){
       this.vendas=0;
    }
    
    public double calcularPagamentoTotal(){
        double pagamento = super.getSalario() + (this.vendas * this.comissao);
        return pagamento;
    }
}


