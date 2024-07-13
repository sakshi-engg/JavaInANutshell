
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class TryWithResoure {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			FileOutputStream fos = new FileOutputStream("E:/student.txt");
			
		
		
			System.out.println("Enter Data :");
			String data = br.readLine();
			byte[] b = data.getBytes();
			fos.write(b);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
				
	
	}

}