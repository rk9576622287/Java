import java.util.*;
public class overloading
{
      int sum(int a, int b)
      {
	return(a+b);
      }
      int sum(int a, int b, int c)
      {
	return(a+b+c);
      }
      double sum(double a, double b)
      {
	return(a+b);
       }
       double sum(int a, double b)
       {
 	return(a+b);
        }
        String sum(char a, char b)
        {
	return (a+""+b);
        }
        String sum(String a, String b)
        {
	
	return a+" "+b;
        }
        public static void main(String[] args)
        {
	overloading obj = new overloading();
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	double d,e;
	char f,g;
	String h,i;
	a = sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextDouble();
	e=sc.nextDouble();
	f=sc.next().charAt(0);
	g=sc.next().charAt(0);
	h=sc.nextLine();
	i=sc.nextLine();
	System.out.println("Sum by two int value: "+obj.sum(a,b));
	System.out.println("Sum by three int value: "+obj.sum(a,b,c));
	System.out.println("Sum by one int value and 2nd double value: "+obj.sum(a,d));
	System.out.println("Sum by two double value: "+obj.sum(d,e));
	System.out.println("Sum by two char value: "+obj.sum(f,g));
	System.out.println("Sum by two String value"+obj.sum(h,i));
        }
}