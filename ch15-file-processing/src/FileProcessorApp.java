import java.io.*;
import java.nio.file.*;

public class FileProcessorApp {

	public static void main(String[] args) throws IOException {
		// Create a c:/temp folder on our hard drive
		String dirString = "c:/temp/sub1/sub2";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath)) {
			Files.createDirectories(dirPath);
			System.out.println("directory Created!");
		}
		else {
			System.out.println("directory already exists");
		}
		
		// Create a products.txt file
		String fileString = "products.txt";
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath)) {
			System.out.println("creating file!");
			Files.createFile(filePath);
		}
		else {
			System.out.println("file already exists");
		}
		
		// pp. 466 - 467 - write date to a file
		Path productsPath = Paths.get("products.txt");
		File productsFile = productsPath.toFile();
		
		PrintWriter out = new PrintWriter(
						  new BufferedWriter(
						  new FileWriter(productsFile,true)));
		
		// write data to the stream
		out.println("ang\tMurach's Angular\t69.50");
		
		// close the output stream
		out.close();
		
		// read a line from that file
		// open an input stream
		BufferedReader in = new BufferedReader(
							new FileReader(productsFile));
		
		// read data from the stream
		String line = in.readLine();
		while (line != null) {
			System.out.println("line from file = "+line);
			line = in.readLine();
		}
		in.close();
		

				
				
				
				
				
				
				
				
	}

}
