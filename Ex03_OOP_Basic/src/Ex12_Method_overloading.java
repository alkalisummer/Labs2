	class Man{
		String name;
		int age;
	}

   class Test{
	 Man add(Man m) {
		m.name = "누구";
	    m.age = 10;
	    return m;		
			}
	 
	 Man add(Man x, Man y) {
			y.name = x.name;//null
			y.age = x.age; // 0
			return y;
		}
		}



public class Ex12_Method_overloading {
	
	
   
   
   
 
	

	public static void main(String[] args) {
		
		Test t = new Test();
		Man man = new Man();
		Man man2 = t.add(man);
		System.out.println(man2.name+"/" + man2.age);
		
		System.out.println(man == man2);

		
		Man man3 = t.add(man, man2);
		System.out.println(man3.age +"/"+ man3.name);
		
	}
	
	//return Type 또는 parameter 자원으로 사용
	//1.8가지 기본타입
	//2.String : String m(String str) {return...}
	//3.Array: int[] m (int[] arr){return...}
	//4. 사용자 정의 클래스(TYPE) : Man m(Man s){return...}
	
}
