/*
package Algorithms.Sorting;

public class Quick_Sort {






    public static int partioning(int [] arr,int li,int hi)
 {

     int pivot=arr[li+hi]/2;
     while(li<=hi)
     {
         while(arr[li]<pivot)
         {
             li++;
         }
         while(arr[hi]>pivot)
         {
             hi--;
         }

         if(li<=hi)
         {
             int temp=arr[li];
             arr[li]=arr[hi];
             arr[hi]=temp;
             li++;hi--;
         }
     }
     return li;
 }




    public static void quickSort(int[] arr,int li,int hi)
    {

        int pi = partioning(arr, li, hi);

        if(li<pi-1){
            quickSort(arr,li,pi-1);
        }
        if(pi<hi)
        {
            quickSort(arr,pi,hi);
        }

    }


   static   public  void  main(String[] args) {



        int [] arr={12,3,6,7,8,10,18,13,78,45};

        quickSort(arr,0,arr.length-1);

        for(int sd:arr)
        {
            System.out.print(sd+" ");
        }


    }
}
*/


package Algorithms.Sorting;

public class Quick_Sort {

    public static void quickSort(int[] arr, int li, int hi) {
        if (li < hi) {
            int pi = partitioning(arr, li, hi);

            quickSort(arr, li, pi - 1); // Sort the left part
            quickSort(arr, pi, hi);     // Sort the right part
        }
    }

    public static int partitioning(int[] arr, int li, int hi) {
        int pivot = arr[li + (hi - li) / 2]; // Correct pivot selection
        while (li <= hi) {
            while (arr[li] < pivot) {
                li++;
            }
            while (arr[hi] > pivot) {
                hi--;
            }
            if (li <= hi) {
                int temp = arr[li];
                arr[li] = arr[hi];
                arr[hi] = temp;
                li++;
                hi--;
            }
        }
        return li;
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 6, 7, 8, 10, 18, 13, 78, 45};
        quickSort(arr, 0, arr.length - 1);
        for (int sd : arr) {
            System.out.print(sd + " ");
        }
    }
}


// when the loop terminate after the completion of while loop when li>hi then on the palace of li pivot should be palace 




