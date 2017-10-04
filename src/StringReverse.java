import java.util.Scanner;

/**
 * Created by sonal on 18/9/17.
 */

public class StringReverse {
    void reverse(String str) {
        String r = "";
        int length = str.length();
        System.out.println("length of string is:" + length);
        for (int i = length - 1; i >= 0; i--) {
            r = r + str.charAt(i);
        }
        System.out.println("reverse string is:" + r);
    }
    public static void main(String[] args) {
        StringReverse sr=new StringReverse();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter string to reverse:");
        String ss=s.next();
        sr.reverse(ss);
    }
}
