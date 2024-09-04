package String;

public class Remove_Occurence {
    public static void main(String[] args) {



String name="abhay saini is good boy";

     String substring="saini";
        int index=name.indexOf(substring);

String resultstring=name.substring(0,index)+name.substring(index+substring.length());


        System.out.println("result string is = "+resultstring);

    }
}
