package String;

public class Reverse_String {
    public static void main(String[] args) {

        String name="abhaysaini";
        String rev="";

        for(int i=name.length()-1;i>=0;i--)
        {
            char c = name.charAt(i);
            rev=rev+c;
        }
        System.out.println("the reverse of string is ");
        System.out.println(rev);




    }
}












