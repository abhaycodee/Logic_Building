package String;

public class Vowel_Constanr_Count {
    public static void main(String[] args) {


        String name="hello my name is abhay";
        int vowel=0,constant=0;
        name.toLowerCase();
        for(int i=name.length()-1;i>=0;i--) {

            char c = name.charAt(i);

            if (c == 'a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                vowel++;
            }



        else{
            constant++;
            }

        }


        System.out.println("the vowel and constant are "+vowel+" "+constant);





    }
}
