
public class Practice {

	static int cv;
	public int i;
	
	public static void main(String[] args) {
	
	Practice.cv = 4;
	Practice p = new Practice();
	p.i = 4;
	
	
	 
	 
	 
	 
		
	   char ch = 'C';
		
	   char lowerCase = ch <= 90 ? (char)((int)ch+32) : ch; 
		
	    System.out.println("ch: "+ lowerCase );
	    
	    int numOfApples = 145; // 사과의 개수
	    int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
	    
	    int numOfBucket = numOfApples/sizeOfBucket == 0 ? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket +1;
	    
	    
	    System.out.println("필요한 바구니의 수 : "+numOfBucket);
	
       	
	
	
	
	
	
	}
	
	
}
