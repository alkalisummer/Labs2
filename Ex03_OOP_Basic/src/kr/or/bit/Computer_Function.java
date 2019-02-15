package kr.or.bit;

public class Computer_Function {
  
    public String data ;
    public boolean input_on = false;
	
	
	
	public void Input_Data(String data) {
          
           input_on = true;
           
           this.data = data;
		
	}
	

	public void Output_Data(String data) {
          
		 System.out.println("Output_data:" + data);
		
		
	}
	
	public void calcul(int a, int b) {
		
	   int sum, sub, mul, div;
	   
	   sum = a +b; sub = a-b; mul = a*b; div = a/b;
	   
	   System.out.println("sum = "+ sum + " sub = "+ sub +"mul = "+ mul +"div= "+ div);		
	
	}
	
	
	
	
}
