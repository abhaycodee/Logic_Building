package Array;

import java.util.ArrayList;
import java.util.List;
//
//public class TripletSum {
//    public static ArrayList<Integer> tripletSum(int []arr, int sum)
//    {
//        ArrayList<Integer> integers = new ArrayList<>();
//
//        int n= arr.length-1;
//
//        for(int i=0;i<=n;i++)
//        {
//            for(int j=i+1;j<=n;j++)
//            {
//                for(int k=j+1;k<=n;k++)
//                {
//                    if(arr[i]+arr[j]+arr[k]==sum)
//                    {
//                        integers.add(i);
//                        integers.add(j);
//                        integers.add(k);
//                        break;
//                    }
//                }
//            }
//        }
//
//        return integers;
//    }
//
//    public static void main(String[] args) {
//
//
//int [] arr={23,45,56,34,24,556,76,4,4,43,545,567,1,2,3,4,5,6,7,8,0};
//
//int sum=12;
//
//        ArrayList<Integer> integers = tripletSum(arr,sum);
//
//        System.out.println(integers);
//
//
//    }
//}



import java.util.ArrayList;
import java.util.HashSet;

public class TripletSum {
    public static ArrayList<Integer> tripletSum(int[] arr, int sum) {
        ArrayList<Integer> indices = new ArrayList<>();
        HashSet<String> uniqueTriplets = new HashSet<>();
        int n = arr.length - 1;

        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        String triplet = i + "," + j + "," + k;
                        if (!uniqueTriplets.contains(triplet)) {
//                            uniqueTriplets.add(triplet);

                            indices.add(i);
                            indices.add(j);
                            indices.add(k);
                        }
                    }
                }
            }
        }

        return indices;
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 56, 34, 24, 556, 76, 4, 4, 43, 545, 567, 1, 2, 3, 4, 5, 6, 7, 8, 0};
        int sum = 12;

        ArrayList<Integer> indices = tripletSum(arr, sum);

        for (int i = 0; i < indices.size(); i += 3) {
            System.out.println("Indices: " + indices.get(i) + ", " + indices.get(i + 1) + ", " + indices.get(i + 2));
        }
    }
}
