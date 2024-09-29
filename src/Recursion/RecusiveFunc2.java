package Recursion;

public class RecusiveFunc2 {


    public static int rec(int h)
    {
        int jk;
        if(h<=1)
        {
            System.out.println("value from the if ="+h);
            return 1;

        }

       else {
            jk=h*rec(h-1);
            System.out.println("value from else ="+jk);
        }
        return jk;
    }
    public static void main(String[] args) {


        System.out.println("the value return by the rec() from main "+rec(8));






    }
}
