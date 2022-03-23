/* print if number is prime or not */
import java.util.*;
class primeNumber{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter number :");
		int num = sc.nextInt();
		int count=0;
		for(int i=2; i<=num/2; i++){
			if(num % i == 0){
				count=1;
				System.out.println("NOT Prime");
				break;
			}
		}
		if(count==0)
			System.out.print("PRIME Number");
	}
}