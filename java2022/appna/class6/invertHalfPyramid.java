//Print Inverted Half Pyramid.
import java.util.Scanner;
public class invertHalfPyramid
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of Row :");;
		int n = sc.nextInt();
		++n;
	    for(int i=1; i<=n; i++){
	        for(int j=1; j<=n-i; j++)
	            System.out.print(i);
	        System.out.println();
	    }
	}
}