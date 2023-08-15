package filehandling;

import java.io.*;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream=null;
        FileOutputStream fileOutputStream1=null;
        ByteArrayOutputStream byteArrayOutputStream=null;


        try {
            fileOutputStream=new FileOutputStream("sample4.txt");
            fileOutputStream1=new FileOutputStream("sample5.txt");
            byteArrayOutputStream=new ByteArrayOutputStream();
            byte[] arr="today is 23 March".getBytes();
            byteArrayOutputStream.write(arr);
            byteArrayOutputStream.writeTo(fileOutputStream);
            byteArrayOutputStream.writeTo(fileOutputStream1);


        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
               byteArrayOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




        FileInputStream fileInputStream=null;
        FileInputStream fileInputStream2=null;
        SequenceInputStream sequenceInputStream=null;

        try {
            fileInputStream=new FileInputStream("sample4.txt");
            fileInputStream2= new FileInputStream("sample5.txt");
            sequenceInputStream=new SequenceInputStream(fileInputStream, fileInputStream2);
            int i=sequenceInputStream.read();
            while (i>0){
                System.out.print((char)i);
                i=sequenceInputStream.read();
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                sequenceInputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
