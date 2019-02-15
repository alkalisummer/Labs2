import java.util.Arrays;

public class Ex01_Array_Basic {

	public static void main(String[] args) {
	   int[] score = new int[3];
	   
	   System.out.println("scrore(참조): "+ score);// 배열 시작값의 주소 
	   System.out.println(score[0]);
       score[1] = 333;
       System.out.println(score[1]);
	   System.out.println(score[2]);
       //Array 각각의 방을 가지고 있다( 각방의 크기는 (int) 4byte)
       //각각의 방에 대한 접근은: 첨자, index 로 접근: 배열의 시작값:0
       //score[0], score[1], score[2] 
       //배열의 개수는(length) 3개
       //배열의 마지막 첨자 값은: length - 1
       //배열은 타입의 default 값을 가진다.
       
       //score[3] = 500;
       //예외(Exception 발생) >> 현상 >> 프로그램이 강제 종료 ... 
       // java.lang.ArrayIndexOutOfBoundsException 
       //자주 봅니다. ...
       //Array 와 궁합이 제일 좋은 제어문? for
       for(int i =0; i<3; i++) {
    	   System.out.printf("score[%d]=%d\t",i,score[i]);	   
       }
	   
         System.out.println();
         for(int i = 0; i < score.length; i++)
        	 System.out.printf("score[%d]=%d\t",i,score[i]);
         
         
         System.out.println();
         //Array 사용시 도와주는 보조클래스(helper 클래스)
         String result = Arrays.toString(score);
         System.out.println(result);
         
         score[0] = 666;
         result = Arrays.toString(score);
         System.out.println(result);
         
         Arrays.sort(score);
         result = Arrays.toString(score);
         System.out.println(result);
         
         
         //Point (암기)
         
         //배열을 만드는 3가지 방법 
         int[] arr = new int[5];//기본: 방의 크기 
         int[] arr2 = new int[] {100, 200, 300};// 값을(초기값) 정의 배열생성
         int[] arr3 = {11,12,13,14,15};//값만 설정(컴파일러가 내부적으로 new)
         
         //javascript : var cars = ["Saab"]
         
         
         for(int i = 0; i<arr3.length; i++)
            System.out.printf("%d \t", arr3[i]);    
	   
	     //Car c;
         //c= new Car(); 선언과 할당을 분리 
         System.out.println();         
         int[] arr4;
      
         arr4 = new int[] {1,2,3};// 선언과 할당을 분리(사용 불가)
         
         int[] arr5 = arr4; //주소값 할당 
         System.out.println(arr4==arr5);         
	
	     // 배열은 8가지 기본타입 + String + 사용자정의 클래스
          char[] ch = new char[10];
          for(int i = 0; i< ch.length; i++) {
        	  System.out.println(">"+ch[i]+"<");
        	  
        	  
          }
	
	}

}
