package HW4;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("������� �������� ������ ��������������: ");
		int a = scan.nextInt();
		
		System.out.println("������� �������� ������ ��������������: ");
		int b = scan.nextInt();

		String str = ("+").repeat(a-2);
		
		System.out.println("+" + str + "+");
		
		while (b > 2)
		{
			
			System.out.println("+" + str.replace('+', ' ') + "+");
			b--;
		}
		
		System.out.println("+" + str + "+");
		
	}

}
