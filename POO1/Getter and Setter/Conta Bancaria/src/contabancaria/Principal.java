package contabancaria;

/**
 *
 * @author User
 */
public class Principal {

    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();
         
        conta.setSaldo(2000);
        conta.setTitular("Joao Batista");
         
        System.out.println("O saldo de " + conta.getTitular() + " e de: " + conta.getSaldo());
         
        conta.setDeposito(500);
         
        System.out.println("Voce depositou R$" + conta.getDeposito() + "\nSaldo atual: R$" + conta.getSaldo());
         
        conta.setSacar(250);
         
        System.out.println("Saque realizado de R$" + conta.getSacar() + "\nSaldo atual: R$" + conta.getSaldo());
           
        
        
    }
    
}
