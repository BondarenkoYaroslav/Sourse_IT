package SpeedTestHW;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpeedTestHW {

	public static void main(String[] args) {
		
		System.out.println(ArrayList100()); 				// 16
		
		System.out.println(ArrayList10000()); 				// 78
		
		System.out.println(ArrayList1000000()); 			// 4499
		
		System.out.println(LinkedList100()); 				// 12
		
		System.out.println(LinkedList10000()); 				// 33
		
		System.out.println(LinkedList1000000()); 			// 4759

	}

	public static String RandomWord() {

		byte startOfRandomNumberRange = 0;
		byte endOfRandomNumberRange = 32;

		String randWord = "";

		char[] mass = { 'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с',
				'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'э', 'ю', 'я' };

		for (byte i = 0; i < 50; i++) {

			double pseudoRandomNumber = startOfRandomNumberRange
					+ (Math.random() * (endOfRandomNumberRange - (startOfRandomNumberRange)));
			
			randWord += mass[(byte) pseudoRandomNumber];
		}

		return randWord.toString();

	}

	public static long ArrayList100() {

		long mill = System.currentTimeMillis();

		List<String> arrayList100 = new ArrayList<String>();

		for (int i = 0; i < 100; i++) {

			arrayList100.add(RandomWord());
		}

		long delta = System.currentTimeMillis() - mill;

		return delta;

	}

	public static long ArrayList10000() {

		long mill = System.currentTimeMillis();

		List<String> arrayList10000 = new ArrayList<String>();

		for (int i = 0; i < 10000; i++) {

			arrayList10000.add(RandomWord());
		}

		long delta = System.currentTimeMillis() - mill;

		return delta;

	}

	public static long ArrayList1000000() {

		long mill = System.currentTimeMillis();

		List<String> ArrayList1000000 = new ArrayList<String>();

		for (int i = 0; i < 1000000; i++) {

			ArrayList1000000.add(RandomWord());
		}

		long delta = System.currentTimeMillis() - mill;

		return delta;

	}

	public static long LinkedList100() {

		long mill = System.currentTimeMillis();

		List<String> linkedList100 = new LinkedList<String>();

		for (int i = 0; i < 100; i++) {

			linkedList100.add(RandomWord());
		}

		long delta = System.currentTimeMillis() - mill;

		return delta;

	}

	public static long LinkedList10000() {

		long mill = System.currentTimeMillis();

		List<String> linkedList10000 = new LinkedList<String>();

		for (int i = 0; i < 10000; i++) {

			linkedList10000.add(RandomWord());
		}

		long delta = System.currentTimeMillis() - mill;

		return delta;
	}

	public static long LinkedList1000000() {

		long mill = System.currentTimeMillis();

		List<String> linkedList1000000 = new LinkedList<String>();

		for (int i = 0; i < 1000000; i++) {

			linkedList1000000.add(RandomWord());
		}

		long delta = System.currentTimeMillis() - mill;

		return delta;

	}

}