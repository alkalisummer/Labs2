import java.util.Scanner;
public class Calcul {

	public static void main(String[] args) {
		int num, sw = 0;
		int unit = 10000;
		int money;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요: ");
		money = Integer.parseInt(sc.nextLine());
		
		while(unit>= 1) {
		num = (int)(money/unit);
		System.out.printf(" %d 원,  %d개 \n", unit, num);
	    money = money - unit *num ;
		if(sw == 0) {
			unit = unit/2;
			sw = 1;
		}else {
			unit = unit/5;
			sw = 0;	
		}
		}
	}
	
	}


