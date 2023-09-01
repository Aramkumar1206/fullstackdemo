package Ram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// set=> Set is used to store only unique elements  or in other words is done not allow duplicates or reduncy
public class Seteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet <String> h= new HashSet<>();
//		LinkedHashSet <String> h = new LinkedHashSet <>();
		TreeSet <String> h = new TreeSet <>();
		h.add("Ram");
		h.add("Hari");
		h.add("Wed");
		h.add("Marr");
		h.add("Ram");
		h.add("TOur");
        
		System.out.println(h);
	}

}
