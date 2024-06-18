import java.util.Locale;
import java.util.Scanner;

public class TrocaVetorBEECROWD1175
{
	public static void main(String[] args) {
	    
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[20];
		int[] y = new int[20];
		
		int j = 19;
		
		for(int i=0;i<20;i++){
		    x[i]=sc.nextInt();
		    y[j]=x[i];
		    j--;
		}
		for(int i=0;i<20;i++){
		    System.out.println("N[" + i + "] = " + y[i]);
		}
		
	
		sc.close();
		
		
	}
}