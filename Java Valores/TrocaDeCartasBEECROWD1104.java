import java.util.Locale;
import java.util.Scanner;

public class TrocaDeCartasBEECROWD1104 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas cartas tem Alice?");
        int a=sc.nextInt();
        System.out.println("Quantas cartas tem Beatriz?");
        int b=sc.nextInt();

        while(a>0 && b>0){

            int[] alice=new int[100001];
            int[] beatriz=new int[100001];
            int x,trocaA=0,trocaB=0;

            for(int i=0;i<100001;i++){
                alice[i]=0;
                beatriz[i]=0;
            }

            System.out.println("Digite as cartas de Alice:");
            for(int i=0;i<a;i++){
                x=sc.nextInt();
                alice[x]++;
            }

            System.out.println();

            System.out.println("Digite as cartas de Beatriz:");
            for(int i=0;i<b;i++){
                x=sc.nextInt();
                beatriz[x]++;
            }

            for(int i=0;i<100001;i++){
                if(alice[i]>0 && beatriz[i]==0){
                    trocaA++;
                }else if(alice[i]==0 && beatriz[i]>0){
                    trocaB++;
                }
            }

            if(trocaA<trocaB){
                System.out.println("Houve apenas "+trocaA+" trocas de cartas.");
            }else{
                System.out.println("Houve "+trocaB+" trocas de cartas.");
            }

            System.out.println("Quantas cartas tem Alice?");
            a=sc.nextInt();
            System.out.println("Quantas cartas tem Beatriz?");
            b=sc.nextInt();

        }
        
        System.out.println("ATÉ MAIS!");

        sc.close();
        
    }
    
}
