import java.util.Scanner;
public class Ex09_Operation_Quiz {

	public static void main(String[] args) {
	   int result = 0;
		
		System.out.println("�Է°�: ");
		Scanner sc = new Scanner(System.in);
	    int num1 = Integer.parseInt(sc.nextLine()); 
		
       
	   System.out.println("�Է°�(��ȣ): ");
	   String opr = sc.nextLine();
	   	   	   
	   System.out.println("�Է°�: ");
	   int num2 = Integer.parseInt(sc.nextLine()); 
	   
	  
	   /*if(opr.equals("+")) {
		   result = num1 + num2; 
	   }else if(opr.equals("-")){
		   result = num1 - num2; 
	   }else if(opr.equals("*")){
		   result = num1 * num2; 
	   }else (opr.equals("/")){
		   result = num1 / num2; 
	   }*/
	   
		switch (opr) {

		case "+":
			result = num1 + num2;
			break;

		case "-":
			result = num1 - num2;
			break;

		case "*":
			result = num1 * num2;
			break;

		case "/":
			result = num1 + num2;
			break;

		default:
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
     
		}

		System.out.println("�����:  " + result);
     //return Ű����: �Լ������� ������ > ���� �Լ� Ż�� > ���� 
	}

}
