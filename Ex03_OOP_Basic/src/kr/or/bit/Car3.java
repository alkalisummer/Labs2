package kr.or.bit;


public class Car3 {

	private String color;
	private int price;
	private int maxSpeed;
	public int maxOutput;
	public int mileage;
    private boolean data;
	
	public class usb {
		
	boolean	data = true;
		
	}
	

	public class bluetooth {
		
		boolean data = true;
		
	}
	
	public class wifi {
		
		boolean data = true;
		
	}
	
	public Car3(String color, int price, int maxSpeed){
		this.color = color;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}



	public void setMaxOutput(int maxOutput) {
		this.maxOutput = maxOutput;
	}



	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	 
	 
	public boolean musicOn(String usb, String wifi, String bluetooth) {
		
		
		
		return true;
	}
	
    public boolean musicOff() {
		return false;
	}
	
    
	
	
	
}
