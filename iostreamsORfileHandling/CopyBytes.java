package iostreamsORfileHandling;

import java.io.*;

/*
 * I/O stream is also known as file handling.
 * An I/O stream represents an input source or output destination.
 * A stream can represent many different kinds of sources and destinations including disk files, devices, other programs and memory arrays.
 * Can support many different kinds of data including simple bytes, primitive data types, localized characters and objects.
 * Some streams will simply pass on data while others manipulate and transform the data in useful ways.
 * 
 * 
 * A stream is a sequence of data.
 * A program uses input stream to read the data from a source one item at a time.
 * A program uses output stream to write data to a destination one item at a time.
 * --> System.out.println(); is a part of output stream.
 * 
 * TYPES OF I/O STREAMS:
 * Unbuffered I/O Stream: Writes to the disk directly, less efficient.
 * Buffered I/O Stream  : Writes to the buffer first then sends 
 * 
 * 
 * 
 * BYTE STREAM(UNBUFFERED): Used to read and write a single byte(8 bits) of data. 
 * 					 		All byte streams are derived from base abstract classes called Input stream and Output stream.
 * 
 * Create an InputStream/Reader object : 		FileInputStream in = new FileInputStream("source.txt");	
 * Create an OutputStream/Writer object: 		FileOutputStream out = new FileOutputStream("D://xyz.txt");
 * 
 * 
 * 
 * CHARACTER STREAM(UNBUFFERED): Used to read and write a single character of data. 
 * 					 			 All character streams are derived from base abstract classes called Reader and Writer.
 * 
 * Create an Reader object : 		FileReader in = new FileReader("source.txt");	
 * Create an Writer object: 		FileWriter out = new FileWriter("D://xyz.txt");
 * 
 * 
 * 
 * DATA STREAM: Supports binary I/O of primitive data type values (boolean, char, byte, short, int, long, float, and double) as well as String values.
 * 				All data streams are derived from base abstract classes called DataInputStream and DataOutputStream.
 * 
 * Create an Input object :			in  = new DataInputStream(new BufferedInputStream(new FileInputStream("D://xyz.txt")));
 * Create an Output object: 		out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("D://xyz.txt")));
 * 
 * 
 * 
 * OBJECT STREAM: Supports I/O objects. 
 * 				  All data streams are derived from base abstract classes called ObjectInputStream and ObjectOutputStream.
 * 
 * Create an Input object : 		in  = new ObjectInputStream(new FileInputStream("source.txt"));	
 * Create an Output object: 		out = new ObjectInputStream(new FileOutputStream("D://xyz.txt"));
 * 
 * 
 * 
 * BUFFERED: Needed when we want continuous connectivity.
 * 
 * Create an BufferedReader object : 			in = new BufferedReader("source.txt");	(source file)
 * Create an BufferedWriter object: 			out = new BufferedWriter("D://xyz.txt");
 * 
 * You cannot create an object inside a try block.
 * */

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in  = new FileInputStream("xyz.txt");
            out = new FileOutputStream("abc.txt");

            System.out.println("Total bytes available: " + in.available());


            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            System.out.println("The process is completed");
        } 
        
        catch (FileNotFoundException fe) {
            System.out.println("Sorry, the source file is not found!");
        } 
        
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
