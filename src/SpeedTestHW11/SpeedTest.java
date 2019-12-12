//Добавление 100 элементов начиная с индекса 0 в ArrayList занимает 368 миллисекунд.
//Добавление 10000 элементов начиная с индекса 0 в ArrayList занимает 3839 миллисекунд.
//Добавление 100 элементов начиная с индекса 500000 в ArrayList занимает 12 миллисекунд.
//Добавление 10000 элементов начиная с индекса 500000 в ArrayList занимает 695 миллисекунд.
//Добавление 100 элементов начиная с индекса 1000000 в ArrayList занимает 0 миллисекунд.
//Добавление 10000 элементов начиная с индекса 1000000 в ArrayList занимает 4 миллисекунд.
//Добавление 100 элементов начиная с индекса 0 в LinkedList занимает 0 миллисекунд.
//Добавление 10000 элементов начиная с индекса 0 в LinkedList занимает 1 миллисекунд.
//Добавление 100 элементов начиная с индекса 500000 в LinkedList занимает 135 миллисекунд.
//Добавление 10000 элементов начиная с индекса 500000 в LinkedList занимает 11157 миллисекунд.
//Добавление 100 элементов начиная с индекса 1000000 в LinkedList занимает 0 миллисекунд.
//Добавление 10000 элементов начиная с индекса 1000000 в LinkedList занимает 74 миллисекунд.
//Удаление 100 элементов по индексу 0 в ArrayList занимает 115 миллисекунд.
//Удаление 10000 элементов по индексу 0 в ArrayList занимает 8001 миллисекунд.
//Удаление 100 элементов по индексу 500000 в ArrayList занимает 7 миллисекунд.
//Удаление 10000 элементов по индексу 500000 в ArrayList занимает 731 миллисекунд.
//Удаление 100 элементов по индексу 1000000 в ArrayList занимает 0 миллисекунд.
//Удаление 10000 элементов по индексу 1000000 в ArrayList занимает 1 миллисекунд.
//Удаление 100 элементов по индексу 0 в LinkedList занимает 0 миллисекунд.
//Удаление 10000 элементов по индексу 0 в LinkedList занимает 1 миллисекунд.
//Удаление 100 элементов по индексу 500000 в LinkedList занимает 124 миллисекунд.
//Удаление 10000 элементов по индексу 500000 в LinkedList занимает 10931 миллисекунд.
//Удаление 100 элементов по индексу 1000000 в LinkedList занимает 1 миллисекунд.
//Удаление 10000 элементов по индексу 1000000 в LinkedList занимает 1 миллисекунд.


package SpeedTestHW11;

import java.util.ArrayList;
import java.util.LinkedList;

public class SpeedTest {

	public static void main(String[] args) {

		System.out.println(ArrayListInsert(0, 100));
		System.out.println(ArrayListInsert(0, 10_000));
//		System.out.println(ArrayListInsert(0, 1_000_000));
		System.out.println(ArrayListInsert(500_000, 100));
		System.out.println(ArrayListInsert(500_000, 10_000));
//		System.out.println(ArrayListInsert(500_000, 1_000_000));
		System.out.println(ArrayListInsert(1_000_000, 100));
		System.out.println(ArrayListInsert(1_000_000, 10_000));
//		System.out.println(ArrayListInsert(1_000_000, 1_000_000));
		
		System.out.println(LinkedListInsert(0, 100));
		System.out.println(LinkedListInsert(0, 10_000));
//		System.out.println(LinkedListInsert(0, 1_000_000));
		System.out.println(LinkedListInsert(500_000, 100));
		System.out.println(LinkedListInsert(500_000, 10_000));
//		System.out.println(LinkedListInsert(500_000, 1_000_000));
		System.out.println(LinkedListInsert(1_000_000, 100));
		System.out.println(LinkedListInsert(1_000_000, 10_000));
//		System.out.println(LinkedListInsert(1_000_000, 1_000_000));
		
		System.out.println(ArrayListDelete(0, 100));
		System.out.println(ArrayListDelete(0, 10_000));
//		System.out.println(ArrayListDelete(0, 1_000_000));
		System.out.println(ArrayListDelete(500_000, 100));
		System.out.println(ArrayListDelete(500_000, 10_000));
//		System.out.println(ArrayListDelete(500_000, 1_000_000));
		System.out.println(ArrayListDelete(1_000_000, 100));
		System.out.println(ArrayListDelete(1_000_000, 10_000));
//		System.out.println(ArrayListDelete(1_000_000, 1_000_000));

		System.out.println(LinkedListDelete(0, 100));
		System.out.println(LinkedListDelete(0, 10_000));
//		System.out.println(LinkedListDelete(0, 1_000_000));
		System.out.println(LinkedListDelete(500_000, 100));
		System.out.println(LinkedListDelete(500_000, 10_000));
//		System.out.println(LinkedListDelete(500_000, 1_000_000));
		System.out.println(LinkedListDelete(1_000_000, 100));
		System.out.println(LinkedListDelete(1_000_000, 10_000));
//		System.out.println(LinkedListDelete(1_000_000, 1_000_000));
	}

