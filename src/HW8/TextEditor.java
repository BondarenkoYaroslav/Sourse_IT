package HW8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextEditor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Введите путь конечной дирректории: ");
		String directoryPath = scan.nextLine();

		File dir1 = new File("D://javaTextEditor//" + directoryPath);

		// Создание/проверка директории.
		if (dir1.exists() && true) {
			System.out.println("Указанная директория уже существует: " + dir1);
		} else {
			dir1.mkdirs();
			System.out.println("Создана новая директория: " + dir1);
		}
		;

		System.out.println("Введите имя текстового файла: ");
		String nameFile = scan.nextLine();

		File file1 = new File(dir1, nameFile + ".txt");

		// Создание/проверка текствого файла.
		if (file1.exists() && true) {
			System.out.println("Указанный файл уже существует: " + file1.getName());
		} else {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Создан новый файл: " + file1.getName());
		}
		;

		System.out.println("Запишите текст в файл. Для выхода введите EXIT.");
		String tryExit = scan.nextLine();
		String myText = "";

		// Цикл для создания строки форматированного текста, который будет записан в
		// файл + проверка на EXIT.

		for (int i = 100; i > 0; i++) {
			if (tryExit.equalsIgnoreCase("exit")) {
				i = -1;
			} else {
				myText += tryExit + "\n";
				tryExit = scan.nextLine();
			}
		}
		scan.close();

		// Запись текста в файл.

		FileWriter writer;

		try {
			writer = new FileWriter(file1);
			writer.write(myText);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Считывание файла

		Path filePath = Paths.get(file1.toURI());

		try {
			// Вывод текста на экран.
			String textFromFile = Files.readString(filePath);

			System.out.println(textFromFile);

			// Подсчет колличества символов
			System.out.println("В текстовом документе " + file1.getName() + " содержиться символов: "
					+ textFromFile.length() + ".");

			// Разбивка на строки, проверка на колличество гласных
			String[] linesFromFile = textFromFile.split("\n");

			Pattern vocals = Pattern.compile("(?iu)[аоуеиіауоыиэяюёеaeiou]");
			int[] maxVocals = new int[linesFromFile.length];

			for (int i = 0; i < linesFromFile.length; i++) {
				Matcher m = vocals.matcher(linesFromFile[i]);
				int vocalCounter = 0;
				while (m.find()) {
					vocalCounter++;
				}
				System.out.println("В строке " + (i + 1) + " имеется " + vocalCounter + " гласных букв.");
				maxVocals[i] = vocalCounter;
			}

			OptionalInt max = Arrays.stream(maxVocals).max();

			int numberLine = 0;
			for (int i = 0; i < linesFromFile.length; i++) {
				if (max.getAsInt() == maxVocals[i]) {
					numberLine = (i + 1);
				}
			}

			System.out.println(
					"В строке " + numberLine + " максимальное колличество гласных: " + max.getAsInt() + " шт.");

			// Узнаем колличество слов в текстовом файле.
			int sumWord = 0;
			for (int i = 0; i < textFromFile.length(); i++) {
				if (textFromFile.charAt(i) == ' ' || textFromFile.charAt(i) == '\n') {
					sumWord++;
				}
			}

			System.out.println("Вы ввели " + sumWord + " слов");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
