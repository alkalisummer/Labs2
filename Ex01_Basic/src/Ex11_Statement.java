import java.util.Scanner;

//�ݺ���(while, do~while)
public class Ex11_Statement {

	public static void main(String[] args) {
		//while(true) {
			//System.out.println("True");
			
			
				//}
		
		int i = 10;
		while(i>=10) {//���� true
			System.out.println(i);
			//�ݵ�� ���ο��� ������� �������� ó���ؾ��� 
			i--;
		
		}
		
		int sum = 0;
		int j = 1; 
		while(j<=100) {
		 sum+=j;
			j++;						
		}
        System.out.println(sum);
        
        //while ������ ������
        
        int a =2;
        int b =1;
        int result = 0;
        while(a <= 9) {
        	while(b<=9) {
        		result = a * b; 
        		System.out.printf("%d*%d= %d\t",a,b,result);
        		b++;
        		
        	}
        	b=1;
        	System.out.println();
        	a++;
        }
        
        // do ~ while() : ������ ���� (������ �ѹ����� �� ���� ���� �Ǵ�)
        // do {���๮} while(���ǽ�)        
        //�޴� ����
        //1. �λ�
        //2. �޿� 
        //1 �Է��ϸ� �λ� ... 2 �Է��ϸ� �޿� .. .3�� �Է��ϸ� �ٽ� �Է��ϸ� ����
        Scanner sc = new Scanner(System.in);
        int inputdata = 0;
        do {
        	
        	System.out.println("���� �Է���(0~10)");
        	inputdata = Integer.parseInt(sc.nextLine());
        	
        	
        }while(inputdata>10);
        //while �� Ż���� ������ false �϶� while Ż�� 
        System.out.println("����� �Է��� ���ڴ�: " + inputdata);
        
        
	}

}
