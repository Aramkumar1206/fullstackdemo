package Ram;
// if else & Switch statement= slection statement
import java.util.*;
public class switchclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First Number");
		a=scanner.nextInt();
		System.out.println("Enter Second Number");
		b=scanner.nextInt();
		char operator;
		System.out.println("Enter the operator from +,-,*,/,%:");
		operator=scanner.next().charAt(0);
		switch(operator) {  //if (operator== '+')
		case'+':
			System.out.println(a + "+"+b +"="+(a+b));
			break;
		case'-':
			System.out.println(a + "-"+b +"="+(a-b));
			break;
		case'*':
			System.out.println(a + "*"+b +"="+(a*b));
			break;
		case'/':
			System.out.println(a + "/"+b +"="+(a/b));
			break;
		case'%':
			System.out.println(a + "%"+b +"="+(a%b));
			break;
			default:
				System.out.println("You have entered a  wrong button/wrong operator");
		}
		

	}

}
