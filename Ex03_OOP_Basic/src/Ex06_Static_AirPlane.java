import kr.or.bit.AirPlane;

/*
�츮ȸ��� ����⸦ �ֹ� ���� �Ǹ��ϴ� ȸ���Դϴ�.
�츮ȸ��� ����⸦ �����ϴ� ���赵�� �ۼ��Ϸ��� �մϴ�.

 ������� �䱸����
 1.����⸦ �����ϸ� ������� �̸��� ��ȣ�� �ο��ؾ� �Ѵ�.
 2.����Ⱑ ����Ǹ� ������� �̸��� ��ȣ�� �°� �ο��ƴ��� Ȯ���ϴ� ����� �ʿ��մϴ�.
 3.����Ⱑ ��� �ɶ����� ������� ��������� Ȯ������ �ֽ��ϴ�. 
 
 
 
 */


public class Ex06_Static_AirPlane {

	public static void main(String[] args) {
		
		AirPlane p = new AirPlane();
		p.planeName = "1ȣ";
		p.planeNum = 1234;
      
        AirPlane p2 = new AirPlane();
		p2.planeName = "2ȣ";
		p2.planeNum = 5644;
	
        
        
        AirPlane p3 = new AirPlane();
		p3.planeName = "3ȣ";
		p3.planeNum = 2734;
        p3.planeInfo();		
        
     
	}

}
