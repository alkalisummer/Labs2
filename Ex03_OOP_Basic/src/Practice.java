
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
	    
	    int numOfApples = 145; // ����� ����
	    int sizeOfBucket = 10; // �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
	    
	    int numOfBucket = numOfApples/sizeOfBucket == 0 ? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket +1;
	    
	    
	    System.out.println("�ʿ��� �ٱ����� �� : "+numOfBucket);
	
       	
	
	
	
	
	
	}
	
	
}
