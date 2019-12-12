package MyListIteratorHW11;

import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {

		DefaultMyList testList = new DefaultMyList();

										// first method void add(Object e);
		testList.add("Каждый");
		testList.add("Охотник");
		testList.add("Желает");
		testList.add("Знать");
		testList.add("Где");
		testList.add("Сидит");
		testList.add("Фазан");

										// second method void clear();
//		testList.clear();

										// third method boolean remove(Object o);
		testList.remove("Волки");

										// fourth method Object[] toArray();
		Object[] testToArray = testList.toArray();

		for (int i = 0; testToArray.length > i; i++) {

			System.out.println(testToArray[i]);
		}

										// fifth method int size();
		System.out.println(testList.size());

										// sixth method boolean contains(Object o);
		System.out.println(testList.contains("Где"));

										// seventh method boolean containsAll(MyList c);
		MyList testList2 = new DefaultMyList();

		testList2.add("Каждый");
		testList2.add("Охотник");
		testList2.add("Желает");
		testList2.add("Знать");
		testList2.add("Где");
		testList2.add("Сидит");
		testList2.add("Фазан");

		System.out.println(testList.containsAll(testList2));

										// eighth method public String toString();
		System.out.println(testList.toString());

										//Iterator
		DefaultMyList con = new DefaultMyList();

		con.add("One");
		con.add("None");
		con.add("Gone");
		con.add("Tonne");
		con.add("Zone");

		for (Object o : con) {
			System.out.println(o);
		}

		Iterator<Object> it = con.iterator();

		while (it.hasNext())
			System.out.println(it.next());

		while (con.listIterator().hasPrevious())
			System.out.println(con.listIterator().previous());

	}

}
