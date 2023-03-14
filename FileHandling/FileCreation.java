package FileHandling;
import java.io.File;
import java.io.IOException;
public class FileCreation {
    public static void main(String[] args) throws Exception {
        File file = new File("yash.txt");
        if (file.exists()) {
            System.out.println("File do exist");
        } else {
            file.createNewFile();
            System.out.println("File is created");
        }

    }
}
