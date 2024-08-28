package Array;

import java.util.ArrayList;

public class Triple_Sum2 {
    public static void main(String[] args) {

        int[] arr = {23, 45, 56, 34, 24, 556, 76, 4, 4, 43, 545, 567, 1, 2, 3, 4, 5, 6, 7, 8, 0};
        int sum = 12;

        ArrayList<String> indices = new ArrayList<>();


        for (int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length-1;j++) {
                for (int k = j + 1; k < arr.length - 1; k++)
                {
                   if(arr[i]+arr[j]+arr[k]==sum)
                   {
                       String indice=i+", "+j+", "+k;
                       indices.add(indice);
                   }
                }
            }
        }



        for (int i = 0; i < indices.size(); i ++) {
           // System.out.println("Indices: " + indices.get(i) + ", " + indices.get(i + 1) + ", " + indices.get(i + 2));

            System.out.println("Indices: " + indices.get(i));
        }




    }
}
