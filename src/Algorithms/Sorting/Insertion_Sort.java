package Algorithms.Sorting;

public class Insertion_Sort {
    public static void main(String[] args) {



     int [] arr={23,45,12,19,15,8,5,90,34,56,12,32};

     // using insertion sort we have to arrange the array into the ascending order



        for(int i=0;i<arr.length;i++)
        {

            int key=arr[i];
            int j=i-1;

            while(j>-1 && arr[j]>key)
            {
                arr[j+1]=arr[j];     // arr[j+1] is the position of greater element and
                j--;                   // arr[j] is the are the elements which are being compared from key
            }
            arr[j+1]=key;

        }


        for(int ss:arr)
        {
            System.out.print(ss+" ");
        }


// insertion sort simply work on the idea that if the compared element is lesser , than whole list get shifted
// to make  space for element which is being compared   while loop is used to shift elements to create space for element on right position

    }
}
