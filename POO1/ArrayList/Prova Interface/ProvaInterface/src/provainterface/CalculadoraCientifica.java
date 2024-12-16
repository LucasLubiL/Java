package provainterface;

/**
 *
 * @author Lucas
 */
public class CalculadoraCientifica extends OperacoesComplexas implements OperacoesAritmeticas {

    private int num1;
    private int num2;
    
//    @Override
//    public void mostrarEcalcularRaizQuadrada() 
//    {
        // Como calcular raiz quadrada em Java:
        // Número do qual queremos calcular a raiz quadrada: 
        // double numero = 16.0; 
        // Calculando a raiz quadrada usando o método Math.sqrt():
        // double raizQuadrada = Math.sqrt(numero); 
        // Exibindo o resultado:
        // System.out.println("A raiz quadrada de " + numero + " é " + raizQuadrada); 
//    }

//    @Override
//    public void mostrarEcalcularPotenciaQuadrado() 
//    {
        // Número que queremos elevar ao quadrado:
        // double numero = 5.0; 
        // Calculando a potência ao quadrado usando Math.pow() 
        // double potenciaQuadrado = Math.pow(numero, 2); 
        // Exibindo o resultado:
        // System.out.println(numero + " ao quadrado é " + potenciaQuadrado); 
//    }
    
    
/*- A classe concreta CalculadoraCientifica vai herdar a classe abstratas OperacoesComplexas e implementar a interface OperacoesAritmeticas
- Consequentemente implementa os métodos abstratos de ambas classes;
- A implementação dos métodos abstratos da classe interface OperacoesAritmeticas, 
    consiste em fazer a operação aritmética descrita no nome do método e mostrar o resultado;
- A implementação dos métodos abstratos da classe abstrata OperacoesComplexas, 
    consiste em realizar a operação descrita no nome tanto da variável num1 como da variável num2,
    posteriormente mostram ambos resultados;
- Encapsule as variáveis das duas classes;
- Crie métodos getters e setters;
- Verifique se o valor enviado pelo usuário é maior que 0 (zero), se não for, adicione 1 à variável;
- A verificação acima deve ser feita no setter de cada variável;*/

    @Override
    public void mostrarEcalcularRaizQuadrada() {
        double raiz1 = Math.sqrt(num1);
        System.out.println("A raiz quadrada do numero " + num1 + " e " + raiz1);
        double raiz2 = Math.sqrt(num2);
        System.out.println("A raiz quadrada do numero " + num2 + " e " + raiz2);
    }

    @Override
    public void mostrarEcalcularPotenciaQuadrado() {
        double pow1 = Math.pow(num1, 2);
        System.out.println("O numero " + num1 + " ao quadrado e " + pow1);
        double pow2 = Math.pow(num2, 2);
        System.out.println("O numero " + num2 + " ao quadrado e " + pow2);
    }

    @Override
    public void mostrarSoma() {
        System.out.println("A soma de " + num1 + " + " + num2 + " = " + (num1+num2));
    }

    @Override
    public void mostrarSubtracao() {
        System.out.println("A subtracao de " + num1 + " - " + num2 + " = " + (num1-num2));
    }

    @Override
    public void mostrarDivisao() {
        double div = num1 / num2;
        System.out.println("A divisao de " + num1 + " / " + num2 + " = " + div);
    }

    @Override
    public void mostrarMultiplicacao() {
        System.out.println("A multiplicacao de " + num1 + " * " + num2 + " = " + (num1*num2));
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        if(num1 <= 0){
           this.num1 = 1;
        }else{
           this.num1 = num1;
        }
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        if(num2 <= 0){
           this.num2 = 1;
        }else{
           this.num2 = num2;
        }
    }

}
