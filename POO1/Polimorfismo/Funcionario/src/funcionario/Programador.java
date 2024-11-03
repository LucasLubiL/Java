package funcionario;

/**
 *
 * @author Lucas
 */
public class Programador extends Funcionario{
    
    private double valorPontoFuncao;

    public double getValorPontoFuncao() {
        return valorPontoFuncao;
    }

    public void setValorPontoFuncao(double valorPontoFuncao) {
        this.valorPontoFuncao = valorPontoFuncao;
    }
    
    public void calcularValorSoftware(int linhasCodigo){
        this.valorPontoFuncao = this.valorPontoFuncao * linhasCodigo;
    }
    
    @Override
    public void calcularBonus(String mesPagamento){
        if(!mesPagamento.equals("dezembro") || !mesPagamento.equals("janeiro") || mesPagamento.equals("julho")){
            setSalario(getSalario() + (getSalario() *0.05));
        }      
        System.out.println("Funcionario/Programador: " + getNome() + ". Salario para o mes " + mesPagamento + ": R$" + getSalario());
    }
    
    public String toString(){ 
        return "[Funcionario/Programador: " + getNome() + "; Salario: R$" + getSalario() + "; Orcamento do Software: R$" + this.valorPontoFuncao + "]\n";
    }
     
    
}
