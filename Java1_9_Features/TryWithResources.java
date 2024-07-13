package Java1_9_Features;

import java.io.*;

public class NewApproach{
    p
}
public class TryWithResources {
    public static void main(String[] args) {

        //old approach
        BufferedReader br = null;
        FileOutputStream fos = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Data: ");
            String data  = br.readLine();
            fos = new FileOutputStream("D:/JavaTraining_By_SIT/Java1_9_Features/abc.txt");
            byte[] b = data.getBytes();
            fos.write(b);
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            try{
                br.close();
                fos.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
