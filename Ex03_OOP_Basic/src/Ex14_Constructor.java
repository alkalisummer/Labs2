import kr.or.bit.Employee;

public class Ex14_Constructor {

   
	
	
	public static void main(String[] args) {
		
		Employee emp = new Employee(); //default
		emp.employeeInfoPrint();
		System.out.println(emp.getEname());
		
		Employee emp2 = new Employee(201901, "홍길동", "영업팀");
		emp2.employeeInfoPrint();
		System.out.println(emp2.getEname());
	    emp2.setJob("IT 개발팀");
	    emp2.employeeInfoPrint();
	    
	    Employee emplist[] = {new Employee(1,"A","IT"),
	    		new Employee(2,"B","IT"),
	    		new Employee(3,"C","IT")
	    };
	    for(Employee e:emplist )
	        e.employeeInfoPrint();
	    
	    
	    
	    
	   
	    //Array 를 사용해서 사원 3명을 만들기 
	    //객체 배열 ( 8가지 기본타입 + String +Array+ 사용자 정의 클래스)
	    
	    
	    
	    
	    
	}

}
