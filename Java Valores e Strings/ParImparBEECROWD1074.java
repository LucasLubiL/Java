import java.util.Locale;
import java.util.Scanner;

public class ParImparBEECROWD1074 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;

        N=sc.nextInt();
        int[] vetor=new int[N];

        for(int i=0;i<N;i++){
            vetor[i]=sc.nextInt();
        }

        for(int i=0;i<N;i++){
            if(vetor[i]==0){
                System.out.println("NULL");
            }else if(vetor[i]<0 && vetor[i]%2==0){
                System.out.println("EVEN NEGATIVE");
            }else if(vetor[i]<0 && vetor[i]%2!=0){
                System.out.println("ODD NEGATIVE");
            }else if(vetor[i]>0 && vetor[i]%2==0){
                System.out.println("EVEN POSITIVE");
            }else if(vetor[i]>0 && vetor[i]%2!=0){
                System.out.println("ODD POSITIVE");
            }
        }

        sc.close();

    }
}
