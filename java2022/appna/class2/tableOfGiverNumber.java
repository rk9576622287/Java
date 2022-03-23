/* Table of a number that input by user */
import java.util.*;
class tableOfGivenNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :");
		int num = sc.nextInt();
		for(int i=1; i<=10; i++){
			System.out.println(num+ " * "+i+" = "+(num*i));
		}
	}
}