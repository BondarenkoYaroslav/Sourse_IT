package HW5;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String tob1 = "������� ��������."; // Type of binding
		String tob2 = "������ ��������."; // Type of binding

		String Rudazov = "��������� ������������ �������";
		String Sillov = "������� �������� ������";
		String King = "������ ����";

		ArrayList<String> id = new ArrayList<>();
		id.add("id0, �������, " + Rudazov + ", �����-�����, 2004 �., 387 �., 50 ���., " + tob1);
		id.add("id1, ������ ��������� ����, " + Rudazov + ", �����-�����, 2005 �., 448 �., 55 ���., " + tob1);
		id.add("id2, ����� ������ ������, " + Rudazov + ", �����-�����, 2005 �., 427 �., 55 ���., " + tob1);
		id.add("id3, ���� ������, " + Sillov + ", ���, 2011 �., 346 �., 100 ���., " + tob1);
		id.add("id4, ������ ������, " + Sillov + ", �������, 2011 �., 352 �., 130 ���., " + tob1);
		id.add("id5, ���� ������, " + Sillov + ", �������, 2012 �., 352 �., 60 ���., " + tob1);
		id.add("id6, 999. ��� �����, " + King + ", ���, 2000 �., 384 �., 150 ���., " + tob1);
		id.add("id7, ����� ������, " + King + ", ���, 2000 �., 259 �., 80 ���., " + tob1);
		id.add("id8, ���� ������ ��, " + King + ", �����, 2013 �., 624 �., 184 ���., " + tob1);

		System.out.println("������� ��� ������, ������������ ��� ��� �������: ");
		String search = scan.nextLine();

		for (int i = 0; i < id.size(); i++) {
			if (id.get(i).contains(search)) {
				System.out.println(id.get(i));
			}
		}
		System.out.println("");
		System.out.println("������ ��������� ���������.");
	}
}
