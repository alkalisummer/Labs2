import java.util.Scanner;
public class Ex08_Printf_format {

	public static void main(String[] args) {
     //java.lang package �Ʒ� �ִ� �ڿ�(import) ���� ���� ���� ��� ���� 
    //default open �Ǿ� �־ 
	//C# : Console.WriteLine()
	//C# : Console.ReadLine()
	
    //java: System.out.println()
		
		System.out.println("A"); //�ٹٲ�
		System.out.print("B");
		
		int num = 100;
		System.out.println(num);
        
		//����(format)���� 
		//%d (10���� ������ ����)
		//%s (���ڿ�)
		//%c (����)
		//Ư������: \t (��Ű), \n(�ٹٲ�)
		System.out.printf("num ����: %d �Դϴ�.\n",num);
		System.out.printf("num�� ���� [%d] �Դϴ�. �׸��� [%d]�� �־��\n", num,1000);
		
		float f = 3.14f;
		
		System.out.println(f);
		System.out.printf("f ���� ����: %.2f�Դϴ�.\n",f);
		
		System.out.printf("���ڿ� ���� %s �� ��µǰ� %d ���� ���� ���\n", "�ȳ�",100);
		
		//cmd (console) ���� ����ڰ� �Է��� ���� read ����
		//java.util.Scaner sc = new java.util.Scanner(System.in);
		//���� ������ ��ܿ� : import java.util.Scanner;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		String value = sc.nextLine();// nextLine���� ������ ������ ���ڿ��� ���� 
		System.out.println("�Է°�: "+ value);
		
		//System.out.println("���ڰ��� �Է��ϼ���");
		//int number = sc.nextInt(); //���ڰ����� read
		//System.out.println("number :" + number);
		
		//sc.hasNextFloat() Type ���� read �ϴ� �Լ��� �����Ѵ�.
		//������ nextLine() 
		//�������: �׳� ���ڷ� read �ؼ� �ʿ��ϴٸ� ��ȯ�ؼ� ����Ѵ�.
		//Today Point
		//���ڸ� -> ���ڷ� 
		//Integer.parseInt(s) ���ڸ� ������
		//Float.parseFloat(s) ���ڸ� �Ǽ���
		//Double.parseDouble(s) ���ڸ� �Ǽ��� 
		
		System.out.println("���ڸ� �Է��ϼ���");
		int number = Integer.parseInt(sc.nextLine());
	    number += 100;
	    System.out.println("����: "+ number);
	    
	   //���ڸ� -> ���ڷ�(���� ����)
	     String data = String.valueOf(1000);
	     data+=100;
	     System.out.println(data);
	}

}
