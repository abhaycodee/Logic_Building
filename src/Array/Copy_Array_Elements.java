package Array;

public class Copy_Array_Elements {
    public static void main(String[] args) {


int []arr={23,45,34,23,23,23,4,656,7,45,76,676,46,766,865,54,4,3,435,6765,5,4,5465,6232};
int [] arr2={35,34,2,445,4,6565,76,878,787};

int [] arr3=new int[arr.length+arr2.length];


   for(int i=0;i<arr3.length;i++)
   {

       if(i<arr.length)
       {
           arr3[i]=arr[i];

       } else if (i>=arr.length) {

           arr3[i]=arr2[i-arr.length]; // 24-24 , 25-24 , 26-24 so on it gives the index of arr2
       }


   }
for(int hj:arr3)
{
    System.out.print(hj+" ");
}
        System.out.println("success");

    }
}
