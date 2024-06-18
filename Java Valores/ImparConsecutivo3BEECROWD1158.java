import java.util.Locale;
import java.util.Scanner;

public class ImparConsecutivo3BEECROWD1158
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, a, soma=0, cont=0;
		
		a=sc.nextInt();
		
		for(int i=0;i<a;i++){
		    
		    x=sc.nextInt();
	     	y=sc.nextInt();
		
		   soma=0;
		   cont=0;
		   
		    for(int j=x;j<=1000000;j++){
		        if(j%2!=0){
		            cont++;
		            soma=soma+j;
		            if(cont==y){
		                break;
		            }
		        }
		    }
		    
		    System.out.println(soma);
		    
		}
		
		sc.close();
	}
}