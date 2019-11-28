package HW8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountingLetters {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		System.out.println("Введите путь к файлу: ");
		
		String search = scan.nextLine();
		File file1 = new File(search);
		Path filePath = Paths.get(file1.toURI());
		String textFile = Files.readString(filePath);

		scan.close();

		char[] letters = { 'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
				'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я' };

		int[] arrcnt = new int[letters.length];

		for (int i = 0; i < letters.length; i++) {

			int cnt = 0;
			for (int k = 0; k < textFile.length(); k++) {
				if (textFile.toLowerCase().charAt(k) == letters[i])
					cnt++;
			}

			arrcnt[i] = cnt;

		}

		int maxCnt = arrcnt[0];
		for (int i = 0; i < arrcnt.length; i++) {
			maxCnt = Math.max(maxCnt, arrcnt[i]);
		}

		for (int i = 0; i <= maxCnt; i++) {
			for (int j = 0; j < letters.length; j++) {
				if (arrcnt[j] == i) {

					System.out.println("Буква - " + letters[j] + " - встречается в тексте - " + arrcnt[j] + " - раз.");
				}
			}
		}

	}
}
