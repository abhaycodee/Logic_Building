package Array;

import java.util.ArrayList;
import java.util.HashSet;

public class Common_Element {
    public static void main(String[] args) {

        int [] arr={23,45,56,678,78,78,67,54,45,3,667,78,876554,56,67,8,787,98,75,654,5345,57,6,78,65767};
        int []arr2={34,34,434,34,43,44,34,34,65,65,6,45,4,56,765,64,5,56,56,64,54,6,45,4,34,3,56,67};

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> list2 = new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
   for(int j=i+1;j<arr2.length;j++)
   {
       if(arr[i]==arr2[j])
       {
           list.add(arr[i]);
           list2.add(arr[i]);
       }
   }
        }



        // the common elements inside the array1 and array2 is

        System.out.print(list+",");
        System.out.println();
        System.out.print(list2+",");

    }
}
