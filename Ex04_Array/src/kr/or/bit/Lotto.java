package kr.or.bit;

import java.util.Random;
import java.util.Scanner;

//���赵
//Lotto lotto = new Lotto();
//lotto.SelectLottoNumber(); >>�޴� ����

public class Lotto {

	private Scanner scanner;
	private Random r;//r.nextInt(45) +1 (1~45)
	private int[] numbers;
	            //static{}, {} �ʱ��� 
	public Lotto() { // Ư���� ����: member field �ʱ�ȭ(������ �Լ�), constructor
	      scanner = new Scanner(System.in);//�ʱ�ȭ( ���� ���� �ּҰ��� ���°�)
	      r = new Random();
	      numbers = new int[6];
	}
		
	public void SelectLottoNumber() {
		
		int menu;
		
		System.out.println("******�ζ� ���α׷�******");
		System.out.println("1.����� �ζ� ��ȣ�� ���� �մϴ�.");
		System.out.println("2.���α׷��� ����.");
		System.out.println("�޴��� �����ϼ���: ");
		
		menu = Integer.parseInt(scanner.nextLine());
	
		  
		   switch(menu) {
			  case 1:
				  
				  selectBasicLottoNumber(r, numbers);
			  
				  SelectLottoNumber();
				  break; 
			  case 2:
				  System.out.println("���α׷��� �����մϴ�!  ");
				  break;
			  default:
				  System.out.println("�߸� �Է��ϼ̽��ϴ�.");	
				  SelectLottoNumber();
	}
		}
	
	private void selectBasicLottoNumber(Random r, int[] numbers) {
		//�Ƿζ� ��ȣ �����ϰ� �ߺ��� ���� ó���ϴ� �Լ�
		
		
		
		System.out.println("���� 3���� �Է��ϼ��� ");
		for(int i =0; i<numbers.length/2;i++) { 
			numbers[i] = Integer.parseInt(scanner.nextLine());
		   for(int j=0;j<i;j++) {
			   if(numbers[i] == numbers[j]) {
				  System.out.println("�ߺ��� ���� �Է��Ҽ� �����ϴ�.");
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
		
		System.out.print("����� �ζ� ��÷ �����ȣ: ");
		for(int i =0; i<numbers.length;i++) {
			System.out.printf(" [%d] ",numbers[i]);
			}
		
		System.out.println();
	}	
	//����(����Լ�) 6���� ���� ���ؼ� 6���� ���� ����� ������ 5���� ũ�ų� ���� 10���� �۰ų� ������ ��ȣ ���� 
	// (avg>=5 && avg <= 10)... �̹����� �ƴϸ� ������ �ϰڴ�. 
	private boolean  checkAverage(int[] numbers) {
		int sum = 0;
		int average = 0;
		
		for(int i = 0; i<numbers.length; i++)
			sum+= numbers[i];
		average = sum/numbers.length;
		return(average>=5 && average <= 10);//5 6 7 8 7 9 10 true
		
	}
	      
	      
	
}
