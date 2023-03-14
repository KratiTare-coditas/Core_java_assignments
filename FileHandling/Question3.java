package FileHandling;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class Question3 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos1=new FileOutputStream("yash.txt");
        FileOutputStream fos2=new FileOutputStream("newfile1.txt");
        FileOutputStream fos3=new FileOutputStream("output.txt");
        ByteArrayOutputStream bout=new ByteArrayOutputStream();
        bout.write(55);
        bout.writeTo(fos1);
        bout.writeTo(fos2);
        bout.writeTo(fos3);
        bout.flush();
        bout.close();
        System.out.println("Adding same data to three files is success");
    }

}
