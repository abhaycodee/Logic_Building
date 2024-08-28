package Array;

public class NegativeToBeginning {
    public static int [] arrangeArray(int [] arr)
    {
        int left=0;
        int right=arr.length-1;

        while(left<=right)
        {
            if(arr[left]<0)
            {
                left++;
            } else if (arr[right]>=0) {

                right--;

            }
            else{
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
              left++;
              right--;
            }
        }


       return arr;

    }
    public static void main(String[] args) {

        int []arr={23,2,34,2,23,34,323,34,346,6787,87,56,-34,-23,-23,-234,0,56,-378,-94,-14,-54,0,23,2,6,8,-5,6};

        // to arrange all negative number to the beginning of the array and positive number to the end of the aary

        int[] arr1 = arrangeArray(arr);

        System.out.println("the arranged element are ");
        for(int hh:arr1)
        {
            System.out.print(hh+" ");
        }


    }
}
