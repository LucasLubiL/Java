import java.util.Locale;
import java.util.Scanner;


public class multiplos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int x,y;
        double soma;

        x=sc.nextInt();
        y=sc.nextInt();

        if(x>y){
           soma=x%y;
           if(soma==0){
              System.out.println("Sao Multiplos");
           }else{
              System.out.println("Nao sao Multiplos");
           }
        }else{
            soma=y%x;
           if(soma==0){
              System.out.println("Sao Multiplos");
           }else{
              System.out.println("Nao sao Multiplos");
           }
        }
        
        sc.close();

    }
    
}
