package HW4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¬ведите необходимые слова.");
		String text = scan.nextLine();
		String[] words = text.split(" ");
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList(words));
		int a = words.length;
		for (int i=0; i < a; i++) {
			if (wordList.get(i).length() > 3) 
			{
		System.out.printf(wordList.get(i) + " ");
   }
  }
 }
}