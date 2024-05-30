import java.util.Scanner;
import java.util.Locale;

public class SequenciaSomaBEECROWD1101
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x,y,maior,aux,sum=0;
	
	    x = sc.nextInt();
	    y = sc.nextInt();
	    
	    while(x>0 && y>0){
	        
	        maior=x;
	        if(maior>y){
	          aux=y;
	          y=maior;
	          x=aux;
	        }
	        
	        for(int i=x;i<=y;i++){
	            sum=sum+i;
	            System.out.print(i + " ");
	        }
	        System.out.println("Sum=" + sum);
	        
	       sum=0; 
	       x = sc.nextInt();
	       y = sc.nextInt();
	       
	    }
	    
		sc.close();
		
	}
}