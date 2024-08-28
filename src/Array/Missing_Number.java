package Array;

public class Missing_Number {
    public static void main(String[] args) {


        // finding the missing number from the continuse increasing number

        int [] arr={1,2,3,4,5,6,7,8,9,10,12,13,14};
        int missing_number=0;
        //missing number is =expectedsum-actualsum
        int n=arr.length;

        int esum=n*(n+1)/2;
        int asum=0;

        for(int i=0;i<arr.length-1;i++)
        {
            asum+=arr[i];
        }

        missing_number=esum-asum;
        System.out.println("the missing number is "+missing_number);







    }
}
