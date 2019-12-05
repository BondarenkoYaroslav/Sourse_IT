package HW11;

public class Demo {

	public static void main(String[] args) {

		DefaultMyList list = new DefaultMyList();

		// add() реализация
		list.add(1);
		list.add(2);
		list.add("Hello");
		list.add("World");

		System.out.println("Колличество эллементов: " + list.size());
		// add() реализован

		// clear() реализация
		list.clear();

		System.out.println("Колличество эллементов после очистки содержимого: " + list.size());
		// clear() реализован

		// add()
		list.add(123);
		list.add("Bring");
		list.add("The");
		list.add("New");
		list.add("World");

		System.out.println("Колличество эллементов: " + list.size());
		// add()

		// remove() реализация
		list.remove(123);

		System.out.println("Колличество эллементов после удаления объекта 123 : " + list.size());
		// remove() реализован

		// toArray() реализация
		Object[] sortListToArray = list.toArray();

		for (int i = 0; i < list.size(); i++) {

			System.out.println("Значение объекта с индексом " + i + " после сортировки: " + sortListToArray[i]);
		}
		// toArray() реализован

		// size() реализация
		System.out.println("Размер листа объектов: " + list.size());
		// size() реализован

		// contains() реализация
		System.out.println(list.contains("World"));
		// contains() реализован

		// containsAll() реализация
		DefaultMyList specifiedList = new DefaultMyList();

		specifiedList.add("Bring");
		specifiedList.add("The");
		specifiedList.add("New");
		specifiedList.add("World");

		System.out.println(list.containsAll(specifiedList));
		// containsAll() реализован
		
		// toString() реализация
		System.out.println(list.toString());
		// toString реализован

	}

}
