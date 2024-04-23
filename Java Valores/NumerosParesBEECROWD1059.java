import java.util.Locale;
import java.util.Scanner;

public class NumerosParesBEECROWD1059 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        sc.close();

    }
}