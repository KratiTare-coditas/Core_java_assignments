package FileHandling;
import java.io.*;
import java.io.IOException;

public class Question2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis1demo = new FileInputStream("yash.txt");
        FileInputStream fis2demo = new FileInputStream("newfile1.txt");
        FileOutputStream fos = new FileOutputStream("Output.txt");

        SequenceInputStream sis = new SequenceInputStream( fis1demo,fis2demo);
        int i;
        while((i=sis.read())!=-1){
            fos.write(i);
        }
    }
}
