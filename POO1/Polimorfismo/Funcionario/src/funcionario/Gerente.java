package funcionario;

/**
 *
 * @author Lucas
 */
public class Gerente extends Funcionario{
    
    private double gratificacao;
    
    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    @Override
    public void calcularBonus(String mesPagamento){      
        if(mesPagamento.equals("dezembro") || mesPagamento.equals("janeiro") || mesPagamento.equals("julho") || this.gratificacao>1000){
           super.setSalario(getSalario() + (this.gratificacao + (super.getSalario() * 0.2)));
        }
        System.out.println("Funcionario/Gerente: " + super.getNome() + "; Salario para o mes " + mesPagamento + ": R$" + super.getSalario());
    }
    
    public String toString(){
        return "[Funcionario/Gerente: " + getNome() + "; Salario: R$" + getSalario() + "; Gratificacao: R$" + this.gratificacao + "]\n";
    }
    
}
