
//������, ��� 
import java.lang.*;

public class Ex07_Operation {

	public static void main(String[] args) {

		int sum = 0;
		// ���Կ����� (+=, -=, *=, /=) ���������� ����
		// sum = sum +1;
		sum += 1;
		sum -= 1;// sum = sum -1;
		System.out.println("sum: " + sum);

		// ������ ���� ����
		// ������ ���ؼ� A+ , B-, F
		// 94���̶��
		// 90�� �̻��̸� A �� 95���̻��̶�� A+

		int score = 60;
		String grade = "";
		System.out.println("����� ������: " + score);
		if (score >= 90) {
			grade = "A";
			if (score >= 95) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else {
			grade = "F";
		}

		System.out.println("����� ������ : " + grade + " �Դϴ�.");

		// �Լ��ȿ��� syso -> ctrl + space ��¹� ����

		// �ڵ� �����ϱ�: ctrl + A �� ���� > ctrl + shift +F (�ڵ� �鿩����)

		// �б⹮ (switch)
		int data = 100;
		switch (data) {
		case 100:
			System.out.println("100");
			break;
		case 200:
			System.out.println("200");
			break;
		case 300:
			System.out.println("300");
			break;
		default:
			System.out.println("default");
		}

		// break ������ ��� �ȴ�.
		switch (data) {
		case 100:
			System.out.println("100�Դϴ� ");
		case 90:
			System.out.println("90�Դϴ� ");
		case 80:
			System.out.println("80�Դϴ� ");
		default:
			System.out.println("default");
		}

		int month = 5;

		String res = "";// ���ڿ��� �ʱ�ȭ

		switch (month) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			res = "31";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			res = "30";
			break;

		case 2:
			res = "29";
			break;

		default:
			res = "���� �ƴմϴ�.";

		}
		System.out.println(month + "���� " + res + "�ϱ��� �Դϴ�.");

		// ��������
		// https://docs.oracle.com/javase/8/docs/api/index.html
		// package(�� ������ ����)
		// Package ���ھȿ���: interface , class ��� �־��
		// ���а迭
		// java.lang.Math(Math Ŭ����)
		// ���� ��������� �θ� �����̰� �ڿ��� ������ ������ �ִ���...
		// Random : a pseudorandom double greater than or equal to 0.0 and less than
		// 1.0.
		// ���� �߻�: return double(0.0 <= value < 1.0) ->> 0.999999999
		// public static double random() =>
		// ��Ģ: Ŭ���� new ��밡��
		// �׷��� class static �ڿ��� ������ �ִٸ� new ���̵� ��밡��
		// java.lang.Math m = new java.lang.Math();
		// m.random()

		// java.lang.Math ��Ģ java ���Ͽ� default ����
		System.out.println("Math.random(): " + Math.random());
		System.out.println("Math.random() * 10: " + Math.random() * 10);
		System.out.println("(int)(Math.random() * 10): " + (int) (Math.random() * 10));
		System.out.println("(int)(Math.random() * 10)+1: " + (int) (Math.random() * 10 + 1));

		
		  int jumsu = ((int) (Math.random() * 10) + 1) * 100;
		  System.out.println(jumsu);
		 

		/*
		 * 1000: Ƽ��, ��Ʈ�� , �����, �ѿ켼Ʈ, ���� 900: ��Ʈ��, ����� , �ѿ켼Ʈ, ���� 800 �����, �ѿ켼Ʈ, ���� 700
		 * �ѿ켼Ʈ ���� 600 ���� �׿� 100 - 500 ĩ��
		 */

		String present = "";
		switch (jumsu) {
		case 1000:
			present += "���� ";
		case 900:
			present += "�ѿ켼Ʈ ";
		case 800:
			present += "����� ";
		case 700:
			present += "��Ʈ�� ";
		case 600:
			present += "Ƽ�� ";
			break;
		default:
			present ="ĩ��";
		}
      
		System.out.println(present + "�� ��÷ �Ǿ����ϴ�.!");

	}
}
