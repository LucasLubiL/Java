import java.util.Locale;
import java.util.Scanner;

public class FatorialSimplesBEECROWD1153
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n,mult=0;
		
		n=sc.nextInt();
		
		mult=n;
		for(int i = n-1 ; i >=1; i--){
		    mult=mult*i;
		  
		}
		System.out.println(mult);
		
		sc.close();
	}
}