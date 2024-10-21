package aulaherança1;

/**
 *
 * @author IFTM
 */
public class Principal {

    
    public static void main(String[] args) {
        
        
        Funcionario joao = new Funcionario();
        joao.setPrimeiroNome("Joao");
        joao.setSegundoNome("Pires");
        joao.setSalario(900.00);
        
        ComissaoFuncionario maria = new ComissaoFuncionario();
        maria.setPrimeiroNome("Maria");
        maria.setSegundoNome("Fernanda");
        maria.setSalario(1000.00);
        maria.setComissao(50.00);
        maria.setVendas(5);
        
        System.out.println("Funcionario: " + joao.getPrimeiroNome() + " " + joao.getSegundoNome());
        System.out.println("Salario: R$" + joao.getSalario() + "\n");
        
        System.out.println("Funcionario Comissionado: " + maria.getPrimeiroNome() + " " + maria.getSegundoNome());
        System.out.println("Salario: R$" + maria.getSalario());
        System.out.println("Comissao: R$" + maria.getComissao());
        System.out.println("Vendas: " + maria.getVendas());
        System.out.println("Venda Comissao: R$" + maria.calcularPagamentoTotal() + "\n");
        
        maria.adicionarVendas(5);
        System.out.println("Venda Comissao: R$" + maria.calcularPagamentoTotal() + "\n");
        
        maria.zerarVendas();       
        System.out.println("Venda Comissao: R$" + maria.calcularPagamentoTotal() + "\n");
        
  
    }
    
}
