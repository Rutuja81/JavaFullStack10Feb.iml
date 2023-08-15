package filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) {
        try {
            File file=new File("C:\\Users\\admin\\IdeaProjects\\JavaFullStack10Feb\\src\\filehandling\\test3.text");
            File file1=new File("test4.text");
            boolean f=file.createNewFile();
            System.out.println(f);

            System.out.println(file.compareTo(file1));
            System.out.println(file.canExecute());
            System.out.println(file.canRead());
            System.out.println(file.isFile());
            System.out.println(file.canWrite());
            System.out.println(file.exists());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getCanonicalPath());
            System.out.println(file.getName());
            System.out.println(file.getParent());
            System.out.println(file.getPath());
            System.out.println(file.getUsableSpace());
            System.out.println(file.isDirectory());
            System.out.println(file.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
