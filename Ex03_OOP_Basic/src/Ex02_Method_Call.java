import kr.or.bit.FunctionClass;
import kr.or.bit.Tv;

public class Ex02_Method_Call {

	public static void main(String[] args) {
	    FunctionClass fc = new FunctionClass();
	    fc.m();
	    fc.m2(100);
        int result  = fc.m3();//return type ������ ....
        System.out.println("result: "+ result);
	    int result2 = fc.m4(1000);
	    System.out.println("result2: "+ result2);
        int result3 = fc.sum(100);
        System.out.println("result3: "+ result3);  
        int result4 = fc.sum2(100);
        System.out.println("result4: "+ result4);
        int result5 = fc.sum3(10,20,30);	
        System.out.println("result5: "+ result5);
        
        
        Tv tv = new Tv();
        tv.brandname = "LG";
        
        fc.objMethod3(tv);
        
        
        
        
            
	}     
}
