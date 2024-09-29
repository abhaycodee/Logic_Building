package Math;

public class Greatest_ThreeNumber {
    public static void main(String[] args) {

        short a=0;
        short b=6;
        short c=1;

        if(a>b&&b<c)
        {
            System.out.println("b is smaller");
        } else if (c<a&&c<b) {
            System.out.println("c is smaller");
        }
else {
            System.out.println("a is smaller");
        }

    }
}
