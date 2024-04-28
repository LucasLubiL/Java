import java.util.Scanner;
import java.util.Locale;

public class Crescente {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in); 

        System.out.print("Digite quantos números irá digitar:");
        int a=sc.nextInt();

        int[] vetor=new int[a];

        for(int i=0;i<a;i++){
            vetor[i]=sc.nextInt();
        }

        for(int i=2;i<a;i++){
            if(vetor[i]<vetor[i-1] && vetor[i-1]<vetor[i-2]){
                if(i==a-1){
                    System.out.println("ORDEM DECRESCENTE!");
                }
            }else if(vetor[i]>vetor[i-1] && vetor[i-1]>vetor[i-2]){
                if(i==a-1){
                    System.out.println("ORDEM CRESCENTE!");
                }
            }else {
                System.out.println("NEM CRESCENTE E NEM DESCRESCENTE!");
                break;
            }
        }

        sc.close();

    }
    
}
