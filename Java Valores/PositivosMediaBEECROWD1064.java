import java.util.Locale;
import java.util.Scanner;

public class PositivosMediaBEECROWD1064 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        double a,media;
        int cont=0;
        double soma=0;
        
        for(int i=0;i<6;i++){
            a=sc.nextDouble();
            if(a>0){
                cont++;
                soma = soma + a;
            }
        }

        media=(double)soma/cont;

        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f",media));

        sc.close();

    }
    
}
