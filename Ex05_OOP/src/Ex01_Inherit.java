/*
 ��ü������(OOP) 3�� Ư¡
 ���
 ������
 ĸ��ȭ(����ȭ):private
 
 1. ���
 java -> child extends Base
 c# -> child : base
 
 2.���Ư¡
 -���߻���� �Ұ�(���⼺...)
- ���ϻ���� ��Ģ(������ ����� ����ؼ� ���߻���� ����)
-���߻���� ����(�����ϰ� Interface)

3.�ǹ�
������ �ǹ�: [���뼺] >> �ݺ����� �ڵ�... �����ڵ� .... �θ�
����: �ʱ� ���� ��� .... 

 ���뼺 >> �����>> ���( �ð�, ���� �и� , �߻�ȭ)
 
 memory �ε� ... ��� ... ���� ���� memory �� �ö� ������ 
 */
class GrandFather{
    public int gmoney = 5000;
    private int pmoney = 50000;// private�� ��ӵ��� ����, �������� ���� �Ұ�  
    public GrandFather() {
    	System.out.println("�Ҿƹ��� ������");
    }
}

class Father extends GrandFather{
	public int fmoney = 1000;
	public Father() {
    	System.out.println("�ƹ��� ������");
    }
	
}

class Child extends Father{
	public int cmoney = 100;
	public Child() {
    	System.out.println("�ڽ� ������");
    }
}

public class Ex01_Inherit {

	public static void main(String[] args) {
	   Child c = new Child();
	   System.out.println(c.gmoney);
	   System.out.println(c.fmoney);
	   System.out.println(c.cmoney);
	}

}
