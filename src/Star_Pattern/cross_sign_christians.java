package Star_Pattern;

public class cross_sign_christians {
    public static void main(String[] args) {



        // lets take 8 rows to print the pattern

        int n=8;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {

                if(j==n/2||i==(n-1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }








    }
}
