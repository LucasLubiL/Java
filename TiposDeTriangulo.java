import java.util.Locale;
import java.util.Scanner;

public class TiposDeTriangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double a,b,c,aux;

        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();

        if(a<b){
            aux=a;
            a=b;
            b=aux;
        }

        if(a<c){
            aux=a;
            a=c;
            c=aux;
        }
        
        if(b<c){
            aux=b;
            b=c;
            c=aux;
        }

        if(a>=b+c){
            System.out.println("NAO FORMA TRIANGULO");
        }else {
            if(a*a==b*b+c*c){
               System.out.println("TRIANGULO RETANGULO");
            }
            if(a*a>b*b+c*c){
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if(a*a<b*b+c*c){
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if(a==b && b==c){
                System.out.println("TRIANGULO EQUILATERO");
            }
            if(a==b || b==c || a==c){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();

    }
    
}
