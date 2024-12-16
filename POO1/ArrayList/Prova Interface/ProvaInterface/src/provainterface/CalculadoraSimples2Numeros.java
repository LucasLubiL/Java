package provainterface;

/**
 *
 * @author Lucas
 */
public class CalculadoraSimples2Numeros implements OperacoesAritmeticas{
    
    private int num1;
    private int num2;
    
    
    

//    @Override
//    public void mostrarSoma() 
//    {
//        System.out.println("mostrar aqui o resultado da soma de num1 e num2");
//    }

   

/*- As classes concretas CalculadoraSimples2Numeros e CalculadoraSimples2Numeros implementam a classe interface OperacoesAritmeticas
- Consequentemente implementam seus métodos abstratos;
- A implementação dos métodos abstratos consiste em fazer a operação aritmética descrita no nome do método e mostrar o resultado;
- Encapsule as variáveis das duas classes;
- Crie métodos getters e setters;
- Verifique se o valor enviado pelo usuário é maior que 0 (zero), se não for, adicione 1 à variável;
- A verificação acima deve ser feita no setter de cada variável;*/

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
