package Star_Pattern;

public class Pattern2 {
    public static void main(String[] args) {


        int n=8;
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>=0;j--)
            {
                if(j<n-i)
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
