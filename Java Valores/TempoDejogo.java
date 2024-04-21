import java.util.Locale;
import java.util.Scanner;

public class TempoDejogo {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int a,b,conta,fim;
        

        a=sc.nextInt();
        b=sc.nextInt();

        if(a==b){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }else {
            conta=b-a;
            if(conta<0){
                fim=conta+24;
                System.out.println("O JOGO DUROU " + fim + " HORA(S)");
            }else{
                System.out.println("O JOGO DUROU " + conta + " HORA(S)");
            }
        }


        sc.close();

    }
}
