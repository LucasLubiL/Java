import java.util.Locale;
import java.util.Scanner;

public class SomaImparesBEECROWD1071{
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int x,y,aux,soma=0;

        x=sc.nextInt();
        y=sc.nextInt();

        if(x<y){
            aux=x;
            x=y;
            y=aux;
        }

        for(int i=y+1;i<x;i++){
            if(i%2!=0){
                soma=soma+i;
            }
        }

        System.out.println(soma);

        sc.close();

    }
}
