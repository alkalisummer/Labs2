package kr.or.bit;

public class Employee {
	private int empno;
	private String ename;
	private String job;
	
	public Employee () {// default constructor 
		empno = 9999;
		ename= "아무개";
		job = "인턴";
	}
	public Employee (int no, String name, String jobdata) {//overloading constructor
         empno= no;
         ename = name;
         job = jobdata;
	}
	

	public int getEmpno() {// read: getter
		return empno;
	}

	public void setEmpno(int empno) {//write : setter
		this.empno = empno;
	}

	public String getEname() {
		return ename + " 님 "; // 강제 ... 
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
// 일반 함수 
	public void employeeInfoPrint() {
		System.out.printf("사번: [%d], 이름:[%s], 직종[%s]\n",empno,ename,job);
		
	}
	
	
}
