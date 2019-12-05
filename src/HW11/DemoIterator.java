package HW11;

import java.util.Iterator;

public class DemoIterator {

	public static void main(String[] args) {

		DefaultMyList con = new DefaultMyList();

		for (Object o : con) {
			System.out.println(o);
		}

		Iterator<Object> it = con.iterator();

		con.add("Халк");
		con.add("Крушить");
		con.add("Пятница");
		con.add("Бухать");

		while (it.hasNext())
			System.out.println(it.next());

	}
}