import java.util.Locale;
import java.util.Scanner;

public class QuadradoParesBEECROWD1073 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        int a,mult;

        a=sc.nextInt();

        for(int i=1;i<=a;i++){
            if(i%2==0){
                mult=i*i;
                System.out.println(i+"^2 = "+mult);

            }
        }

        sc.close();
    }
}