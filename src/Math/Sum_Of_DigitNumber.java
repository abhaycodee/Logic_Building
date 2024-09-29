package Math;

public class Sum_Of_DigitNumber {
    public static void main(String[] args) {


        int number = 45;

        int  sum=0;


        while(number!=0)
        {
            int number2=0;
            number2=number%10;    // get the last digit of the given number
            sum=sum+number2;
            number = number/10;   // remove the last digit
        }


        System.out.println("the sum of the digits of the given number is ="+sum);










    }
}
