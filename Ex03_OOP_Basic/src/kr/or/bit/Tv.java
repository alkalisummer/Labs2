package kr.or.bit;
/*
 요구사항정의
 Tv는 채널 정보를 가지고 있다(예를 들면 1-250채널)
 Tv 브랜드 이름을 가지고 있다(예를 들면 삼성, 엘지) 
 Tv는 채널 전환기능을 가지고 있다.(채널을 변경할 수 있다 한단계씩)
 기능 2개(++, --)
 tv는 전원정보를 가지고 있다.
 tv의 전원은 on 할수도 있고 off 할수도 있다.
 
 
 */

public class Tv {
	
	public int ch;//public int ch=1;
    public String brandname;
    public boolean power;
	  
	public void ch_up() {
		//member field 상태 값
	    ch++;	
	}
	
	public void ch_down() {
		//member field 상태 값
	    ch--;	
	}
	
   public void power_on() {
	   
         power = true;  
	   
   }
   
   public void power_down(){
	   
       power = false; 
	   
 }
   
}
