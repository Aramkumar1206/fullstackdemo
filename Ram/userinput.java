package Ram;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your Name?");
		String name = scanner.nextLine();
		System.out.println("What is your Age");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter your Email");
		String email = scanner.nextLine();
		System.out.println("Hello " + name);
		System.out.println("My age is " + age);
		System.out.println("Your Email is " + email);
		

	}

}
