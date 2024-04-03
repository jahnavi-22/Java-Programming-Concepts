package iostreamsORfileHandling;

import java.io.File;
import java.util.Scanner;

public class CreateDirectory {

	public CreateDirectory() {
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Path: ");
		String path = input.next();

		boolean createMoreDirectory = true;
		
		do {
			System.out.print("New Directory Name: ");
			String newDirectoryName = input.next();			// C:\Users\Lenovo\NALR
			path = path + "/" + newDirectoryName;
			
			File file = new File(path);
			
			boolean isCreated = file.mkdir();
			
			//file.mkdirs() method is more powerful than file.mkdir() method.
			
			if(isCreated) {
				System.out.println("Successfully created directory.");
			}else {
				System.out.println("Error in creation of directory.");
			}
			
			System.out.print("Do you want to create another directory? (Y/N)");
			String option = input.next();
			
			if(option.toUpperCase()=="N") {
				createMoreDirectory = false;
				break;
			}
		}
		while(!createMoreDirectory);
	}

}
