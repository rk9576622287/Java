/* print the given star *
	* * * * 
 	* * *
	* * 
	*	*/
import java.util.Scanner;
public class starPattern4
{
        public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter No. of rows :");
	    int n = sc.nextInt();
	    for(int i=n; i>=1; i--){
	         for(int j=1; j<=i; j++){
	           System.out.print(" * ");
	        }
	        System.out.println();
    	    }
         }
}