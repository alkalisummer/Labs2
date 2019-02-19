package kr.or.bit;

public class Watch {

	private String brand;
	private int price;
	private int sec;
	private int min;
	private int hour;
	int cnt;
	
	public Watch() {
		brand = "���ٱ�";
		price = 15000;
		cnt++;
	}
	
	public void printTime() {
		System.out.println("��:��:�� =  "+ hour+":"+min+":"+sec);
	}
	
	public void setTime(int sec, int min, int hour) {
		this.sec = sec;
		if(sec<0 && sec>59)
			this.sec = 0;
		this.min = min;
		if(min<0 && min>59)
			this.min = 0;
		this.hour = hour;
		if(hour<0 && hour>12)
			this.hour = 0;
	}
	
	
}
