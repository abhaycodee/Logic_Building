package Array;

public class Merge_two_SortedArray {
    public static void main(String[] args) {



    int [] arr1={1,2,3,4,5,6,8};
    int [] arr2={9,10,11,13,14,16};

    int newlen=arr1.length+arr2.length;

    int [] new1=new int[newlen];


    // creating the for while loop for merging the two sorted array


int i=0,j=0,k=0;

while(i<arr1.length&&j<arr2.length)
{
  if(arr1[i]<arr2[j])
  {
      new1[k++]=arr1[i++];
  }
  else{
      new1[k++]=arr2[j++];
  }

// adding the remaining elememt of arr1 array to new array new1
  while(i<arr1.length)
  {
      new1[k++]=arr1[i++];
  }
//adding the remaining elememt of arr2 array to new array new1
  while(j<arr2.length)
  {
      new1[k++]=arr2[j++];
  }



}


        System.out.println("the sorted merge array is ....... ");
        for(int kk:new1)
        {
            System.out.print(kk+" ");
        }








    }
}
