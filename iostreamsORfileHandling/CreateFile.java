package iostreamsORfileHandling;

/*
 * The File(1.0)(java.io.File) or The Path(1.7)(java.nio.file.Path).
 * Path is system dependent.
 * Absolute Path(always contains root element and complete directory list to access a file).
 * Relative Path(needs to be combined with another path to access a file).
 * 
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

	public CreateFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("File: ");		//temp_data.txt
		String file_name = input.next();

		String path = "C:\\Users\\Lenovo\\NALR";
		File file = new File(path + "/" + file_name);
		
		boolean result;
		
		try {
			result = file.createNewFile();      //creates a new file
			if(result) {
				System.out.println("File created!" +  "\n" + file.getCanonicalPath());		//returns the whole path 
			}else {
				System.out.println("File already exists at said location.");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
