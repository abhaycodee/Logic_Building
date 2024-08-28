package Algorithms.Sorting;

public class Selection_Sort {
    public static void main(String[] args) {


     int [] arr={34,12,5,3,56,67,37,36,55,27,19,1};

     // to sort the array using the selection sort algo
        // it have lesser time complexity than bubble sort algo.

        int min=0;

        for(int i=0;i<arr.length;i++)
        {
            min=i;
            for(int j=i+1;j<arr.length;j++)
            {

                if(arr[min]>arr[j])
                {
                    min=j;
                }

            }
            // swaping of elements take place with every outer iteration

           int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }


    for(int df:arr)
    {
        System.out.print(df+" ");
    }


    }
}
