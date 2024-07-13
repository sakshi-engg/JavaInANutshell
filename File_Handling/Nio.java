package File_Handling;
import java.io.IOException;
import java.nio.file.*;
public class Nio {
    public static void main(String args[]) throws IOException{
        // Path p = Paths.get("dataset");
        Path p = Paths.get("Dataset");

        if(Files.exists(p)){
            
            System.out.println("Directory already exists");
        } else{
            Path dp = Files.createDirectories(p);
            System.out.println("Directory is created at "+dp.toString());
        }
    }
}
