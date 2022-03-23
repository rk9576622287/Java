/*Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user. */

import java.util.*;
public class CreateUsernameByEmail
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Email id :");
        String email = sc.next();
      //System.out.println(email);
        String user = "";
        for(int i=0; i<email.length(); i++){
            if(email.charAt(i)=='@')
                break;
            else    
                user+=email.charAt(i);
        }
        
        System.out.print("Your username is : "+ user);
	}
}
