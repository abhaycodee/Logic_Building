package Recursion;

public class FibonachiSeries {
    public static int fibonachi(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fibonachi(n-1)+fibonachi(n-2);
    }
    public static void main(String[] args) {


        int fibonachi =
                fibonachi(1);

        System.out.println("the fibonachi number is at the given position is "+fibonachi);









    }
}
