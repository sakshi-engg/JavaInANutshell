package File_Handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class First2 {
    public static void main(String[] args) throws IOException {
      
        Path p = Paths.get("student.txt");
        if (Files.exists(p)) {
            System.out.println("File already exists");
        } else {
            Path fp = Files.createFile(p);
            System.out.println("File is created at " + fp.toString());
        }
    }
}
