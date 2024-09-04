package String;

import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name;
        System.out.println("enter the name....");
       name= sc.nextLine();
        int n = name.length();
        String rev="";

        for(int i=n-1;i>=0;i--)
        {
            char c = name.charAt(i);
            rev=rev+c;
        }

        if (name.equals(rev))
        {
            System.out.println("the String is palindrome");
        }
else{
            System.out.println("not palindrome....");
        }
    }
}
