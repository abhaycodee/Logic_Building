package Math;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number .....");
        int number =sc.nextInt();

        // to print he multiplication table we us the for loop

        for(int i=1;i<=10;i++)
        {
            System.out.println(number+"x"+i+"="+number*i);
        }






    }
}
