package aulapoo2;

/**
 *
 * @author IFTM
 */
public class Empregado2 {
    
    public String nome;
    public String endereco;
    public String funcao;
    public double salario;
    
    public boolean verificarSalario(){
    
       boolean auxSalario = salario > 0 ? true : false;
       return auxSalario;
       
    }
    
    public String verificarNomeFuncao(){
    
       String aux = "Funcioanario: " + nome + "\nSalário: R$" + salario + "\n";
       return aux;
       
    
    }
    
}
