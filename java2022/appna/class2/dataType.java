/* All datatype in java with user input */
import java.util.*;
class dataType
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name :");
		String name= sc.nextLine();
		System.out.print("Enter your roll :");
		int roll= sc.nextInt();
		System.out.print("Enter your total percentage :");
		float f1= sc.nextFloat();
		System.out.print("Enter final result true or false :");
		boolean b1 = sc.nextBoolean();
		System.out.print("Enter grade :");
		char c1 = sc.next().charAt(0);
		System.out.println(name+" "+roll+" "+f1+" "+b1+" "+c1);

	}
} 