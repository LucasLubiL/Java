import java.util.Locale;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        int a,x;

        System.out.println("Olá!Seja Bem Vindo!");
        System.out.println("Qual tabuada deseja fazer?");
        System.out.println("Digite 1 para MULTIPLICAÇÃO;");
        System.out.println("Digite 2 para DIVISÃO;");
        System.out.println("Digite 0 para SAIR.");

        a=sc.nextInt();

        while(a!=0){
            while(a<1 || a>2){
                System.out.println("Opção Inválida,digite novamente:");
                a=sc.nextInt();
            }

            if(a==1){
                System.out.println("MULTIPLICAÇÃO:");
                System.out.println("Dgite o número desejado:");
                x=sc.nextInt();

                for(int i=1;i<=10;i++){
                    System.out.println(i+" x "+x+" = "+ x*i);
                }
            }else if(a==2){
                System.out.println("DIVISÃO:");
                System.out.println("Dgite o número desejado:");
                x=sc.nextInt();

                for(int i=1;i<=10;i++){
                    double div=(double)i/x;
                    System.out.println(i+" / "+x+" = "+ String.format("%.2f",div));
                }
            }

            System.out.println("Deseja fazer outra operação?");
            System.out.println("Digite 1 para MULTIPLICAÇÃO;");
            System.out.println("Digite 2 para DIVISÃO;");
            System.out.println("Digite 0 para SAIR.");

            a=sc.nextInt();

        }
        
        System.out.println("Obrigado por usar nosso programa!");

        sc.close();
    }
}