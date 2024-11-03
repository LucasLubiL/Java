package contabancaria;

/**
 *
 * @author Lucas
 */
public class Principal {

   
    public static void main(String[] args) {
        
        System.out.println("CONTA BANCARIA:");
        ContaBancaria conta1 = new ContaBancaria("Lucas", 10000.00, 3000.00);
        conta1.depositar(500.00);
        conta1.verificarSaldo();
        conta1.sacar(300.00);
        conta1.verificarSaldo();
        System.out.println(conta1/*.toString()*/);
        
        ContaBancaria conta2 = new ContaBancaria("Pedro", 7000.00, 2000.00);
        conta2.depositar(800.00);
        conta2.verificarSaldo();
        conta2.sacar(100.50);
        conta2.verificarSaldo();
        System.out.println(conta2/*.toString()*/);

        ContaBancaria conta3 = new ContaBancaria("", 3000.00, 1000.00);
        conta3.depositar(2000.00);
        conta3.verificarSaldo();
        conta3.sacar(30000.00);
        conta3.verificarSaldo();
        System.out.println(conta3/*.toString()*/);
      
        
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////\n");
        
        System.out.println("CONTA POUPANCA:");
        ContaPouPanca poupanca1 = new ContaPouPanca(1.0, "Ana", 2000.00, 3500.00);
        poupanca1.depositar(1000.00);
        poupanca1.verificarSaldo();
        poupanca1.sacar(250.00);
        poupanca1.verificarSaldo();
        poupanca1.aplicarJuros();
        poupanca1.verificarSaldo();
        System.out.println(poupanca1);
        
        ContaPouPanca poupanca2 = new ContaPouPanca(4.0, "", 4000.00, 2200.00);
        poupanca2.depositar(400.00);
        poupanca2.verificarSaldo();
        poupanca2.sacar(3000000.00);
        poupanca2.verificarSaldo();
        poupanca2.aplicarJuros();
        poupanca2.verificarSaldo();
        System.out.println(poupanca2);
        
        ContaPouPanca poupanca3 = new ContaPouPanca(2.2, "Sofia", 6000.00, 1800.00);
        poupanca3.depositar(800.00);
        poupanca3.verificarSaldo();
        poupanca3.sacar(600.00);
        poupanca3.verificarSaldo();
        poupanca3.aplicarJuros();
        poupanca3.verificarSaldo();
        System.out.println(poupanca3);
        
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////\n");
        
        System.out.println("CONTA CORRENTE:");
        ContaCorrente correntista1 = new ContaCorrente(1000, "Ricardo", 3800.00, 1600.00);
        correntista1.depositar(1800.00);
        correntista1.verificarSaldo();
        correntista1.sacar(500.00);
        correntista1.verificarSaldo();
        System.out.println(correntista1);
        
        ContaCorrente correntista2 = new ContaCorrente(100, "", 7000.00, 2000.00);
        correntista2.depositar(150.00);
        correntista2.verificarSaldo();
        correntista2.sacar(200.00);
        correntista2.verificarSaldo();
        System.out.println(correntista2);
        
        ContaCorrente correntista3 = new ContaCorrente(500, "Pietra", 12000.00, 3200.00);
        correntista3.depositar(5000.00);
        correntista3.verificarSaldo();
        correntista3.sacar(1500.00);
        correntista3.verificarSaldo();
        System.out.println(correntista3);
        
    }
    
}
