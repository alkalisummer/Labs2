

class StaticClass{
	int iv;
	static int cv;
	
	
	void m() {
		//�Ϲ��Լ� m()���� iv ���� ó��: (0)
		iv = 100;
		//�Ϲ��Լ�m() ���� cv ���� ó�� :(0): point 
		//static �ڿ��� �Ϲ��ڿ����� ����(�׻�) �޸𸮿� �ε� �ȴ�. 
		cv = 200;
		
		System.out.println("iv "+ iv+ ","+"cv: "+cv);
		
	}
	static void sm() {
		//���ڿ��� iv �ڿ���(member field) ��� :(x)
		//iv = 200;// sm() �Լ��� �׻� �Ϲ� �ڿ����� memory ���� �ε� 
		//���������� ���� ���� 
		cv = 200; 
		// ���� ���� ��ƶ� �׷��ٸ� ������ �������̴�. 
		// static�� static���� ��ƶ�
		
		
		
	}
	
}

//�Ϲ� �Լ�: �Ϲ��ڿ�, static �ڿ� ��� ��� 
//static �Լ� : static �ڿ��� ��밡�� (static���� ��ƶ�)





public class Ex07_Static_Method {
	
	public static void main(String[] args) {
		
		StaticClass s = new StaticClass();
		s.m();
		
	}
	
	
	
	
	

}
