import java.util.Locale;
import java.util.Scanner;

public class Intervalo2BEECROWD1072{
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int n,x,in,out;

        in=0;
        out=0;

        n=sc.nextInt();

        for(int i=0;i<n;i++){
            x=sc.nextInt();
            if(x>=10 && x<=20){
                in++;
            }else{
                out++;
            }
        }

        System.out.println(in+" in");
        System.out.println(out+" out");


        sc.close();

    }
}
