
public class Ex10_Statement {

	public static void main(String[] args) {
		/*
		���
		���ǹ�(�б⹮): if(����, else, else if), switch() case break
		�ݺ��� : for(�ݺ�Ƚ��), while(����), do-while() ��������
		break(�� Ż��), continue(�Ʒ� ���� skip) 
        */
		int count = 0; //local variable(�ʱ�ȭ)
		if(count<1) {
			System.out.println("True �Դϴ�.");
						
		}
		if(count<1)System.out.println("True{����}");
		
		char data = 'A';//���ǰ�����: ����, char, String ���� 
		
		switch(data) {
		   case 'A' : System.out.println("���ں�");
		       break;
		   default: System.out.println("default");
	
		}
		
		//�ݺ���
		  int sum = 0;
		  for(int i = 0; i<=10;i++) {
			 // System.out.println("i : "+i);
			  sum += i;
			  
			  
			  
		  }
		  System.out.println("1���� 10���� ��: "+sum);
		
      //for ���� ����ؼ� 1-10���� Ȧ���� ���� ���ϼ��� 
		  
		  int result = 0; 
		  
		  for(int i = 1;i<=10 ;i+=2) {
			  
			   result += i;
			 			  
		  }
		
		System.out.println("1���� 10���� Ȧ���� ��: "+result);
		
		int sum2 = 0;
		
		for(int i = 0; i<=100;i++) {
			if (i%2 == 0)
				sum2+= i;
			
	
		}
		
		System.out.println("1���� 100���� ¦���� ��: " + sum2);
		
		
		//�Ի���� ��ǥ���� ����(������): ���� 
	    //for�� (��ø)>> ��� �� 
		
		/*int result3 = 0;
		for(int i =2; i<=9; i++) {
			for(int j=1;j<=9;j++) {
				result3 = i*j;
				System.out.printf("[%d]*[%d]=[%d]\t  ", i,j,result3);
				
			}
				System.out.println();
				
		}*/
		// key point(break Ż��, continue ��ŵ)     
		
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
		
	 for(int i = 100; i >= 0; i--) {//���۰��� ū������....
				 
	 }
		
	
	 
	 
	 
	 
	 
	 
		
		
}}
