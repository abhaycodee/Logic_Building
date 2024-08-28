package Array;

import java.util.ArrayList;

public class Double_Sum {
    public static void main(String[] args) {


    int []arr={23,45,2,34,5,2,3,523,34,45,2,76,67,4543,34,45,23,345,6,5,4,3,4,56};

    int sum=10;
    int n=arr.length-1;//n is the length of the array arr

        ArrayList<String> indexes = new ArrayList<>();


        for(int i=0;i<n;i++)
  {
      for(int j=i+1;j<n;j++)
      {
          if(arr[i]+arr[j]==sum)
          {
              String index= i+","+j;
              indexes.add(index);
          }
      }
  }


        System.out.println("the number of the doublet corressponding to the the given sum is "+indexes.size());

        System.out.println("the doublets are the .... ");
        for(String hh:indexes)
        {
            System.out.println(hh);
        }


    }
}
