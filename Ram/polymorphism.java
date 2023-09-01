package Ram;

class Flipkart {
	void main (String Denim) {
		System.out.println(Denim);
	}
}
class Sizes extends Flipkart {
	void main (String Denim,String Size,String Color) {   // Method overloading
		System.out.println(Denim + "-" + Size +"-"+Color);
	}
}

public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Flipkart flip=new Flipkart();
		//flip.main("Levis");
		Sizes size= new Sizes();
		size.main("Wranglar", "36", "Blue");
	}

}
