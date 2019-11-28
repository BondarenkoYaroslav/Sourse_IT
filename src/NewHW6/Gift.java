package NewHW6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Gift {

	public static void main(String[] args) {

		List<ConstructorGift> candies = new ArrayList<>();

		candies.add(new ConstructorGift("Ромашка", "Шоколадная конфета", 15, 10));
		candies.add(new ConstructorGift("Букашка", "Шоколадная конфета", 20, 15));
		candies.add(new ConstructorGift("Няшка", "Шоколадная конфета", 25, 18));
		candies.add(new ConstructorGift("Чупа-чупс", "Леденец", 5, 4));
		candies.add(new ConstructorGift("Хигйджайя", "Леденец", 10, 8));
		candies.add(new ConstructorGift("Нондес", "Леденец", 15, 12));
		candies.add(new ConstructorGift("Пазузу", "Карамель", 5, 3));
		candies.add(new ConstructorGift("Ктулху", "Карамель", 10, 6));
		candies.add(new ConstructorGift("Кутулу", "Карамель", 7, 6));
		candies.add(new ConstructorGift("Милка", "Шоколадка", 100, 53));
		candies.add(new ConstructorGift("Корона", "Шоколадка", 100, 67));
		candies.add(new ConstructorGift("Аленка", "Шоколадка", 100, 44));

		System.out.println("Детский подарок состоит из: ");
		candies.forEach(System.out::println);

		int giftWeight = 0; // Определяем вес подарка

		for (int i = 0; i < candies.size(); i++) {
			giftWeight += candies.get(i).getWeight();

			if (i == (candies.size()) - 1) {
				System.out.println("Вес подарка составляет " + giftWeight + " грамм.");
			}
		}

		System.out.println("Задайте параметр сортировки Имя, Тип, Вес или Сахар.");
		Scanner scan = new Scanner(System.in);
		String sortOption = scan.nextLine();

		String[] textSortArr = new String[candies.size()];
		int[] numberSortArr = new int[candies.size()];

		for (int i = 0; i < candies.size(); i++) {

			if (sortOption.equalsIgnoreCase("Имя")) {
				textSortArr[i] = candies.get(i).getName();
			} else if (sortOption.equalsIgnoreCase("Тип")) {
				textSortArr[i] = candies.get(i).getType();
			} else if (sortOption.equalsIgnoreCase("Вес")) {
				numberSortArr[i] = candies.get(i).getWeight();
			} else if (sortOption.equalsIgnoreCase("Сахар")) {
				numberSortArr[i] = candies.get(i).getAmountOfSugar();
			} else if (i == 0) {
				System.out.println("Введено false значение.");
			}
		}

		if (sortOption.equalsIgnoreCase("Имя") || sortOption.equalsIgnoreCase("Тип")) {
			Arrays.parallelSort(textSortArr);
			System.out.println(Arrays.deepToString(textSortArr));
		} else if (sortOption.equalsIgnoreCase("Вес") || sortOption.equalsIgnoreCase("Сахар")) {
			Arrays.sort(numberSortArr);
			System.out.println(Arrays.toString(numberSortArr));
		} else {
			System.out.println("___________________");
		}
		System.out.println("Введите минимальное значение диапазона сахара для поиска конфет: ");
		int minAmountOfSugar = scan.nextInt();
		System.out.println("Введите максимальное значение диапазона сахара для поиска конфет: ");
		int maxAmountOfSugar = scan.nextInt();
		scan.close();
		
		System.out.println("Подходящие конфеты для диапазона сахара со значением " + minAmountOfSugar + " - " + maxAmountOfSugar + " грамм: ");
		
		for (int i = 0; i < candies.size(); i++) {
			if (maxAmountOfSugar >= candies.get(i).getAmountOfSugar()) {
				if (candies.get(i).getAmountOfSugar() >= minAmountOfSugar) 
				{
				System.out.println(candies.get(i).toString()); 
				}
			}
		}
		System.out.println("Работа программы завершена.");
	}
}