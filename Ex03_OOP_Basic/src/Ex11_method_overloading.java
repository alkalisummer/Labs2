/*
��ü ���� ��� Ư¡ 
���, ĸ��ȭ, ������.... 

 ĸ��ȭ (����ȭ) -> private
 
 [method overloading]
 [�ϳ��� �̸�]���� [�������� ���]�� �ϴ� �Լ�
 ��� :  System.out.println() ��ǥ���� ��
 Ư¡: �����ε��� ������� ������ ���� �ʴ´�.
      why) ���ϰ� ������ ��� >> �����ڸ� ����
       ����� � ���� ��� : �Լ��� Ȱ���� ���� ���  
       
       
 ����: �Լ��� �̸��� ���� parameter�� [����]�� Ÿ���� �޸��ϴ� ��� 
 1. �Լ��� �̸��� ���ƾ� �Ѵ�.
 2. [parameter] ���� �Ǵ� [Type]�� �޶�� �Ѵ�.
 3. return  Type �� overloading�� �Ǵܱ����� �ƴϴ�.
 4. parameter ������ �ٸ��� ����... 
       
       

 */

class Human{
	String name; 
	int age; 	
}


class OverTest{
	int add(int i) {		
		return 100 +i;
	}



 /* String add(String j) {
	  return "hello"+j;
  }
  
  // void add(int k) {} (parameter type �浹)
  int add(int i, int j) {
	  return i+j;
  }
  
   void add(int i, String s) {
	   System.out.println("�����ε�");
   }
   
   void add(String s, int i) { // ������ �ٸ��� �����մϴ�.
	   System.out.println("�������� : overloading");
	   
   }
   */
   
   //�迭(Array) �������
   // int[] source = {1,2,3,4,5};
   int[] add (int[] param) {// parameter�� int �迭�� �ּҰ��� �ްڴ�. 
	   int[] target = new int [param.length];
	   for(int i =0; i<param.length;i++) {
		   target[i] = param[i]+1;
	   }
	   return target; // int Ÿ���� �迭�� �ּҰ��� return
   }
   
   
   
   
   
   
   
   
   
   void add(Human h) {// class == Type
	   h.name ="ȫ�浿";
	   h.age = 100;
	   System.out.println(h);
	   
	   
	   
   }
   
   
   
   
	int[] add(int[] so, int[] so2) {
		int sum = 0;
		int sum2 = 0;

		for (int i = 0; i < so.length; i++) {
			sum += so[i];
		}

		for (int i = 0; i < so2.length; i++) {
			sum2 += so2[i];
		}
		return sum > sum2 ? so : so2;
	}
   
   Human[] add(Human[] human) {
	   
	  Human[] h = new Human[human.length];
	  
	   return null;
	   
	   
   }
	
	
	
   
  
}
public class Ex11_method_overloading {

	public static void main(String[] args) {
       /* System.out.println();	
        
        OverTest ot = new OverTest();
         System.out.println(ot.add(100));
         //ot.add(3.1f); //add(float f) ����(x)
         ot.add(100, "H");
         
         Human h = new Human();
         ot.add(h);
         System.out.println(h.name);
         System.out.println(h.age);
         
         ot.add(new Human());
         
         */
        OverTest ot = new OverTest();
        //int Ÿ���� �迭�� �ּҸ� �־�� ...
        int[] source = {10, 20, 30, 40, 50};
        //System.out.println(source);
       int[] target = ot.add(source);
         //for(int i = 0; i < target.length;i++) {
        	// System.out.println(target[i]);
         //}
         
         int[] so = {1,2,3,4};
         int [] so2 = {4,6,7,8};
         
         
         int[] target2 = ot.add(so,so2);
         
         for(int i = 0; i < target2.length;i++) {
        	 System.out.println(target2[i]);
         }
         
         
         
         
	}

}
