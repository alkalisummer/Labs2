package kr.or.bit;

public class AirPlane {
	
	public String planeName;
	public int planeNum;
	public static int count;
     
	
	public AirPlane() {
		count++;
		
	}
	
	public void planeInfo() {
		
		System.out.printf("�̸�: %s, ��ȣ:%s �������: %d\n", planeName, planeNum, count);

	}
    

}
