package NewHW5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {
	public static void main(String[] args) {

		int id = 1; // первый id.

// Порядок ввода данных: (int id, String name, String autor, String publishing, int year, int numberOfPages, int prise, String bildingType)

		List<BooksConstructor> books = new ArrayList<>();
		books.add(
				new BooksConstructor(id++, "Оно", "Стивен Кинг", "Viking Press", 1986, 1248, 479, "Твердый переплет"));
		books.add(new BooksConstructor(id++, "Кладбище домашних животных", "Стивен Кинг", "Doubleday", 1983, 480, 249,
				"Твердый переплет"));
		books.add(new BooksConstructor(id++, "Доктор сон", "Стивен Кинг", "Charles Scribner's Sons", 2013, 640, 230,
				"Твердый переплет"));
		books.add(new BooksConstructor(id++, "Три глаза и шесть рук", "Александр Валентинович Рудазов", "Альфа-книга",
				2004, 398, 90, "Твердый переплет"));
		books.add(new BooksConstructor(id++, "Шестирукий резидент", "Александр Валентинович Рудазов", "Альфа-книга",
				2005, 367, 85, "Твердый переплет"));
		books.add(new BooksConstructor(id++, "Демоны в Ватикане", "Александр Валентинович Рудазов", "Альфа-книга", 2008,
				508, 110, "Твердый переплет"));
		books.add(new BooksConstructor(id++, "Сын архидемона", "Александр Валентинович Рудазов", "Альфа-книга", 2011,
				240, 60, "Твердый переплет"));

		books.forEach(System.out::println);
		System.out.println();

		Scanner scan = new Scanner(System.in);
		System.out.println("Введите имя автора, издание или год, начиная с которого будет выведен список книг.");
		String search = scan.nextLine();
		scan.close();
		
		try
	    {
			int yearNew = Integer.parseInt(search);
			for (int i = 0; i < books.size(); i++) {

				if (yearNew <= books.get(i).getYear()) {
					System.out.println(books.get(i).toString());
				}	
			}
	    }
	    catch (NumberFormatException nfe)
	    {
	    	for (int i = 0; i < books.size(); i++) {

				if ((books.get(i).toString()).contains(search)) {
					System.out.println(books.get(i).toString());
				}
	    	}		
	    }
	}
}