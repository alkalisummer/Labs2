import java.util.Scanner;
public class Ex09_Operation_Quiz {

	public static void main(String[] args) {
	   int result = 0;
		
		System.out.println("입력값: ");
		Scanner sc = new Scanner(System.in);
	    int num1 = Integer.parseInt(sc.nextLine()); 
		
       
	   System.out.println("입력값(기호): ");
	   String opr = sc.nextLine();
	   	   	   
	   System.out.println("입력값: ");
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
			System.out.println("잘못 입력하였습니다.");
     
		}

		System.out.println("결과값:  " + result);
     //return 키워드: 함수단위의 종결자 > 메인 함수 탈출 > 종료 
	}

}
