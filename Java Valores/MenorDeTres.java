import java.util.Locale;
import java.util.Scanner;

public class MenorDeTres {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        int[] vet=new int[3];
        int menor=1000000;

        for(int i=0;i<3;i++){
            vet[i]=sc.nextInt();
        }

        for(int i=0;i<3;i++){
            if(vet[i]<menor){
                menor=vet[i];
            }
        }

        System.out.println("MENOR = "+menor);

        sc.close();

    }
    
}
