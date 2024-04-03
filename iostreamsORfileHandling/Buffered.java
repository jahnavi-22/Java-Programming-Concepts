package iostreamsORfileHandling;

import java.io.*;

public class Buffered {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bReader = null;		
		BufferedWriter bWriter = null;		
		
		try {
			bReader = new BufferedReader(new FileReader("source.txt"));
			bWriter = new BufferedWriter(new FileWriter("destination.txt"));

            //System.out.println("Total bytes available: " + in.read());

            String line;
            while ((line = bReader.readLine()) != null) {
            	bWriter.write(line);
            }

            System.out.println("The process is completed");
        } 
        
        catch (FileNotFoundException fe) {
            System.out.println("Sorry, the source file is not found!");
        } 
        
        finally {
            if (bReader != null) {
            	bReader.close();
            }
            if (bWriter != null) {
            	bWriter.close();
            }
        }
	}
}