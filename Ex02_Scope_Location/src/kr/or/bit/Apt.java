package kr.or.bit;

public class Apt { 
	
	public String aptname; // default
	 int door;//default
	 private int window;// 캡슐화, 은닉화 
	 
	 //간접할당
	 //직접할당을 막고 간접할당을 통한 데이터 보호 
	 
	 public void write_window(int w) {// 캡슐화된 자원에 write 함수
		 if(w ==0) {
			 window = 100;
		 }else {
		 window = w;
	 }
	 }
	 public int read_window() { //캡슐화된 자원에 read 함수
		 return window;
		 
		 
	 }
}
