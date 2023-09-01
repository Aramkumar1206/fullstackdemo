package Ram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionalhandling {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int a=5,b=0,c=0;   //initialize
		try {    //Handled Exception,Unchecked Exception,compile-time Exception
			c=a/b;
		}
		catch(Exception e) {
			System.out.println("An error occurred while performing a/b");
		}
		finally {
			System.out.println("This message prints on no matter what");
		}
        System.out.println(c);
        
        System.out.println("Welcome to Greens..!!!");
        System.out.println("How are you all..!!!");
        
//        try {
//			FileInputStream file = new FileInputStream ("abc.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.err.println("An error Occurred WHile accessing the file");
//			e.printStackTrace();
//		}finally {
//			System.out.println(" Error 404 Not found");
//		}
        
        FileInputStream file = new FileInputStream ("abc.txt");
        
        System.out.println("End of session");
	}

}
