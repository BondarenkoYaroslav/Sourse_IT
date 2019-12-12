package MyListIteratorHW11;

import java.util.Arrays;
import java.util.Iterator;

public class DefaultMyList implements MyList, ListIterable {

	private Object[] list = null;
	private int arrSize = 1;
	private int indexObject;

	@Override
	public void add(Object e) {

		Object[] list2;

		int lastArrIndex = arrSize - 1;

		if (list != null) {

			list2 = new Object[arrSize];

			for (int i = 0; i < list.length; i++) {

				list2[i] = list[i];

			}

			list2[lastArrIndex] = e;
			list = list2;

			arrSize++;

		} else {

			list2 = new Object[arrSize];
			list2[lastArrIndex] = e;

			list = list2;

			arrSize++;
		}
	}

	public void clear() {

		list = new Object[arrSize];
	}

	@Override
	public boolean remove(Object o) {
		
		Object[] list2;
		
		Object objectToDelete = "noObjectO" + o;
		
		int indexToDelete = list.length;
		
		for (int i = (list.length - 1); i > 0; i--) {

			if (list[i].equals(o)) {
				
				objectToDelete = o;
				indexToDelete = i;
			}
		}
		
		if (objectToDelete.equals(o)) {
			
			list2 = list;
			
			for (int i = indexToDelete, j = indexToDelete; (i < list.length - 1);) {
				
				list[i++] = list2[++j];
			}
			
			list2 = new Object[(list.length - 1)];
			
			for (int i = 0; i < list2.length; i++) {
				
				list2[i] = list[i];
			}
			
			list = list2;
			
			return true;
		} else {
			
			return false;
		}
	}

	@Override
	public Object[] toArray() {

		Object[] arr;
		arr = list;
		Arrays.sort(arr);

		return arr;
	}

	@Override
	public int size() {

		return list.length;
	}

	@Override
	public boolean contains(Object o) {

		for (int i = 0; i < list.length; i++) {

			if (list[i].equals(o)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(MyList c) {

		Object[] arr1 = c.toArray();

		Object[] arr2;
		arr2 = list;
		Arrays.sort(arr2);

		for (int i = 0; i < arr1.length; i++) {

			if (!arr1[i].equals(arr2[i])) {
				return false;
			}
		}
		return true;
	}

	public String toString() {

		StringBuffer sb = new StringBuffer();
		sb.append('{');

		for (int i = 0; i < list.length; i++) {

			sb.append("[");
			sb.append(list[i]);
			sb.append("], ");

		}

		sb.delete(sb.length() - 2, sb.length());
		sb.append("}");

		return sb.toString();
	}

	public Iterator<Object> iterator() {

		return new IteratorImpl();
	}

	private class IteratorImpl implements Iterator<Object> {

		public boolean hasNext() {

			return (indexObject < list.length) ? true : false;
		}

		public Object next() {

			return list[indexObject++];

		}

		public void remove() {

			if ((indexObject > 0) && (indexObject < list.length)) {

				list[indexObject] = "DELETED";

			} else {
				throw new IllegalStateException();
			}

		}
	}

	public ListIterator listIterator() {

		return new ListIteratorImpl();
	}

	private class ListIteratorImpl extends IteratorImpl implements ListIterator {

		@Override
		public boolean hasPrevious() {

			return (indexObject > 0) ? true : false;
		}

		@Override
		public Object previous() {

			return list[--indexObject];
		}

		@Override
		public void set(Object e) {

			list[indexObject] = e;

		}

	}

}
