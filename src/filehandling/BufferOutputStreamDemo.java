package filehandling;

import java.io.*;

public class BufferOutputStreamDemo {


    public static void main(String[] args) {

        FileOutputStream fileOutputStream=null;
        BufferedOutputStream bufferedOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream("sample2.txt");
            bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
            byte[] arr="today is 23 March".getBytes();
            bufferedOutputStream.write(arr);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




        FileInputStream fileInputStream=null;
        BufferedInputStream bufferedInputStream=null;

        try {
            fileInputStream=new FileInputStream("sample2.txt");
            bufferedInputStream=new BufferedInputStream(fileInputStream);
            int i=bufferedInputStream.read();
            while (i>0){
                System.out.print((char)i);
                i=bufferedInputStream.read();
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedInputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
