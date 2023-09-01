package Ram;

// File handling by 5types => Create a new file ,Getting information of the file ,
// Write to a file ,Read to a file ,Delete a file...

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File myObj = new File ("C:\\java new\\fies.txt");
		if (myObj.createNewFile()) {
			System.out.println("File has been created ");
		} else {
			System.out.println("File was already Exits ");
		}
		}
		catch (Exception e) {
			System.out.println(" An error occur");
			e.printStackTrace();
		}
		File myObj = new File ("C:\\java new\\fies.txt");
		if (myObj.exists()) {
			System.out.println("File name: " + myObj.getName());
			System.out.println("Absolute Path:" +myObj.getAbsoluteFile());
			System.out.println("Writable:"+ myObj.canWrite());
			System.out.println("Readable:"+ myObj.canRead());
			System.out.println("File size in Bytes:"+ myObj.length());
		} else {
			System.out.println("FIle doesn't exits");
		}
		try {
			FileWriter myWriter = new FileWriter("c:\\java new\\fies.txt");
			myWriter.write("Java is most popular language of the millenium and it has several advantage for current generation");
			myWriter.close();
			System.out.println("successfully wrote to the file ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An error occur...!!!!!");
			e.printStackTrace();
		}
		try {
		File myObj = new File ("C:\\java new\\fies.txt");
		Scanner sc = new Scanner(myObj);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		}
		catch (Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		File myObj = new File ("C:\\java new\\fies.txt");
		if (myObj.delete()) {
			System.out.println("FIle was successfully deleted");
		} else {
			System.out.println("File doesn't deleted");
		}
	}
	
}	
		
	

