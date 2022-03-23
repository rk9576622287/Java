/* print the given star *
	* * * * *
	* * * * *
	* * * * *
	* * * * *	*/
import java.util.Scanner;
public class starPattern4
{
        public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter No. of rows and column:");
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    for(int i=1; i<=m; i++){
	         for(int j=1; j<=n; j++){
	           System.out.print(" * ");
	        }
	        System.out.println();
    	    }
         }
}