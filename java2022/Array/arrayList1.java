import java.util.*;

public class arrayList1 { 
       public static void main(String[] args) { 
  	Scanner sc = new Scanner(System.in);
   	 ArrayList <String>car = new ArrayList<String>();
	    int choice=1;
	    System.out.println("Enter Value in ArrayList ::::::::");
	    do{
	    	car.add(sc.next());
	        System.out.println("Press 1 for more value 0 for stop!!");
	        choice = sc.nextInt();
	    }while(choice==1);
	    System.out.println("Length of ArrayList is :"+car.size());
	    System.out.println(car);
        } 
}
