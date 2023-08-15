package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriter fileWriter=null;
//character stream class

        try {

            fileWriter=new FileWriter("Sample.txt");
            fileWriter.write("Today is Thursday.");
            System.out.println("File is saved...");
            fileWriter.flush();

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }


        try {
            FileReader fileReader = new FileReader("Sample.txt");
            int i = fileReader.read();
            
            }catch(IOException e){
                e.printStackTrace();
            }
        }
}
