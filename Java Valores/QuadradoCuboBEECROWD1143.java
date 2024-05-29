import java.util.Scanner;
 
public class QuadradoCuboBEECROWD1143
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n,mult,cubo;
	    n = sc.nextInt();
	    
	    for(int i=1;i<=n;i++){
	        mult=i*i;
	        cubo=i*mult;
	        System.out.println(i + " " + mult + " " + cubo);
	    }
	    
	    sc.close();
	    
	}
}