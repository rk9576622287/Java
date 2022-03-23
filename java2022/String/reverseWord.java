import java.util.Scanner;
import java.util.Stack;
public class reverseWord
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stk = new Stack<>();
        System.out.print("Enter your String :");
        String input = sc.nextLine();
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) != ' '){
                stk.push(input.charAt(i));
            }
            else if(input.charAt(i) == ' '){
                while(!stk.empty()){
                    System.out.print(stk.pop());
                }
                System.out.print(" ");
            }
            if(i==input.length()){
                while(!stk.empty()){
                    System.out.print(stk.pop());
                }
            }
        }
	}
}
