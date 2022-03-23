/* Make a claculator */
import java.util.*;
class calculator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number :");
		int a= sc.nextInt();
		System.out.print("Enter Sedond number :");
		int b= sc.nextInt();
		System.out.print("Enter \n\t1 for addition. \n\t2 for substraction.\n\t3 for multiplication.\n\t4 for devision. \n\t5 for modulas. ");
		System.out.print("\nEnter your choice :");
		int num = sc.nextInt();
		switch(num){
		case 1:
			System.out.println(a+" + "+b+" is :"+(a+b));
			break;
		case 2:
			if(a>b)
				System.out.println(a+" - "+b+" is :"+(a-b));
			else 
				System.out.println( b+" - "+a+" is :"+(b-a));
			break;
		case 3:
			System.out.println(a+" * "+b+" is :"+(a*b));
			break;
		case 4:
			if(b>a)
				System.out.println("Divident is less then divisor!!");
			else 
				System.out.println(a+" / "+b+" is :"+(a/b));
			break;
		case 5:
			System.out.println(a+" % "+b+" is :"+(a%b));
			break;
		default:
			System.out.println("INVALID INPUT!!");
		}
	}
}