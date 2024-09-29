package String;

import java.util.Arrays;

public class Anagram_TwoString {

    public static boolean anagram(String str1, String str2)
    {


       str1=str1.toLowerCase();
       str2=str2.toLowerCase();

        char[] charArray1 = str1.toCharArray();
        char[] charArray = str2.toCharArray();

        Arrays.sort(charArray1);  // this sort method is use to arrange all the character in same order
        Arrays.sort(charArray);


        boolean flag = Arrays.equals(charArray, charArray1);
        return flag;
    }

    public static void main(String[] args) {


        boolean anagram = anagram("abhay", "arpit");

        System.out.println(anagram);


    }
}
