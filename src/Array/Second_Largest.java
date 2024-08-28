package Array;

public class Second_Largest {

    public static int secondLargest(int [] arr)
    {
        int largest=Integer.MIN_VALUE;
        int second_Largest=Integer.MIN_VALUE;

        for(int num:arr)
        {
            if(num>largest)
            {
                second_Largest=largest;
                largest=num;
            } else if (num>second_Largest&&num<largest) {

                second_Largest=num;

            }
        }
        return second_Largest;
    }


    public static void main(String[] args) {



int [] arr={1,23,45,67,89,100};

        int i = secondLargest(arr);
        System.out.println("the second largest is "+i);










    }
}
