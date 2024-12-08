package concessionária;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Principal {

    public static void main(String[] args) 
    {
        GerenciadorVeiculos gerenciador = new GerenciadorVeiculos(); 
        Carro carro1 = new Carro("Toyota", "Corolla", 2021, 80000);
        Carro carro2 = new Carro("VolksWagen", "Fox Connect", 2020, 40000);
        gerenciador.adicionarVeiculo(carro1);
        gerenciador.adicionarVeiculo(carro2);
        
        GerenciadorVeiculos gerenciador2 = new GerenciadorVeiculos();
        Moto moto1 = new Moto("CG","150cc", 2010, 8000);
        Moto moto2 = new Moto("Harley Deivson","Golden Plus", 2024, 150000);
        gerenciador2.adicionarVeiculo(moto1);
        gerenciador2.adicionarVeiculo(moto2);
        
        GerenciadorVeiculos gerenciador3 = new GerenciadorVeiculos();
        Trator trator1 = new Trator("Carregar suprimentos e ferramentas", "New Holland", "TT3840", 2006, 150000.00);
        Trator trator2 = new Trator("Averiguar perimetro", "John Deere", "5705E", 2008, 200000.00);
        gerenciador3.adicionarVeiculoR(trator1);
        gerenciador3.adicionarVeiculoR(trator2);
        
        GerenciadorVeiculos gerenciador4 = new GerenciadorVeiculos();
        Pulverizador pulverizador1 = new Pulverizador("Aplicação de defencisovs agricolas", "Jacto", "T6000", 2015, 900000.00);
        Pulverizador pulverizador2 = new Pulverizador("Distribuicao de fertilizantes liquidos", "Stara", "Imperador 3.0", 2019, 950000.00);
        gerenciador4.adicionarVeiculoR(pulverizador1);
        gerenciador4.adicionarVeiculoR(pulverizador2);
        
        GerenciadorVeiculos gerenciador5 = new GerenciadorVeiculos();
        Caminhao caminhao1 = new Caminhao(2500.00, "Mercedes-Benz", "Actros2546", 2012, 250000.00);
        Caminhao caminhao2 = new Caminhao(1800.00, "Scania", "R 450", 2015, 300000.00);
        gerenciador5.adicionarVeiculoES(caminhao1);
        gerenciador5.adicionarVeiculoES(caminhao2);
        
        GerenciadorVeiculos gerenciador6 = new GerenciadorVeiculos();
        OffRoad offRoad1 = new OffRoad(1200.00, "Jeep", "Jeep Gladiator", 2020, 120000.00);
        OffRoad offRoad2 = new OffRoad(1000.00, "Land Rover", "Range Rover", 1970, 200000.00);
        gerenciador6.adicionarVeiculoES(offRoad1);
        gerenciador6.adicionarVeiculoES(offRoad2);
        
        GerenciadorVeiculos gerenciador7 = new GerenciadorVeiculos();
        ArrayList<String> modific = new ArrayList();
        modific.add("Modificação de Assentos");
        Furgao furgao1 = new Furgao("Ford", "Ford Bronco", 2020, 180000, modific);
        Furgao furgao2 = new Furgao("Peugeot", "Peugeot Boxer", 1994, 90000, modific);
        gerenciador7.adicionarVeiculoPNE(furgao1);
        gerenciador7.adicionarVeiculoPNE(furgao2);
        
        GerenciadorVeiculos gerenciador8 = new GerenciadorVeiculos();
        ArrayList<String> modific1 = new ArrayList();
        modific.add("Elevador para Cadeirantes");
        Onibus onibus1 = new Onibus("Volvo", "Volvo B340M", 2004, 320000, modific1);
        Onibus onibus2 = new Onibus("Marcopolo", "Marcopolo Viale", 1998, 280000, modific1);
        gerenciador8.adicionarVeiculoPNE(onibus1);
        gerenciador8.adicionarVeiculoPNE(onibus2);
        
        System.out.println("Veículos sem PNE no sistema:"); 
        gerenciador.listarVeiculosN();
        System.out.println("Imposto individual da carro 1: " + gerenciador.impostoPorVeiculoN(carro1));
        System.out.println("Imposto individual da carro 2: " + gerenciador.impostoPorVeiculoN(carro2));
        System.out.println("Imposto total: " + gerenciador.calcularImpostoTotalVeiculosN() + "\n"); 

        gerenciador2.listarVeiculosN();
        System.out.println("Imposto individual da moto 1: " + gerenciador2.impostoPorVeiculoN(moto1));
        System.out.println("Imposto individual da moto 2: " + gerenciador2.impostoPorVeiculoN(moto2));
        System.out.println("Imposto total: " + gerenciador2.calcularImpostoTotalVeiculosN() + "\n");
         
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
  
        System.out.println("Veiculos Rurais:");
        gerenciador3.listarVeiculosR();
        System.out.println("Imposto individual da trator 1: " + gerenciador3.impostoPorVeiculoR(trator1));
        System.out.println("Imposto individual da trator 2: " + gerenciador3.impostoPorVeiculoR(trator2));
        System.out.println("Imposto total: " + gerenciador3.calcularImpostoTotalVeiculosR() + "\n"); 
 
        gerenciador4.listarVeiculosR();
        System.out.println("Imposto individual da pulverizador 1: " + gerenciador4.impostoPorVeiculoR(pulverizador1));
        System.out.println("Imposto individual da pulverizador 2: " + gerenciador4.impostoPorVeiculoR(pulverizador2));
        System.out.println("Imposto total: " + gerenciador4.calcularImpostoTotalVeiculosR() + "\n"); 

        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        System.out.println("Veiculos de Eixo Simples:");
        gerenciador5.listarVeiculosES();
        System.out.println("Imposto individual da caminhao 1: " + gerenciador5.impostoPorVeiculoES(caminhao1));
        System.out.println("Imposto individual da caminhao 2: " + gerenciador5.impostoPorVeiculoES(caminhao2));
        System.out.println("Imposto total: " + gerenciador5.calcularImpostoTotalVeiculosES() + "\n"); 

        gerenciador5.listarVeiculosES();
        System.out.println("Imposto individual da offroad 1: " + gerenciador6.impostoPorVeiculoES(offRoad1));
        System.out.println("Imposto individual da offroad 2: " + gerenciador6.impostoPorVeiculoES(offRoad2));
        System.out.println("Imposto total: " + gerenciador6.calcularImpostoTotalVeiculosES() + "\n"); 
        
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        System.out.println("Veiculos com PNE:");
        gerenciador7.listarVeiculosPNE();
        System.out.println("Imposto individual da offroad 1: " + gerenciador7.impostoPorVeiculoPNE(furgao1));
        System.out.println("Imposto individual da offroad 2: " + gerenciador7.impostoPorVeiculoPNE(furgao2));
        System.out.println("Imposto total: " + gerenciador7.calcularImpostoTotalVeiculosPNE() + "\n"); 

        gerenciador7.listarVeiculosPNE();
        System.out.println("Imposto individual da onibus 1: " + gerenciador8.impostoPorVeiculoPNE(onibus1));
        System.out.println("Imposto individual da onibus 2: " + gerenciador8.impostoPorVeiculoPNE(onibus2));
        System.out.println("Imposto total: " + gerenciador8.calcularImpostoTotalVeiculosPNE() + "\n"); 
     
    }
    
}