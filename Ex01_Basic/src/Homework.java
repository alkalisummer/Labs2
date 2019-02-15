import java.util.Scanner;
public class Homework {

	public static void main(String[] args) {
	
		 int sum = 0;
		 
		 for(int i =1; i<=20; i++) {
			 if(i%2!=0 && i%3!=0) {
				 sum += i;				
			 }		 
		 }
		 
		 System.out.println("2또는 3의배수가 아닌 수의 총합: " + sum);
          System.out.println();
	
		 for(int i=1;i<=6;i++) {
			 for(int j=1; j<=6;j++) {
				 if(i + j == 6)
					 System.out.printf("첫번째 주사위[%d] , 두번째 주사위[%d] \t",i,j);				 
			 }
				 
			 System.out.println();
		    
		 
	}
   
		 int com = (int)(Math.random()*10)%3+1;
		 
		 System.out.println(com);
		 
		 
		 
		 
		 
				 
		 
}}
