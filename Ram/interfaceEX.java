package Ram;

interface Paymeth{
	void meth(int acctnum1);
	default void payable() {
		System.out.println("Welcome");
	}
}
interface PswdVerify{
	void verify(int pin);
	
}
class ATM2 implements PswdVerify ,Paymeth{

	@Override
	public void meth(int acctnum1) {
		// TODO Auto-generated method stub
		if(acctnum1==012345) {
			System.out.println("Your Account Number is:"+ acctnum1);
		}else {
			System.out.println("Wrong Account Number");
		}
		
	}

	@Override
	public void verify(int pin) {
		// TODO Auto-generated method stub
		if(pin == 12345) {
			System.out.println("Your Pin Number is:" +pin);
		}else {
			System.out.println("Wrong Pin Number");
		}
		
	}}
public class interfaceEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM2 atm2 = new ATM2();
		atm2.meth(012345);
		atm2.verify(12345);

	}

}
