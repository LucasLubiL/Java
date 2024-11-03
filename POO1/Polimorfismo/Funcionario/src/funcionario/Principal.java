package funcionario;

/**
 *
 * @author Lucas
 */
public class Principal {

    public static void main(String[] args) {
        
        System.out.println("Funcionario:");
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Julio");
        funcionario1.setSalario(1600.00);
        funcionario1.calcularBonus("dezembro");
        System.out.println(funcionario1);
        
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Pietra");
        funcionario2.setSalario(1800.00);
        funcionario2.calcularBonus("janeiro");
        System.out.println(funcionario2);
        
        Funcionario funcionario3 = new Funcionario();
        funcionario3.setNome("Ricardo");
        funcionario3.setSalario(1900.00);
        funcionario3.calcularBonus("outubro");
        System.out.println(funcionario3);
        
        System.out.println("/////////////////////////////////////////////////////////////////////\n");
        
        System.out.println("Gerente:");
        Gerente gerente1 = new Gerente();
        gerente1.setNome("Carlos");
        gerente1.setSalario(3800.00);
        gerente1.setGratificacao(800.00);
        gerente1.calcularBonus("fevereiro");
        System.out.println(gerente1);
        
        Gerente gerente2 = new Gerente();
        gerente2.setNome("Fernanda");
        gerente2.setSalario(4000.00);
        gerente2.setGratificacao(1500.00);
        gerente2.calcularBonus("abril");
        System.out.println(gerente2);
        
        Gerente gerente3 = new Gerente();
        gerente3.setNome("Daniela");
        gerente3.setSalario(3000.00);
        gerente3.setGratificacao(400.00);
        gerente3.calcularBonus("janeiro");
        System.out.println(gerente3);
        
        System.out.println("/////////////////////////////////////////////////////////////////////\n");
        
        System.out.println("Programador:");
        Programador programador1 = new Programador();
        programador1.setNome("Lucas");
        programador1.setSalario(3800.00);
        programador1.setValorPontoFuncao(9.00);
        programador1.calcularValorSoftware(1000);
        programador1.calcularBonus("junho");
        System.out.println(programador1);
        
        Programador programador2 = new Programador();
        programador2.setNome("Amaral");
        programador2.setSalario(3000.00);
        programador2.setValorPontoFuncao(8.00);
        programador2.calcularValorSoftware(1000);
        programador2.calcularBonus("julho");
        System.out.println(programador2);
        
        Programador programador3 = new Programador();
        programador3.setNome("Luciano");
        programador3.setSalario(3500.00);
        programador3.setValorPontoFuncao(10.00);
        programador3.calcularValorSoftware(1000);
        programador3.calcularBonus("agosto");
        System.out.println(programador3);
        
    }
 
}
