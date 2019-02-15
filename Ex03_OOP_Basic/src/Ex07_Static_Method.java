

class StaticClass{
	int iv;
	static int cv;
	
	
	void m() {
		//일반함수 m()에서 iv 값을 처리: (0)
		iv = 100;
		//일반함수m() 에서 cv 값을 처리 :(0): point 
		//static 자원은 일반자원보다 먼저(항상) 메모리에 로드 된다. 
		cv = 200;
		
		System.out.println("iv "+ iv+ ","+"cv: "+cv);
		
	}
	static void sm() {
		//반자원인 iv 자원을(member field) 사용 :(x)
		//iv = 200;// sm() 함수가 항상 일반 자원보다 memory 먼저 로딩 
		//생성시점에 대한 문제 
		cv = 200; 
		// 끼리 끼리 놀아라 그렇다면 에러가 없을것이다. 
		// static은 static끼리 놀아라
		
		
		
	}
	
}

//일반 함수: 일반자원, static 자원 모두 사용 
//static 함수 : static 자원만 사용가능 (static끼리 놀아라)





public class Ex07_Static_Method {
	
	public static void main(String[] args) {
		
		StaticClass s = new StaticClass();
		s.m();
		
	}
	
	
	
	
	

}
