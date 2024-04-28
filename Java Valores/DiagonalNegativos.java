import java.util.Locale;
import java.util.Scanner;

public class DiagonalNegativos {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        System.out.println("Qual a ordem da matriz?");
        int x=sc.nextInt();

        double[][] mat=new double[x][x];
        int cont=0;

        for(int l=0;l<x;l++){
            for(int c=0;c<x;c++){
               mat[l][c]=sc.nextDouble();
            }
        }

        System.out.println();

        System.out.println("Esta é sua matriz:");
        for(int l=0;l<x;l++){
            for(int c=0;c<x;c++){
               System.out.print(mat[l][c]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("DIAGONAL PRINCIPAL:");
        for(int l=0;l<x;l++){
            for(int c=0;c<x;c++){
               if(l==c){
                 System.out.print(mat[l][c]+" ");
               }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("DIAGONAL SECUNDÁRIA:");
        for(int l=0;l<x;l++){
            for(int c=0;c<x;c++){
               if(l+c==x-1){
                 System.out.print(mat[l][c]+" ");
               }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("DIAGONAL PRINCIPAL:");
        for(int l=0;l<x;l++){
            for(int c=0;c<x;c++){
               if(mat[l][c]<0){
                   cont++;
               }
            }
        }
        System.out.println("QUANTIDADE DE NEGATIVOS: "+cont);

        sc.close();

    }
    
}
