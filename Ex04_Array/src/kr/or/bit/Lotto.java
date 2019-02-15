package kr.or.bit;

import java.util.Random;
import java.util.Scanner;

//설계도
//Lotto lotto = new Lotto();
//lotto.SelectLottoNumber(); >>메뉴 제공

public class Lotto {

	private Scanner scanner;
	private Random r;//r.nextInt(45) +1 (1~45)
	private int[] numbers;
	            //static{}, {} 초기자 
	public Lotto() { // 특수한 목적: member field 초기화(생성자 함수), constructor
	      scanner = new Scanner(System.in);//초기화( 참조 변수 주소값을 갖는것)
	      r = new Random();
	      numbers = new int[6];
	}
		
	public void SelectLottoNumber() {
		
		int menu;
		
		System.out.println("******로또 프로그램******");
		System.out.println("1.당신의 로또 번호를 추출 합니다.");
		System.out.println("2.프로그램을 종료.");
		System.out.println("메뉴를 선택하세요: ");
		
		menu = Integer.parseInt(scanner.nextLine());
	
		  
		   switch(menu) {
			  case 1:
				  
				  selectBasicLottoNumber(r, numbers);
			  
				  SelectLottoNumber();
				  break; 
			  case 2:
				  System.out.println("프로그램을 종료합니다!  ");
				  break;
			  default:
				  System.out.println("잘못 입력하셨습니다.");	
				  SelectLottoNumber();
	}
		}
	
	private void selectBasicLottoNumber(Random r, int[] numbers) {
		//실로또 번호 추출하고 중복값 배제 처리하는 함수
		
		
		
		System.out.println("숫자 3개를 입력하세요 ");
		for(int i =0; i<numbers.length/2;i++) { 
			numbers[i] = Integer.parseInt(scanner.nextLine());
		   for(int j=0;j<i;j++) {
			   if(numbers[i] == numbers[j]) {
				  System.out.println("중복된 값은 입력할수 없습니다.");
				   i--;
				 break; 
			   }		   
		   }
		}
	

		for(int i =numbers.length/2; i<numbers.length;i++) { 
			numbers[i] = r.nextInt(45);
		   for(int j=0;j<i;j++) {
			   if(numbers[i] == numbers[j]) {
				   i--;
				 break; 
			   }		   
		   }
		}
		
	
		int temp = 0;
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=i+1; j<numbers.length;j++)
			if(numbers[i]>numbers[j]) {
				temp = numbers[j];	
				numbers[j] = numbers[i];	
			    numbers[i] = temp;
		}
		}
		
		System.out.print("당신의 로또 당첨 예상번호: ");
		for(int i =0; i<numbers.length;i++) {
			System.out.printf(" [%d] ",numbers[i]);
			}
		
		System.out.println();
	}	
	//검증(기능함수) 6개의 합을 구해서 6으로 나눈 평균의 범위가 5보다 크거나 같고 10보다 작거나 같으면 번호 추출 
	// (avg>=5 && avg <= 10)... 이범위가 아니면 재추출 하겠다. 
	private boolean  checkAverage(int[] numbers) {
		int sum = 0;
		int average = 0;
		
		for(int i = 0; i<numbers.length; i++)
			sum+= numbers[i];
		average = sum/numbers.length;
		return(average>=5 && average <= 10);//5 6 7 8 7 9 10 true
		
	}
	      
	      
	
}
