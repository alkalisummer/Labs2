import kr.or.bit.AirPlane;

/*
우리회사는 비행기를 주문 제작 판매하는 회사입니다.
우리회사는 비행기를 생산하는 설계도를 작성하려고 합니다.

 사장님의 요구사항
 1.비행기를 생산하면 비행기의 이름과 번호를 부여해야 한다.
 2.비행기가 생산되면 비행기의 이름과 번호가 맞게 부여됐는지 확인하는 기능이 필요합니다.
 3.비행기가 출고 될때마다 비행기의 누적대수를 확인힐수 있습니다. 
 
 
 
 */


public class Ex06_Static_AirPlane {

	public static void main(String[] args) {
		
		AirPlane p = new AirPlane();
		p.planeName = "1호";
		p.planeNum = 1234;
      
        AirPlane p2 = new AirPlane();
		p2.planeName = "2호";
		p2.planeNum = 5644;
	
        
        
        AirPlane p3 = new AirPlane();
		p3.planeName = "3호";
		p3.planeNum = 2734;
        p3.planeInfo();		
        
     
	}

}
