package InputOutput;

import java.io.*;

public class Reading_File {
    public static void main(String[] args) throws IOException {


        File file = new File("C:\\Users\\Abhay Saini\\Desktop\\awskey\\awske.pem");

//
//        boolean b = file.canRead();
//        System.out.println(b);
//        if(file.exists()&& file.canRead())
//        {
//
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//            String line;
//            while(bufferedReader!=null)
//            {
//
//   line =  bufferedReader.readLine();
//   System.out.println(line);
//            }
//
//
//        }
//else{
//            System.out.println("file not found ......");
//        }


  if(file.exists()&& file.canRead())
  {
      BufferedReader bufferedReader=null;
      try {

           bufferedReader = new BufferedReader(new FileReader(file));
          String line;
          while((line=bufferedReader.readLine())!=null)
          {
              System.out.println(line);
          }

      }

      catch (FileNotFoundException ex)
      {
          System.out.println("cannot open"+file.getName());
      }
      finally
      {
if(bufferedReader!=null)
{
    bufferedReader.close();
}
      }



  }

  else{
      System.out.println("not found ...");
  }


    }
}
