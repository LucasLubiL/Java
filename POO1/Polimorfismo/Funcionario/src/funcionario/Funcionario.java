package funcionario;

/**
 *
 * @author Lucas
 */
public class Funcionario {
    
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcularBonus(String mesPagamento){       
        if(mesPagamento.equals("dezembro")){
            this.salario = this.salario + (this.salario * 0.10);
        }
        System.out.println("Funcionario: " + this.nome + ".Salario para o mes " + mesPagamento + ": R$" + this.salario);     
    }
    
     public String toString(){ 
        return "[Funcionario: " + getNome() + "; Salario: R$" + getSalario() + "]\n";
    }
    
}
