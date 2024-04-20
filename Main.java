import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        
        int idade;
        double salario,altura;
        char genero;
        String nome;

        idade = 21;
        salario = 5800.5;
        altura = 1.86;
        genero = 'M';
        nome = "Lucas Amaral Luciano";

        System.out.println("IDADE = " + idade);
        System.out.println("SALARIO = " + String.format("%.2f" , salario));
        System.out.println("ALTURA = " + String.format("%.2f" , altura));
        System.out.println("GENERO = " + genero);
        System.out.println("NOME = " + nome);

    }
}
