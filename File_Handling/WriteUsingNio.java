package File_Handling;        
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteUsingNio {
    public static void main(String args[]) throws IOException{
          
                Path p = Paths.get("dataset/newfile.txt");
                Path dp = Files.createFile(p);
                String c = "Hey coding owls!";
                Files.write(dp, c.getBytes());
                System.out.println("Content Added to newfile.txt");
            }       
    }
