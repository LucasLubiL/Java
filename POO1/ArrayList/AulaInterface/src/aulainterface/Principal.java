package aulainterface;

/**
 *
 * @author Ligia
 */
public class Principal {

    public static void main(String[] args) 
    {
        GerenciadorVeiculos gerenciador = new GerenciadorVeiculos(); 
        Carro carro1 = new Carro("Toyota", "Corolla", 2021, 80000);
        Carro carro2 = new Carro("VolksWagen", "Fox Connect", 2020, 40000);
        
        gerenciador.adicionarVeiculo(carro1);
        gerenciador.adicionarVeiculo(carro2);
        
        System.out.println("Veículos sem PNE no sistema:"); 
        gerenciador.listarVeiculosN();
        System.out.println("Imposto total: " + gerenciador.calcularImpostoTotalVeiculosN()); 
        
        GerenciadorVeiculos gerenciador2 = new GerenciadorVeiculos();
        
        Moto moto1 = new Moto("CG","150cc", 2010, 8000);
        Moto moto2 = new Moto("Harley Deivson","Golden Plus", 2024, 150000);
        
        gerenciador2.adicionarVeiculo(moto1);
        gerenciador2.adicionarVeiculo(moto2);
        
        System.out.println("Motos sem PNE no sistema:\n");
        gerenciador2.listarVeiculosN();
        System.out.println("Imposto total: " + gerenciador2.calcularImpostoTotalVeiculosN());
         
        System.out.println("Imposto individual da moto: " + gerenciador2.impostoPorVeiculoN(moto2));
        
    }
    
}
