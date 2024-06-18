import java.util.Locale;
import java.util.Scanner;

public class SubstiVetor1BEECROWD1172
{
	public static void main(String[] args) {
	    
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int[] x=new int[10];
		
		for(int i=0;i<10;i++){
		    x[i]=sc.nextInt();
		    if(x[i]<=0){
		        x[i]=1;
		    }
		}
		
		for(int i=0;i<10;i++){
		    System.out.println("X[" + i + "] = " + x[i]);
		    
		}
		
		sc.close();
		
		
	}
}