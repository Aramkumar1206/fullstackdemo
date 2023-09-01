package Ram;

class Product {
	void display() {
		System.out.println("Today's Sale: 50% off");
	}
	
}
class  ProductDay2 extends Product {
	void display() {   // method overriding
		System.out.println("Tommorrow's Sale: 65% off ");
		super.display();
	}
}

public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDay2 pro= new ProductDay2();
		pro.display();
		
		

	}

}
