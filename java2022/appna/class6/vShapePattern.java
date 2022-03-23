/* Print  v shape pattern 
 *              *
 * *          * *
 * * *     * * * 
 * * * * * * * * 		       */
import java.util.Scanner;
public class vShapePattern
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. od Row :");
		int n = sc.nextInt();
	   	for(int i=1; i<=n; i++){
	      	      for(int j=1; j<=i; j++)
	          		  System.out.print("* ");
	       	      for(int j=1; j<=(n-i)*2; j++)
	        		  System.out.print("  ");
           		      for(int j=1; j<=i; j++)
	          	  	  System.out.print("* ");	    
	   	     System.out.println();
	   	 } 
	}
}
