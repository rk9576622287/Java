//power of x to n
import java.util.Scanner;
public class powerOfXtoN
{
    static void power(int x, int n){
        int pwr=x;
        if(n>0){
            for(int i=2; i<=n; i++){
                pwr*=x; 
            }
            System.out.print("power of x to n is :" +pwr);
        }
        else
            System.out.print("power of "+ x + " to " + n + " is : 1");
        
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of x and n :");
		int x = sc.nextInt();
		int n = sc.nextInt();
		power(x,n);
	}
}