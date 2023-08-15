package filehandling;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) {
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter=new FileWriter("sample3.txt");
            bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("Today is 23 March");

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try {
            fileReader=new FileReader("sample3.txt");
            bufferedReader=new BufferedReader(fileReader);
            int i=bufferedReader.read();
            while (i>0){
                System.out.print((char)i);
                i=bufferedReader.read();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
