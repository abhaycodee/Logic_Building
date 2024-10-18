package InputOutput;

import java.io.File;
import java.util.Scanner;

public class Check_File {
    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);
        System.out.println("enter the directory name");
        String file = sc.nextLine();

        File file1 = new File(file);
        if(file1.exists())
        {
            System.out.println("file found ...");
            String absolutePath = file1.getAbsolutePath();
            System.out.println(absolutePath);
            long length = file1.length();
            System.out.println(length);
            //to find directory name

            String parent = file1.getParent();
            System.out.println(parent);
        }
else{
            System.out.println("file not found ....");
        }

    }
}
