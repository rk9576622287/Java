// To check perfect square or not
import java.io.*;
import java.util.*;

public class checkPerfectSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean c = false;
        for(int i=1; i<num && i*i<=num; i++){
            if(i*i==num ){
                System.out.println("true");
                c=true;
            }
        }
        if(!c){
            System.out.println("false");
        }
    }
}