package kr.or.bit;
/*
 �Լ�: ����� �ּ� ����(method)
 
 �Լ��� ���� 
 * void(�����ִ� ���� ����): return value �� ���� 
 * return Type : [8���� �⺻ Ÿ��] + String + ����� ����(class) + Array + Collection + Interface
 * *�Լ��� return Type(ex public int calc(){return 100;} �ִٸ�
   �ݵ��{ �����} �ȿ� return ������ ������ �־�� �Ѵ�.
    
  
 *parameter:[8���� �⺻ Ÿ��] + String + ����� ����(class) + Array + Collection + Interface
  
  
  
 1. void, parameter(0): public void print(String str){System.out.println(str);}
 2. void, parameter(x): public void println{System.out.println("hello");}
 3. return Type, parameter(0): public int call(int i){return i+100;}
 4. return Type, parameter(x): public int call(){return 1000;}
 
 �Լ�(method) �ݵ�� ȣ��(call) �Ǿ�� �����Ѵ�.... 
 
 
 */
public class FunctionClass {

    
	public void m() { //�Լ��� �̸��� �ǹ��ִ� �ܾ��� ����: getChannelNumber()
	    System.out.println("�Ϲ��Լ�: void, param(x)");
		
	}


	public void m2(int i) {
	    System.out.println("param value: "+i);
	    System.out.println("�Ϲ��Լ�: void, param(o)");	    
	}
    
	public int m3() { // ���� m3 �Լ��� ȣ���ϸ� 100�̶�� ���� ���� �޴´�.
	    return 100;
	}
	
	public int m4(int data) {
	    return data + 100;
	}
	
	
	
	//������(������):private �Լ�
	//��ǹ����ڵ�: class���ο��� ��� (�ٸ� �Լ��� �����ִ� ����)
	//�ٸ� �������� �Լ��� ������ �������� ������ �� ���� �Լ��� ��Ƽ� ��� ����
    //�������� (����) ����
	
	
	
	private int operationMethod(int data) {
		return data *100;
		
	}
	
	
	public int sum(int data) {
		
		return operationMethod(data);//������ �ڵ�
	}
	
public int sum2(int data) {
		
		int result = operationMethod(data);
		return result;
	}
//Ȯ���Լ� (parameter ���� ������)

public int sum3(int i, int j, int k) {
	return i+j+k; // ���� ������ �������
}
//a�� b ���߿� ū ���� �����ϴ� �Լ� 
	
public int max (int a, int b){
		
		int num = (a>b)? a:b;
		
		 return num;
	}
	
	
public String contact(String s, String s2, String s3) {
	
	return s+"/"+s2+"/"+s3;
}

//Ŭ���� == Ÿ���̴�

//public int call() {return 100;}
/*public Tv call() {
	Tv t = new Tv(); 
	return t;	
}

public Tv call() {
	
return new Tv();	
}

public void call(Tv t) {
	System.out.println(t.name);
	
}*/



public Tv objMethod() {// Tv Ÿ���� ���� �ּҰ��� return
	
   Tv tt = new Tv();//heap ��ü ����� �ּҰ� tt�� �Ҵ� 
   tt.brandname ="������";
   return tt;
		
	
}

public Tv objMethod2() {// heap ��ü ����� �ּҰ� return
	
	  return new Tv();
	}


public void objMethod3(Tv t) {// heap ��ü ����� �ּҰ� return
	
	  System.out.println("Tv Ÿ�� ����: " +t);
	  System.out.println("ä������: " +t.ch);
	  System.out.println("�귣�� �̸�: " +t.brandname);
	}









}


