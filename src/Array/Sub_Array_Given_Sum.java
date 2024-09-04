package Array;

public class Sub_Array_Given_Sum {
    public static void main(String[] args) {


// have to subarray with given sum

        int []arr={23,34,45,56,57,1,2,3,4,5,6,7};
        int sum=13;
        int i=0,j=0;
        for(i=0;i<arr.length;i++)
        {
        int currentsum=0;
        for( j=i;j<arr.length;j++)
        {
            currentsum=arr[j]+currentsum;

            if(currentsum==sum)
            {
                System.out.print("sum found from the index "+i+"to"+j);
                break;
            }
        }

        }

    }
}
