class Abc
{
    int a=10;
    static int b=20;
    public static void main(String[] args)
    {
	scanner = new Scanner();
	Abc ob1 = new Abc();
	System.Out.Println(ob1.a); //10
	System.Out.Println(ob1.b);
	ob1.a =1000;
	ob1.b = 2000;
	System.Out.Println(ob1.a); //1000
	System.Out.Println(ob1.b);  //2000
	Abc ob2 = new Abc();
	System.Out.Println(ob1.a); //10
	System.Out.Println(ob1.b);  //2000
     }
}