import java.util.*;
class Abc
{
    int a=10;
    static int b=20;
    public static void main(String[] args)
    {
	Abc ob1 = new Abc();
	System.out.println("Message: "+ b);
	System.out.println(ob1.a); //10
	System.out.println(ob1.b); //20
	ob1.a =1000;
	ob1.b = 2000;  // or b=2000;
	System.out.println(ob1.a); //1000
	System.out.println(ob1.b);  //2000
	Abc ob2 = new Abc();
	System.out.println(ob2.a); //10
	System.out.println(ob2.b);  //2000
     }
}