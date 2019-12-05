package HW11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class DefaultMyList implements MyList, ListIterable {

	List<Object> list = new ArrayList<Object>();
	Iterator<Object> it = list.iterator();

	public void add(Object e) {

		list.add(list.size(), e);

	}

	public void clear() {

		list.clear();

	}

	public boolean remove(Object o) {

		list.remove(o);

		return true;

	}

	public Object[] toArray() {

		Object[] listToArray = new Object[list.size()];

		listToArray = list.toArray();

		Arrays.sort(listToArray);

		return listToArray;

	}

	public int size() {

		return list.size();
	}

	public boolean contains(Object o) {

		return list.contains(o);
	}

	public boolean containsAll(MyList c) {

		Object[] listToArrayForContainsAll = new Object[c.size()];

		listToArrayForContainsAll = c.toArray();

		for (int i = 0; i < c.size(); i++) {
			if (!list.contains(listToArrayForContainsAll[i])) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {

		Object[] listToArray = new Object[list.size()];

		listToArray = list.toArray();

		StringBuffer sb = new StringBuffer();

		sb.append('{');

		final int END_OF_LIST_SIZE = list.size() - 1;

		for (int i = 0; i < list.size(); i++) {

			sb.append("[");

			sb.append(listToArray[i]);

			if (i == END_OF_LIST_SIZE) {
				sb.append("]");
			} else {
				sb.append("], ");
			}

		}
		sb.append("}");

		return sb.toString();
	}

	public Iterator<Object> iterator() {
		return new IteratorImpl();
	}

	private class IteratorImpl implements Iterator<Object> {

		public boolean hasNext() {
			return it.hasNext();
		}

		public Object next() {

			while (it.hasNext()) {
				System.out.println(it.next());
			}

			throw new NoSuchElementException();

		}

		public void remove() {

			it.remove();

		}

	}

	@Override
	public ListIterator<Object> listIterator() {
		return new ListIteratorImpl();
	}

	private class ListIteratorImpl extends IteratorImpl implements ListIterator<Object> {	
		
		@Override
		public boolean hasPrevious() {

			return ((ListIterator<Object>) it).hasPrevious();
		}

		@Override
		public Object previous() {

			while (((ListIterator<Object>) it).hasPrevious()) {
				return ((ListIterator<Object>) it).previous();
			}
			return it;
		}

		@Override
		public int nextIndex() {

			return ((ListIterator<Object>) it).nextIndex();
		}

		@Override
		public int previousIndex() {

			return ((ListIterator<Object>) it).previousIndex();
		}

		@Override
		public void set(Object e) {
			
		((ListIterator<Object>) it).set(e);

		}

		@Override
		public void add(Object e) {
			
			((DefaultMyList) it).add(e);

		}
	}
}