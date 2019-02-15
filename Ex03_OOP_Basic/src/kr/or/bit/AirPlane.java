package kr.or.bit;

public class AirPlane {
	
	public String planeName;
	public int planeNum;
	public static int count;
     
	
	public AirPlane() {
		count++;
		
	}
	
	public void planeInfo() {
		
		System.out.printf("이름: %s, 번호:%s 누적대수: %d\n", planeName, planeNum, count);

	}
    

}
