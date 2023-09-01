package Ram;
// class to class => extends
// class to interface=> implements
// interface to class => implements
// interface to interface =>extends

class A {      //parent class
	void display() {
		System.out.println("Message A");
		
	}
}
class B extends A{     // child class
	void meth() {
		System.out.println("Message B");
	}
}
class C extends B{     //   parent B child c
	void disc() {
		System.out.println("Message C");
	}
}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a= new A();  //object creation
		//a.display();   //object calling
		//B b= new B();
		//b.meth();
		//b.display();
	    C c=new C();
	    c.display();
	    c.meth();
	    c.disc();
	  
	    
	    

	}

}
