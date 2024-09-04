package Array;

import java.util.ArrayList;
import java.util.List;

public class Occurence_Integer {
    public static void main(String[] args) {


        int[] arr = {23, 45, 56, 678, 23,34,45,6,6,6,23,34, 57, 6, 78, 65767};
int x=6;

int occ=0;
for(int i=0;i<arr.length;i++)
{
    if(x==arr[i])
    {
       occ=occ+1;
    }
}


        System.out.println(occ);
    }
}
