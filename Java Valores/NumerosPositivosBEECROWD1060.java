import java.util.Locale;
import java.util.Scanner;

public class NumerosPositivosBEECROWD1060 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        double x;
        int cont=0;

        for(int i=0;i<6;i++){
            x=sc.nextDouble();
            if(x>0){
                cont++;
            }
        }

        System.out.println(cont+" valores positivos");

        sc.close();

    }
    
}
