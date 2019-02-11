package advance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;

public class CollectionAPI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	//	setExample();

		// Set
		// list
		// map

	//	Arraylistexample();

		// key - value
		// key - unique
		 hashmapexample();

//		setExample();

		System.out.println();

	}

	private static void Arraylistexample() {
		int x[] = new int[5];

		ArrayList<Object> list = new ArrayList<Object>();
		list.add("USA"); // 0
		list.add("UK");// 1
		list.add("Australia");// 2
		list.add("Australia");// 2
		list.add(100);// 2
		// list.add(1000);

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	private static void setExample() {
		Set<String> myset = new TreeSet<String>();

		myset.add("hello");
		myset.add("hello");
		myset.add("hello");
		myset.add("new hello");

		Iterator<String> i = myset.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

	private static void hashmapexample() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();

		map.put("Name", "kartik");
		map.put("address", "dallas");
		map.put("phone", "45648974");
		map.put("Name", "sudheer");
		map.put("applicantaddress", "dallas");
		map.put("applicantphone", 45648974);
		System.out.println(map.get("name"));

		Set<String> keys = map.keySet();

		for (String s : keys) {
			System.out.println(s+ " >> " +map.get(s));

		}
	}

}
