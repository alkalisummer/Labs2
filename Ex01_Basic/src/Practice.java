import java.util.*;
public class Practice {

	public static void main(String[] args) {
         
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("원하시는 줄 수를 입력하세요: ");
	    int n = Integer.parseInt(sc.nextLine()); 
		
	    System.out.println("직각 삼각형");		
		for(int i = 0; i < n; i++ ) {
			for(int j = 0; j<=i;j++) {
			     	System.out.print("*");				
			}
                    System.out.println();						
		}
		
		System.out.println("역삼각형");	
		for(int i = n; i > 0 ;i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			 System.out.println();	
		}
		
		System.out.println("반대로 ");	
		for(int i = 0; i < n; i++ ) {
			for(int j = 1; j <= n; j++) {
			    if(j>=n-i) {
			    	System.out.print("*");
			    	
			    }else {
			    	System.out.print(" ");		
			    }
			}
                    System.out.println();						
		}
		
		
		
		System.out.println("피라미드");	
		for(int i = 0; i < n; i++ ) {
			for(int j = 1; j <= n; j++) {
			    if(j>=n-i) {
			    	System.out.print("*");
			    	
			    }else {
			    	System.out.print(" ");		
			    }
			}
			for(int k=1;k<=i;k++)
	    		System.out.print("*");
                    System.out.println();
           
              if(i == n-1) {
                 for(int p = n-1; p>0;p--) {
                	 for(int q = n; q>0;q--) {
                		 if(q<=p) {
                			 System.out.print("*");
                		 }else {
                			 System.out.print(" ");		
                		 }
                		                			 
                	 } 
                	 for(int k=p;k>1;k--)
         	    		System.out.print("*");
                	 System.out.println();	
                 }	
                 
            }
		}
		
		
		
 
		
		
		
}
}