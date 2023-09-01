package Ram;

abstract class Abstract {
	abstract void display(int acctnum);
	void msg() {
		System.out.println("Welcome");
	}
}
class ATM extends Abstract {
	void display (int acctnum) {
		if(acctnum==1234567) {
			System.out.println("Successfully Login");
		} else {
			System.out.println("Login Failed");
		}
	}
}
public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm=new ATM();
		atm.msg();
		atm.display(1234567);

	}

}
