// replace a character in string by users entry  //
import java.util.*;
public class replaceCharInStringUserEntry
{
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String :");
		String str = sc.nextLine();
		System.out.print("Enter Character to replace :");;
		char cr1 = sc.next().charAt(0);
		System.out.print("By which Character to replace :");;
		char cr2 = sc.next().charAt(0);
		
		String result="";
		for(int i=0; i<str.length(); i++){
		    if (str.charAt(i)==cr1)
		        result+=cr2;
		    else    
		        result+=str.charAt(i);
		}
		
		System.out.println("New String is :"+ result);
	}
}
