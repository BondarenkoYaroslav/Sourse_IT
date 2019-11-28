package HW8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.Scanner;

public class FileFinder {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите адрес директории начала поиска: ");
		String searchDir = scan.nextLine();
		System.out.println("Введите ключевое слово поиска в наименовании файла: ");
		String searchWord = scan.nextLine();
		System.out.println("Задайте колличество вложенных каталогов для поиска (глубина поиска): ");
		int searchDepth = scan.nextInt();
		
		scan.close();
		
		
		Path testPath = Paths.get(searchDir);
        Stream<Path> stream;
		try {
			stream = Files.find(testPath, searchDepth,
			        (path, basicFileAttributes) -> {
			            File file = path.toFile();
			            return !file.isDirectory() &&
			                    file.getName().contains(searchWord);
			            
			        });
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
        
	}
}

