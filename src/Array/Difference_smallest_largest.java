package Array;

public class Difference_smallest_largest {
    public static void main(String[] args) {


        int[] arr = {23, 45, 56, 678, 78, 78, 67, 54, 45, 3, 667, 78, 876554, 56, 67, 8, 787, 98, 75, 654, 5345, 57, 6, 78, 65767};


        int min=arr[0];
        int max=arr[0];

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

int diff=max-min;
        System.out.print(diff);


    }
}
