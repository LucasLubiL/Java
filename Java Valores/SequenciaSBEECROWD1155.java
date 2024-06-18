import java.util.Locale;
import java.util.Scanner;

public class SequenciaSBEECROWD1155
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double s=1;
		
		for(int i=2;i<100;i++){
		    s=s+1/(double)i;
		}
		s=s+0.01;
		System.out.println(String.format("%.2f",s));
		
		sc.close();
	}
}