/** print the given star *
	*  *  *  *  * 
	*            *
	*            *
	*  *  *  *  *		*/

import java.util.Scanner;
public class starPattern2
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter value of row and column :");
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    for(int i=1; i<=m; i++){
	         for(int j=1; j<=n; j++){
	           if(i==1 || j==1 || i==m || j==n){
	               System.out.print(" * ");
	           }
	          else{
	                   System.out.print("   ");
	           }
	        }
	        System.out.println();
    	}
	}
}
