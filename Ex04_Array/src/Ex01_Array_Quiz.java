
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
	    System.out.println("�ְ���: "+max);
	    System.out.println("������: "+min);
	
	    
	    int[] number = new int[10];
	//10���� ���� ���� 1-10 ���� �ʱ�ȭ �ϰ� �;��.
	    //number[0]
	    for(int i = 0; i<number.length;i++)
	      number[i]= i+1;
	
	    for(int i = 0; i<number.length;i++)
		     System.out.println(number[i]+"t");
		
	
	   //����л��� �⸻��� ���� ���� �Դϴ�.(5����)
	    // �Ѱ���� , ������ �� , ������ ��� 
	    
	    
	     int sum = 0;
	     float average = 0f;
	     int[] jumsu = {100,55,90,60,78};
	     
	     for(int i=0; i<jumsu.length;i++) {
	    	 sum += jumsu[i];
	    	 
	     }
	     average = sum/(float)jumsu.length;
	     System.out.println("�Ѱ����: "+ jumsu.length+" ������ ��: "+ sum+" ������ ���: "+average);
	    
		    
	    //1-45������ ������ �߻����� 6���� �迭�� ��� 
	      //�迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵ�
	      //�迭�� �ִ� 6���� ���� ������ ���Ľ�Ű�� 
	      //���� ����� ��� �ִ� �迭�� ��� 
	      
	     
	      
	      
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	
	
	
	
	
	
	}
}
