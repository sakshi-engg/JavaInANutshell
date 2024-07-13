package File_Handling;

import java.io.File;

class FileHandlingEx {
	public static void main(String[] args)
	{
		// File name specified
		File obj = new File("D:\\JavaTraining_By_SIT\\File_Handling"+"myfile1.txt");
		System.out.println("File Created!"+obj.getPath());
	}
}
