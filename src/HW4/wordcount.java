package HW4;

import java.util.Scanner;

public class wordcount {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Введите слова, через пробел. ");
		System.out.println("");
		String text = scan.nextLine();
		
		int a = 20;
		while(a > 0) 
		{
			String replace = text.replace("  ", " ");
			text=replace;
			a--;
		}
		
		int words = 1;
		
		for (char c : text.toCharArray())
		{
			if (c == ' ') {
					words++;
			}
		}
		System.out.println("");
		System.out.println("В вашем тексте присутствует " + words + " слов.");
	}

}
