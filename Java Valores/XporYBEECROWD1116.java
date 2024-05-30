import java.util.Scanner;
import java.util.Locale;
 
public class XporYBEECROWD1116
{
	public static void main(String[] args) {
	    
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    int n,x,y;
	    double conta;
	    
	    n = sc.nextInt();
	    
	    for(int i=0;i<n;i++){
	        x = sc.nextInt();
	        y = sc.nextInt();
	        
	        if(y==0){
	            System.out.println("divisao impossivel");
	        }else{
	            conta=(double)x/y;
	            System.out.println(String.format("%.1f", conta));
	            
	        }
	        
	    }
	    
	}
}
