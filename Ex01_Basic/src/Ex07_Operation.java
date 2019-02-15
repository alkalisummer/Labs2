
//연산자, 제어문 
import java.lang.*;

public class Ex07_Operation {

	public static void main(String[] args) {

		int sum = 0;
		// 대입연산자 (+=, -=, *=, /=) 습관적으로 쓰기
		// sum = sum +1;
		sum += 1;
		sum -= 1;// sum = sum -1;
		System.out.println("sum: " + sum);

		// 간단한 학점 계산기
		// 학점에 대해서 A+ , B-, F
		// 94점이라면
		// 90점 이상이면 A 서 95점이상이라면 A+

		int score = 60;
		String grade = "";
		System.out.println("당신의 점수는: " + score);
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

		System.out.println("당신의 학점은 : " + grade + " 입니다.");

		// 함수안에서 syso -> ctrl + space 출력문 나옴

		// 코드 정렬하기: ctrl + A 블럭 선택 > ctrl + shift +F (자동 들여쓰기)

		// 분기문 (switch)
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

		// break 구문은 없어도 된다.
		switch (data) {
		case 100:
			System.out.println("100입니다 ");
		case 90:
			System.out.println("90입니다 ");
		case 80:
			System.out.println("80입니다 ");
		default:
			System.out.println("default");
		}

		int month = 5;

		String res = "";// 빈문자열로 초기화

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
			res = "월이 아닙니다.";

		}
		System.out.println(month + "월은 " + res + "일까지 입니다.");

		// 참조문서
		// https://docs.oracle.com/javase/8/docs/api/index.html
		// package(잘 정리된 폴더)
		// Package 상자안에는: interface , class 들어 있어요
		// 수학계열
		// java.lang.Math(Math 클래스)
		// 언제 만들어졌고 부모가 누구이고 자원은 무얼을 가지고 있는지...
		// Random : a pseudorandom double greater than or equal to 0.0 and less than
		// 1.0.
		// 난수 발생: return double(0.0 <= value < 1.0) ->> 0.999999999
		// public static double random() =>
		// 원칙: 클래스 new 사용가능
		// 그런데 class static 자원을 가지고 있다면 new 없이도 사용가능
		// java.lang.Math m = new java.lang.Math();
		// m.random()

		// java.lang.Math 원칙 java 파일에 default 선언
		System.out.println("Math.random(): " + Math.random());
		System.out.println("Math.random() * 10: " + Math.random() * 10);
		System.out.println("(int)(Math.random() * 10): " + (int) (Math.random() * 10));
		System.out.println("(int)(Math.random() * 10)+1: " + (int) (Math.random() * 10 + 1));

		
		  int jumsu = ((int) (Math.random() * 10) + 1) * 100;
		  System.out.println(jumsu);
		 

		/*
		 * 1000: 티비, 노트북 , 냉장고, 한우세트, 휴지 900: 노트북, 냉장고 , 한우세트, 휴지 800 냉장고, 한우세트, 휴지 700
		 * 한우세트 휴지 600 휴지 그외 100 - 500 칫솔
		 */

		String present = "";
		switch (jumsu) {
		case 1000:
			present += "휴지 ";
		case 900:
			present += "한우세트 ";
		case 800:
			present += "냉장고 ";
		case 700:
			present += "노트북 ";
		case 600:
			present += "티비 ";
			break;
		default:
			present ="칫솔";
		}
      
		System.out.println(present + "에 당첨 되었습니다.!");

	}
}
