package Ram;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "Hello";
		
		if (str1==str2) {
			System.out.println("str1 is equal to str2");
		} else {
			System.out.println("str1 is not eqaul to str2 ");
		}
		String str3 = new String ("Hello");
		String str4 = new String ("Hello");
		if (str3== str4) {
			System.out.println("str3 is equal to str4");
		}else {
			System.out.println("str3 is not equal to str4");
		}

		
		if (str3.equals(str4)) {
			System.out.println("str3==str4");
		}else {
			System.out.println("str3 !=str4");
		}
		
		if(str3.compareTo(str4)==0)	{
			System.out.println("str3 == str4");
		}else {
			System.out.println("str3 != str4");
		}
		String str = "Haritha ,Ram,shree,Deve";
		int len=str.length();
		System.out.println("Length of str is:"+ len);
		System.out.println(str.charAt(0)+"!"+str.charAt(len-1));
		String s1=str.toUpperCase();
		System.out.println("str after upper case is:"+str.toUpperCase());
		
        if(str.contains("RAM")) {
        	System.out.println("RAMKUMAR is in str content");
        } else {
        	System.out.println("There is no other word like that");
        }
        String s2= str.substring(8);
        System.out.println("s2 is :"+s2);
        
        String s3= str.substring(4, 5);
        System.out.println("s3 is:"+s3);
        
        String s4= str.replace('o', 'a');
        System.out.println("s4 is:"+s4);
        
        String strng= new String("Good");
        strng.concat("Evening");
        System.out.println("Strng concat is:"+ strng);
        
        StringBuffer buffer=new StringBuffer("Good");
        buffer.append("Evening");   // thread safe
        System.out.println("Buffered string is:"+buffer);
        
        StringBuilder builder=new StringBuilder("Good");
        builder.append("Night");  // Not thread safe
        System.out.println("String Builder is:"+ builder);
        
	}

}
