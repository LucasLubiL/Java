import java.util.Locale;
import java.util.Scanner;

public class TempoDeJogoMinutos {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int h1,m1,h2,m2,tf,mf,t1,t2,hf;

        h1=sc.nextInt();
        m1=sc.nextInt();
        h2=sc.nextInt();
        m2=sc.nextInt();

        if(h1==h2 && m1==m2){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }else{
            t1=h1*60+m1;
            t2=h2*60+m2;
            if(t1<t2){
                tf=t2-t1;
                hf=tf/60;
                mf=tf%60;
            }else {
                tf=(1440-t1)+t2;
                hf=tf/60;
                mf=tf%60;
            }
            System.out.println("O JOGO DUROU " + hf + " HORA(S) E " + mf + " MINUTO(S)");
        }

        sc.close();

    }
}
