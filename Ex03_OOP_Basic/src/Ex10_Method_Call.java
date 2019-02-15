class Data{
	int i;
	
	
}




public class Ex10_Method_Call {

	public static void main(String[] args) {
		Data d = new Data();
		d.i =100;
		System.out.println("d.i: "+d.i);
		scall(d);
		//System.out.println("after d.i : "+d.i);
		vcall(d.i);
		System.out.println("d.i: "+d.i);
	}
	
	
	static void scall(Data data) {// 주소값 참조
		System.out.println("함수: "+data.i);
		data.i = 1111;
		
		
	}

	static void vcall(int x) {
		System.out.println("before x:"+x);
		x = 8888;
		System.out.println("after x:"+x);
		char c =' ';
		byte b = 127;
		String s ="가나다";
		
		
	}
	
	
}
