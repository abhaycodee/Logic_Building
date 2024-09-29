package Recursion;

public class Reverse_String {
    public static String revString(String name)
    {


if(name.isEmpty())
{
    System.out.println("name is already empthy ");
    return name;
}

return revString(name.substring(1))+name.charAt(0);
    }
    public static void main(String[] args) {


        String abhay = revString("abhay");

        System.out.println(abhay);




    }
}
