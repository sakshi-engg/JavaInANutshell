package File_Handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) {
        try {
            File file = new File("myfile.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Hello, World!"); // Write the data into the file
            bw.close(); // Close the BufferedWriter to ensure all data is written to the file

            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
