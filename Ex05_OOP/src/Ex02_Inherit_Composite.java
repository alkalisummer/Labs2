/*
 ���Ǽ���... ���赵�� ������... (������)
 
�������� ���赵 �ۼ���... ������ ���Ե��� ������ �־�� �Ѵ�. 

������
��Ӱ���(is ~ a: ���)�� ~ �̴�. (�θ����� �ڷ�)
-> ���� �����̴�.
->�簢���� �����̴�. 

���԰���(has ~ a: ����) �� ~�� ������ �ִ�. ��ǰ ���� ���� 
-> ���� ������ ������ �ִ�.(x)
-> �簢���� ������ ������ �ִ�.(x)
---------------------------------------
��Ŭ���� 

����Ŭ���� 

->��� (�� extends ����)
 
 ���� ���̴�.(x)
 ���� ����(x,y)
 ���� ���� ������ �ִ�.(has ~ a) ���԰��� 
 -> class �� {�� ������;}
 
  ����, ��
  ������ ���̴� (is ~ a)(x)
  ������ ���� ������ �ִ�.(has ~ a)(o)
  class ����{}
   class ��{}
   
  class ���� { �� gun;}
-------------------------------
���� ��� 
��, �簢��, �ﰢ���� ����� ���踦 �ۼ��ϰ� �;�� 
��: ������ ������, �׸��� ,����
�ﰢ��: �� ����, �׸��� ,����
�簢��: �װ��� ��, �׸��� ,����
��: (x,y)

����
���� �����̴�.
�ﰢ���� �����̴�. 
�簢���� �����̴�. 

����: (�Ϲ�ȭ , �߻�ȭ) �и�: ����, �׸��� 
��(��üȭ, Ư��ȭ) -> ��, ������ 

�� ����(x,y)
���� ���̴�.
�ﰢ���� ���̴�. 

���� ���� ������ �ִ�. 
�ﰢ���� ���� ������ �ִ�. 
�簢���� ���� ������ �ִ�.
(has ~ a)


�Ϲ�ȭ, �߻�ȭ(����и�) : shape(���� , �׸���)
                  :point(x,y)
                  
class Shape{}
class Point{}

��üȭ, Ư��ȭ( circle, triangle)


 */
class Shape{
	String color = "gold";
	void draw() {
		System.out.println("������ �׸���.");
	}
}

class Point{
	int x;
	int y;
	
	Point(){
		this(1,2);// �����ڸ� ȣ���ϴ� this 
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
//���� ���弼�� (����: ������ �������� ������ �ִ�.)
		//���� �����̴�.(is ~ a) extends
		//���� ���� ������ �ִ�.(has a) ��������
		
		//���� Ư����,��ü��: ������ 

class Circle extends Shape{
	Point center;//memberfield(��ǰ) has ~ a
	int r;// member field( Ư����, ��üȭ)
	
	public Circle() {
		this(new Point(5,8),10);
	}
	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
}
//���� 1)
// �ﰢ�� Ŭ���� �����
//�ﰢ��: �ﰢ���� ������ ���� ���� �׸��� �׸��ٶ�� ����� ������ �ִ�. 
//shape, point Ȱ��

class Triangle extends Shape{
	Point[] pointarray;
	
	
	public Triangle() {
		this(new Point[] {new Point(1,2),new Point(4,3),new Point(5,7)},"blue");
	}
	
	public Triangle(Point[] pointarray,String color) {
		this.pointarray = pointarray;
		
		this.color = color;
	}
	
}


public class Ex02_Inherit_Composite {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		System.out.println(c.color);
		System.out.println(c.r);
		System.out.println(c.center.x);
		System.out.println(c.center.y);
		
		
		Point point = new Point(10, 15);
		Circle c2 = new Circle(point, 20);
		
		c2.draw();
		System.out.println(c2.color);
		System.out.println(c2.r);
		System.out.println(c2.center.x);
		System.out.println(c2.center.y);
		
		Triangle t = new Triangle();
		t.draw();
		System.out.println(t.color);
		
		
	}

}
