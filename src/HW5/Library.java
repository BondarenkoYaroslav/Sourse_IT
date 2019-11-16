package HW5;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String tob1 = "Твердый переплет."; // Type of binding
		String tob2 = "Мягкий переплет."; // Type of binding

		String Rudazov = "Александр Валентинович Рудазов";
		String Sillov = "Дмитрий Олегович Силлов";
		String King = "Стивен Кинг";

		ArrayList<String> id = new ArrayList<>();
		id.add("id0, Архимаг, " + Rudazov + ", Альфа-книга, 2004 г., 387 с., 50 грн., " + tob1);
		id.add("id1, Рыцари Причистой Девы, " + Rudazov + ", Альфа-книга, 2005 г., 448 с., 55 грн., " + tob1);
		id.add("id2, Самое лучшее оружие, " + Rudazov + ", Альфа-книга, 2005 г., 427 с., 55 грн., " + tob1);
		id.add("id3, Тень якудзы, " + Sillov + ", АСТ, 2011 г., 346 с., 100 грн., " + tob1);
		id.add("id4, Ученик якудзы, " + Sillov + ", Астрель, 2011 г., 352 с., 130 грн., " + tob1);
		id.add("id5, Путь якудзы, " + Sillov + ", Астрель, 2012 г., 352 с., 60 грн., " + tob1);
		id.add("id6, 999. Имя зверя, " + King + ", АСТ, 2000 г., 384 с., 150 грн., " + tob1);
		id.add("id7, Холод Страха, " + King + ", АСТ, 2000 г., 259 с., 80 грн., " + tob1);
		id.add("id8, Дети Эдгара По, " + King + ", Эксмо, 2013 г., 624 с., 184 грн., " + tob1);

		System.out.println("Введите имя автора, издательство или год издания: ");
		String search = scan.nextLine();

		for (int i = 0; i < id.size(); i++) {
			if (id.get(i).contains(search)) {
				System.out.println(id.get(i));
			}
		}
		System.out.println("");
		System.out.println("Работа программы завершена.");
	}
}
