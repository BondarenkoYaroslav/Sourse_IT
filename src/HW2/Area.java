package HW2;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("������� �������� ������ ������� ������������: ");
		double a = scan.nextDouble();
		System.out.println("������� �������� ������ ������� ������������: ");
		double b = scan.nextDouble();
		System.out.println("������� �������� ������� ������� ������������: ");
		double c = scan.nextDouble();
		if (a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b) {
			double p = (a + b + c) / 2; // p � ������������ ������������
			double s = Math.sqrt((p * (p - a) * (p - b) * (p - c))); // s - ������� ������������
			System.out.println("������� ������ ����������� �����: " + s);
		} else
			System.out.println("������� �������� ��������! ������������� ��������� � ���������� ��� ;)");
		scan.close();
	}
}
