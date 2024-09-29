package Star_Pattern;

public class Diamond {
    public static void main(String[] args) {




        int n=8;
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


        // for the lower part of the diamond

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            // for space and star

            for(int k=i;k<n;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }






    }
}
