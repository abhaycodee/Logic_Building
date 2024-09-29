package Star_Pattern;

public class Inverted_Pyramid {

    public static void main(String[] args) {



int n=6;
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
