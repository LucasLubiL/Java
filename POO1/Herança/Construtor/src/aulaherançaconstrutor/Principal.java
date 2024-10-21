package aulaherançaconstrutor;

/**
 *
 * @author Lucas
 */
public class Principal {

    
    public static void main(String[] args) {
        
        Funcionario carlos = new Funcionario ("Carlos","Souza",1000.00);
        FucionarioComissionado joana = new FucionarioComissionado("Joana","Freitas",500.00,10.00,2);
        
        System.out.println("Funcionario: " + carlos.getPrimeiroNome() + " " + carlos.getSegundoNome());
        System.out.println("Salario: R$" + carlos.getSalario() + "\n");
        
        System.out.println("Funcionario Comissionado: " + joana.getPrimeiroNome() + " " + joana.getSegundoNome());
        System.out.println("Salario: R$" + joana.getSalario());
        System.out.println("Vendas: " + joana.getVendas());
        System.out.println("Vendas Comissao: " + joana.pagamentoTotal());
        
    }
    
}
