import kr.or.bit.Person;
import kr.or.bit.Tv;

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		Person person ; //Stack ������ 4byte ����� (person) null
		person = new Person();// Heap �޸𸮿� Person ��ü ����� person ������ �ּҰ��� �Ҵ� 
         System.out.println("person: "+person);
		
         person.name = "ȫ�浿";
         person.age = 100;
         person.print();
         
         Person person2 = new Person();// ����� �Ҵ� 
         person2.name = "������";
         person2.age = 120;
         person2.print();
         
         //person, person2 (���� Ÿ��: Ref Type)
         
        int num = 100; // main �Լ� �ȿ� �ִ� local variable( �ݵ�� �ʱ�ȭ) 
         System.out.println("��Ÿ��: " + num );//(value Type)
         
         Person you; // ����Ÿ��(Ref Type) �ʱ�ȭ�� �ּҰ��� ���� �� 
         //1. ���������� �ʱ�ȭ(new ������)
         //you = new Person();
         
        // 2. �ٸ� ���� ������ ������ ���� �Ҵ�
           you = person;// person�� you �� ���Ű� ����  
         System.out.println("you: " + you);
         System.out.println("person: " + person);
	     System.out.println(you == person);
	     
	     Tv t = new Tv();
	     
	     t.brandname = "�Ｚ";
	     
	      System.out.println("�⺻ä��: "+ t.ch);//0
          System.out.println("�귣���: "+ t.brandname);//String�� ����Ʈ ���� null
          System.out.println("��������: "+ t.power);
          t.power_on(); //ȣ���Ѵ�(�Լ��� �̸��� �ҷ��־����� ����)
          System.out.println("��������: "+ t.power);
          
          
          
          t.ch_up();
          t.ch_up();
          t.ch_up();
	      System.out.println("����� ä��: " + t.ch);
	      t.ch_down();
	      System.out.println("����� ä��: " + t.ch);

}
}