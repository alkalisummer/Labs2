
public class Ex10_Statement {

	public static void main(String[] args) {
		/*
		제어문
		조건문(분기문): if(단일, else, else if), switch() case break
		반복문 : for(반복횟수), while(조건), do-while() 강제실행
		break(블럭 탈출), continue(아래 구문 skip) 
        */
		int count = 0; //local variable(초기화)
		if(count<1) {
			System.out.println("True 입니다.");
						
		}
		if(count<1)System.out.println("True{생략}");
		
		char data = 'A';//조건값으로: 숫자, char, String 가능 
		
		switch(data) {
		   case 'A' : System.out.println("문자비교");
		       break;
		   default: System.out.println("default");
	
		}
		
		//반복문
		  int sum = 0;
		  for(int i = 0; i<=10;i++) {
			 // System.out.println("i : "+i);
			  sum += i;
			  
			  
			  
		  }
		  System.out.println("1부터 10까지 합: "+sum);
		
      //for 문을 사용해서 1-10까지 홀수의 합을 구하세요 
		  
		  int result = 0; 
		  
		  for(int i = 1;i<=10 ;i+=2) {
			  
			   result += i;
			 			  
		  }
		
		System.out.println("1부터 10까지 홀수의 합: "+result);
		
		int sum2 = 0;
		
		for(int i = 0; i<=100;i++) {
			if (i%2 == 0)
				sum2+= i;
			
	
		}
		
		System.out.println("1부터 100까지 짝수의 합: " + sum2);
		
		
		//입사시험 대표적인 문제(구구단): 변형 
	    //for문 (중첩)>> 행과 열 
		
		/*int result3 = 0;
		for(int i =2; i<=9; i++) {
			for(int j=1;j<=9;j++) {
				result3 = i*j;
				System.out.printf("[%d]*[%d]=[%d]\t  ", i,j,result3);
				
			}
				System.out.println();
				
		}*/
		// key point(break 탈출, continue 스킵)     
		
		for(int i =2; i<=9; i++) {
			for(int j=1;j<=9;j++) {
				//if(i == j)continue;
				if(i == j)break;
				System.out.printf("*");
				
			}
				System.out.println();
		
	}

		for(int i=2; i<=9; i++) {
			for(int j =1; j<i;j++ ) {
			System.out.print("*");
						
		}
			System.out.println();
		}
		
	 for(int i = 100; i >= 0; i--) {//시작값을 큰값으로....
				 
	 }
		
	
	 
	 
	 
	 
	 
	 
		
		
}}
