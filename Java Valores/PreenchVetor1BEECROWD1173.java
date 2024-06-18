import java.util.Locale;
import java.util.Scanner;

public class PreenchVetor1BEECROWD1173
{
	public static void main(String[] args) {
	    
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int[] x=new int[10];
		int mult=0;
		
		x[0]=sc.nextInt();
		mult=x[0];
		
		for(int i=1;i<10;i++){
		    mult=mult*2;
		    x[i]=mult;
		    
		}
		
		for(int i=0;i<10;i++){
		    System.out.println("N[" + i + "] = " + x[i]);
		}
		
		sc.close();
		
	}
}