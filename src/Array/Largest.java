package Array;

public class Largest {
    public static void main(String[] args) {



        int [] arr={12,34,1,5,8,4,9,17,19,45,23,18,55,77,55,58};

        int max=arr[0];
        for(int hh:arr)
        {
            if(hh>max)
            {
                max=hh;
            }
        }


        System.out.println("the largest of the element "+max);



    }
}
