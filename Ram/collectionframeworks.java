package Ram;

import java.util.ArrayList;
import java.util.Iterator;

public class collectionframeworks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(2);
		alist.add(3);
		alist.add(5);
		alist.add(9);
		alist.add(3);
		alist.add(2);
		alist.add(4);
		System.out.println(alist);
		alist.add(100);
		System.out.println(alist);
		System.out.println(alist.get(5));
		
		alist.remove(2);
		System.out.println(alist);
		
		alist.set(3, 100);
		System.out.println(alist);
		
		for (int j:alist) {
		System.out.println(j);
		}
		
		ArrayList<String> slist = new ArrayList<>();
		slist.add("ram");
		slist.add("Hari");
		slist.add("kutty");
		slist.add("weds");
		slist.add("kumar");
		slist.add("ram");
		slist.add("msdd");
		slist.add("ram");
		slist.add("Hari");
		System.out.println(slist);
		
		ArrayList dlist = new ArrayList();
		dlist.add("captain");
		dlist.add(100);
		dlist.add('0');
		dlist.add(true);
		System.out.println(dlist);
		
		Iterator<Integer> e= alist.iterator();
		System.out.println("using iterator:");
		while (e.hasNext()) {
			System.out.println(e.next());
		}


	}
}
