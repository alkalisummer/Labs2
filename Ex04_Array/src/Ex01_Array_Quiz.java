
public class Ex01_Array_Quiz {

	public static void main(String[] args) {
	   int[] score = new int[] {79,88,97,54,56,95};
	   
	    int max = score[0];
	    int min = score[0];
	    for(int i =1; i<score.length;i++) {
	    	if(score[i]>max)
	    		max = score[i];
	    	if(score[i]<min)
	    		min = score[i]; 		
	    }
	    System.out.println("최고점: "+max);
	    System.out.println("최하점: "+min);
	
	    
	    int[] number = new int[10];
	//10개의 방의 값을 1-10 까지 초기화 하고 싶어요.
	    //number[0]
	    for(int i = 0; i<number.length;i++)
	      number[i]= i+1;
	
	    for(int i = 0; i<number.length;i++)
		     System.out.println(number[i]+"t");
		
	
	   //어느학생의 기말고사 시험 점수 입니다.(5과목)
	    // 총과목수 , 과목의 합 , 과목의 평균 
	    
	    
	     int sum = 0;
	     float average = 0f;
	     int[] jumsu = {100,55,90,60,78};
	     
	     for(int i=0; i<jumsu.length;i++) {
	    	 sum += jumsu[i];
	    	 
	     }
	     average = sum/(float)jumsu.length;
	     System.out.println("총과목수: "+ jumsu.length+" 과목의 합: "+ sum+" 과목의 평균: "+average);
	    
		    
	    //1-45까지의 난수를 발생시켜 6개의 배열에 담기 
	      //배열에 담긴 6개의 배열값은 중복값이 나오면 안됨
	      //배열에 있는 6개의 낮은 순으로 정렬시키기 
	      //위의 결과를 담고 있는 배열을 출력 
	      
	     
	      
	      
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	
	
	
	
	
	
	}
}
