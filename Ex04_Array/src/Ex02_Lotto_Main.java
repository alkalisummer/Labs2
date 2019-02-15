
public class Ex02_Lotto_Main {

	public static void main(String[] args) {
		
		 int[]num = new int[6];
		 
		
		
		for(int i =0; i<6;i++) { 
			 num[i] = (int)(Math.random()*6+1);
		   for(int j=0;j<i;j++) {
			   if(num[i] == num[j]) {
				  i--;
				 break; 
			   }		   
		   }
			
		}
		int temp = 0;
		for(int i=0;i<5;i++) {
			for(int j=i+1; j<6;j++)
			if(num[i]>num[j]) {
				temp = num[j];	
				num[j] = num[i];	
			    num[i] = temp;
		}
		}
		for(int i =0; i<6;i++) {
		System.out.printf(" %d ",num[i]);
		}

	}

}
