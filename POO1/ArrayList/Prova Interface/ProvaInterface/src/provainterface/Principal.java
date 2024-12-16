package provainterface;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Principal {

    public static void main(String[] args) 
    {
        
        Scanner ler = new Scanner(System.in);
        
        CalculadoraSimples2Numeros conta1 = new CalculadoraSimples2Numeros();
        System.out.println("Para a Calculadora Simples de 2 Numeros:");
        System.out.print("Digite o primeiro numero: ");
        conta1.setNum1(ler.nextInt());
        System.out.print("Digite o segundo numero: ");
        conta1.setNum2(ler.nextInt());
        
        System.out.println("\nOperacoes dos numeros " + conta1.getNum1() + " e " + conta1.getNum2() + ":");
        
        conta1.mostrarSoma();
        conta1.mostrarSubtracao();
        conta1.mostrarMultiplicacao();
        conta1.mostrarDivisao();
        
        System.out.println("\n////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n");
        
        CalculadoraSimples3Numeros conta2 = new CalculadoraSimples3Numeros();
        System.out.println("Para a Calculadora Simples de 3 Numeros:");
        System.out.print("Digite o primeiro numero: ");
        conta2.setNum1(ler.nextInt());
        System.out.print("Digite o segundo numero: ");
        conta2.setNum2(ler.nextInt());
        System.out.print("Digite o terceiro numero: ");
        conta2.setNum3(ler.nextInt());
        
        System.out.println("\nOperacoes dos numeros " + conta2.getNum1() + ", " + conta2.getNum2() + " e " + conta2.getNum3() + ":");
        
        conta2.mostrarSoma();
        conta2.mostrarSubtracao();
        conta2.mostrarMultiplicacao();
        conta2.mostrarDivisao();
        
        System.out.println("\n///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n");
        
        CalculadoraCientifica conta3 = new CalculadoraCientifica();
        System.out.println("Para a Calculadora Cientifica:");
        System.out.print("Digite o primeiro numero: ");
        conta3.setNum1(ler.nextInt());
        System.out.print("Digite o segundo numero: ");
        conta3.setNum2(ler.nextInt());

         System.out.println("\nOperacoes dos numeros " + conta3.getNum1() + ", " + conta3.getNum2() + ":");
         
        conta3.mostrarSoma();
        conta3.mostrarSubtracao();
        conta3.mostrarMultiplicacao();
        conta3.mostrarDivisao();
        conta3.mostrarEcalcularRaizQuadrada();
        conta3.mostrarEcalcularPotenciaQuadrado();
     
    }
    
}