	public static String ArrayListInsert(int numberOfBeginToInsert, int numberOfItemsToInsert) {

		ArrayList<String> arrList = new ArrayList<>();
		
		for (int i = 0; i < 1_000_000; i++) {
			arrList.add(i, "Private");
		}
		
		long mill = System.currentTimeMillis();

		for (int i = 0; i < numberOfItemsToInsert; i++) {

			arrList.add(numberOfBeginToInsert, "Pablic");
		}

		long delta = System.currentTimeMillis() - mill;

		return "Добавление " + numberOfItemsToInsert + " элементов начиная с индекса " + numberOfBeginToInsert + " в ArrayList занимает "
				+ delta + " миллисекунд.";

	}
	
	public static String LinkedListInsert(int numberOfBeginToInsert, int numberOfItemsToInsert) {
		
		LinkedList<String> linkList = new LinkedList<String>();
			
		for (int i = 0; i < 1_000_000; i++) {
			linkList.add(i, "Private");
		}
		
		long mill = System.currentTimeMillis();

		for (int i = 0; i < numberOfItemsToInsert; i++) {

			linkList.add(numberOfBeginToInsert, "Pablic");
		}

		long delta = System.currentTimeMillis() - mill;

		return "Добавление " + numberOfItemsToInsert + " элементов начиная с индекса " + numberOfBeginToInsert + " в LinkedList занимает "
				+ delta + " миллисекунд.";
	}

	public static String ArrayListDelete(int numberOfBeginToDelete, int numberOfItemsToDelete) {

		ArrayList<String> arrList = new ArrayList<>();
		
		for (int i = 0; i < 1_000_000; i++) {
			arrList.add(i, "Private");
		}
		
		long mill = System.currentTimeMillis();

		int elementDelete = numberOfBeginToDelete;
		
		for (int i = 0; i < numberOfItemsToDelete; i++) {

			if (numberOfBeginToDelete <= 500_000) {
			arrList.remove(elementDelete); 
			} else {
				arrList.remove(--elementDelete); 
			}
		}

		long delta = System.currentTimeMillis() - mill;

		return "Удаление " + numberOfItemsToDelete + " элементов по индексу " + numberOfBeginToDelete + " в ArrayList занимает "
				+ delta + " миллисекунд.";

	}
	
	public static String LinkedListDelete(int numberOfBeginToDelete, int numberOfItemsToDelete) {

		LinkedList<String> linkList = new LinkedList<String>();
		
		for (int i = 0; i < 1_000_000; i++) {
			linkList.add(i, "Private");
		}
		
		long mill = System.currentTimeMillis();

		int elementDelete = numberOfBeginToDelete;
		
		for (int i = 0; i < numberOfItemsToDelete; i++) {

			if (numberOfBeginToDelete <= 500_000) {
				linkList.remove(elementDelete); 
			} else {
				linkList.remove(--elementDelete); 
			}
		}

		long delta = System.currentTimeMillis() - mill;

		return "Удаление " + numberOfItemsToDelete + " элементов по индексу " + numberOfBeginToDelete + " в LinkedList занимает "
				+ delta + " миллисекунд.";

	}
}
