package Ram;
import java.util.*;

public class ifelse {
	public static void main(String[] args) {
		/*int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		num=scanner.nextInt();
		
		if (num>0) {
			System.out.println(num + "is a positive number..!!!");
		}else if(num==0) {      // else if ladder statement
				System.out.println(num + "is a neutral number..!!!");
			}else {
			System.out.println(num + "is a negative number..!!!");
			} */
		
		int marks;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the marks from 0 to 100");
		marks= scanner.nextInt();
		if (marks >=90)
			System.out.println("Grade A");
		else if (marks >=80)
			System.out.println("Grade B");
		else if (marks >=70)
			System.out.println("Grade C");
		else if (marks>=60)
			System.out.println("Grade D");
		else 
			System.out.println("Grade E");
			
			
		}
		
	}


