package String;

import java.util.Scanner;

public class Equals_meth_doubleequaloperator {
    public static void main(String[] args) {



        String name="abhay";
        String name1=new String("abhay");


        // to compare the name and name1 using == and equal()


//        if(name==name1)
//        {
//            System.out.println(true);
//        }
//else{
//            System.out.println(false);
//        }

        boolean equals = name.equals(name1);
        System.out.println(equals);

        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);

    }
}
