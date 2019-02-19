import kr.or.bit.Book;
/*

생성자 함수(constructor): 초기화(member field) 함수
1.특수한 목적을 가지는 함수(초기화)
2.초기화(instance variable : member field)
 

일반함수와 다른점 
1. 함수의 이름이 고정(class 이름과 동일(반드시))
2. 생성자 함수는  return type(x), void(x): default void 
  why : 생성시점 .... 함수는 객체 생성과 동시에 호출 ..... 값을 넘길곳이 없다. 
  
  
  목적: 생성되는 객체마다 다른 초기값을 가지고 싶을때 
  
  생성자 함수: overloading 이 가능하다(param의 개수와 타입을 달리해서 가능)
  
  class Car{int door; Car(){door}}
  시점: Car c= new Car("color");
  1. Stack c 변수 > default > null 
  2. heap car 객체를 생성 > 영역 > 영역 안에 member field 로딩 > 
     > 생성자 함수 호출 (로딩된 멤버필드 초기화)
  3.class 생성시 default 생성자는 생략 가능
    (내가 직접 설계하지 않아도 컴파일러가 알아서 생성)

 Tip) 생성자 함수가 overloading 하지 않으면 글쎄요 ....  
 */
 
//class Car{
	//String name;	
	//당신이 직접구현 하지 않아도 컴파일러는 생성자가 있다고 가능
	//Car(){} 생략(default)
//}

class Car2{
	String name; 
	Car2() {// default constructor(생성자 함수)
		System.out.println("나는 생성자 함수");
		System.out.println("before: "+ name);
		name = "pony";
		System.out.println("after: "+ name);
	}
}	
	
class Car3{
	int number;
	// 권장사항 : 코드상에서 default 생성자는 일반적으로 생략한다. 
	Car3(){}		
}
	
class Car4{
	int door;
	int wheel;
	
	Car4(){
		//default
		System.out.println("default");	
	}
	Car4(int num){//overloading
		
		door = num;
		System.out.println("overloading door: "+ door);
		
	}
		
	Car4(int num, int num2){
		door = num;
		wheel = num2;
		System.out.println("overloading door, wheel:  "+ door+ ","+ wheel);
	}
	
	
}

class Apt2{
	
	String color;
	//default 사용하고 싶다면 ( 반드시 구현)
	Apt2(){}
	
	Apt2(String color){
		this.color = color;	
	}
	
}
// 클래스  생성시 오버로딩 생성자가 하나라도 존재한다면 디폴트 생성자는 자동 생성되지 않는다.( 컴파일러가 자동으로 만들지 않는다)
//why) 강제성(설계도) 에 강제성 부여 (나는 오버로딩을 강제 사용하게 ... )


public class Ex13_Constructor_Function {

	public static void main(String[] args) {
        //Car c = new Car(); 
        //Car2 c2 = new Car2();
        //Car3 c3 = new Car3();
		Car4 c4 = new Car4(); // default [호출해서 객체 생성] 
		System.out.println();
		Car4 c5 = new Car4(2);
		System.out.println();
		Car4 c6 = new Car4(2,3);
		
		Apt2 apt2 = new Apt2();
		Apt2 apt3 = new Apt2("gold");
		
		Book book = new Book("홍길동전", 10000);
		
	}

}
// 1. class 생성시 생성자 함수 구현하지 않으면 ... (default 생성자 자동 생성 )
//ex) class Tv{string name;}

//2.class 생성시 overloading 생성자 함수를 하나라도 구현 ... 
// default 생성자 사용할수 없다.
//강제적 구현 목적 
//ex) class Tv{String name; Tv(String n){name = n}}
//3.class 생성 default, overloading 둘다 구현 .. .
//ex) class Tv{String name;Tv(){} Tv(String n){name = n}}


