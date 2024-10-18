package InputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {



        String filePath = "D:\\NOTES\\SQL\\file1.txt";  // specify your file path
        String content = "This is another example of writing to a file using BufferedWriter.";

        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))) {
            writer.write(content);  // Writing content to file
            writer.newLine();  // Write a new line
            System.out.println("write data successful ...");
        } catch (IOException e) {
            e.printStackTrace();
        }













    }


}
