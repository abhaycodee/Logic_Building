package Algorithms.Sorting;

public class Bubble_Sort {
    public static void main(String[] args) {



int [] arr={25,15,22,20,14,19,27,10,8,5,43,2,0,1};

// to sort this array in descending order using bubble sort algo.


        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }


for(int kk:arr)
{
    System.out.print(kk+" ");
}




    }
}
