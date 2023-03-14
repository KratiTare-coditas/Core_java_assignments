package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Question1 {
    public static void main(String[] args) throws Exception{

        FileInputStream fileInputStream=new FileInputStream("yash.txt");
        int i=0;
while((i=fileInputStream.read())!=-1)
{
    System.out.println((char)i);
}
fileInputStream.close();

        FileOutputStream fileOutputStream=new FileOutputStream("New.txt");
        String s="Hey Krati here";
        byte b[]=s.getBytes();
        fileOutputStream.write(b);
        fileOutputStream.close();
        System.out.println();

        String data="I belong to Betul";
        FileWriter fw=new FileWriter("newfile1.txt");
        fw.write(data);
        fw.close();

        FileReader fr=new FileReader("newfile1.txt");
        int j=0;
        while((j=fr.read())!=-1)
        {
            System.out.println((char)j);
        }
        fr.close();
    }
}
