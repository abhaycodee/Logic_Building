package Algorithms.Searching;

public class Binary_Search {
    public static void main(String[] args) {



    int [] arr={1,2,4,6,7,8,9,11,13,15,17,18,19,20};



        int li,mi,hi,search=67;
        li=0;
        hi=arr.length-1;
        mi=(li+hi)/2;

        while(li<=hi)
        {

            if(search==arr[mi]){

                System.out.print("element found at index "+mi);
                break;
            } else if (search<arr[mi]) {
                hi=mi-1;

            }
            else{
                li=mi+1;

            }
            mi=(li+hi)/2;


        }




        if(li>hi)
        {
            System.out.println("element not found in given list....");
        }




    }
}
