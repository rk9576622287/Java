import java.util.*;
class calc
{
       public static void main(String args[])
       {
	int a,b,c;
       	Scanner rit =new Scanner(System.in);
	System.out.print("Enter First number :");
	a=rit.nextInt();
	System.out.print("Enter Second number :");
	b=rit.nextInt();
	System.out.print("Press 1 for(+) 2 for(-) :");
	c=rit.nextInt();
	switch(c)
	{
	        case 1:
		System.out.println(a+b);
		break;
	         case 2:
		System.out.println(a-b);
		break;
	         default :
		System.out.println("INVALID no choosen !!");
		//break;
	}
       }
}