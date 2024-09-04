package String;

public class Substring_Present {
    public static void main(String[] args) {

        String name="tcs technology hire the candidate for java developer";
String sub="hire";
        int n = name.length();
boolean flag=false;
int i=0,j=0;
        for( i=0;i<n;i++)
        {
            String name1="";
            for( j=i;j<n;j++)
            {
                 name1 = name.substring(i, j);
                if(name1.equals(sub))
                {
                    flag=true;
break;
                }
            }
            System.out.println("the value of i and j is "+i+" "+j);
            if(flag==true)
            {
                break;
            }
        }

        if(flag==true)
        {
            System.out.println("found......");
        }

        else{
            System.out.println("not found ");
        }
    }
}
