package HW2;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� �������� ������� ����������: ");
		double r = scan.nextDouble();
		System.out.println("������ ���������� ���������:" + "" + Math.PI*(r*2));
		scan.close();
	}
}