package Ram;

class Product{
	void display() {
		System.out.println("Today's Sale: 50% off");
	}
	
}
class ProductDay2 extends Product{
	void display() {   // method overidding
		System.out.println("Tommorrow's Sale: 65% off ");
		super.display();
	}
}
class Offer extends Product{
	void display() {
		System.out.println("Yesterday discount: 40% Off");
		super.display();
	}
}

public class methodoverloading {

	public static void main(String[] args) {
		ProductDay2 pro= new ProductDay2();
		Offer off=new Offer();
		pro.display();
		off.display();
		
		
		

	}

}
