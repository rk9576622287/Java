/* Take radius of area and calculate aree */
import java.util.*;
class areaOfCircle
{
	static float PI=3.1415F;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of circle :");
		float radius = sc.nextFloat();
		float area = PI*radius*radius;
		System.out.println("Area of the given radius is :"+area);
	}
}
