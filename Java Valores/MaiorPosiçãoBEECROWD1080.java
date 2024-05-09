import java.util.Locale;
import java.util.Scanner;

public class MaiorPosiçãoBEECROWD1080 {
    public static void main(String[] args) {
        
    Locale.setDefault(Locale.US);

    Scanner sc =new Scanner(System.in);

    int[] n=new int[101];
    int maior=0;
    int pos=0;

    for(int i=1;i<101;i++){
        n[i] = sc.nextInt();
        if(n[i]>maior){
            maior=n[i];
            pos=i;
        }
    }

    System.out.println(maior);
    System.out.println(pos);

    sc.close();

    }
}