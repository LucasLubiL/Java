import java.util.Locale;
import java.util.Scanner;

public class PaImPoNeBEECROWD1066 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        int a,par=0;
        int positivo=0;
        int negativo=0;
        int impar=0;
        
        for(int i=0;i<5;i++){
            a=sc.nextInt();
            if(a>0){
                positivo++;
            }else{
                negativo++;
            }
            if(a%2==0){
                par++;
            }else{
                impar++;
            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar +" valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");

        sc.close();

    }
    
}
