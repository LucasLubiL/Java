import java.util.Locale;
import java.util.Scanner;

public class NumPrimoBEECROWD1165
{
	public static void main(String[] args) {
	    
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int x, y, cont=0;
		
		x=sc.nextInt();
		
		for(int i=0;i<x;i++){
		    cont=0;
		    y=sc.nextInt();
		    for(int j=1;j<=y;j++){
		        if(y%j==0){
		            cont++;
		        }
		    }
		    
		    if(cont==2){
		        System.out.println(y + " eh primo");
		    }else{
		        System.out.println(y + " nao eh primo");
		    }
		    
		}
		
		
		sc.close();
		
		
	}
}