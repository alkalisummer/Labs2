package kr.or.bit;
/*
 �䱸��������
 Tv�� ä�� ������ ������ �ִ�(���� ��� 1-250ä��)
 Tv �귣�� �̸��� ������ �ִ�(���� ��� �Ｚ, ����) 
 Tv�� ä�� ��ȯ����� ������ �ִ�.(ä���� ������ �� �ִ� �Ѵܰ辿)
 ��� 2��(++, --)
 tv�� ���������� ������ �ִ�.
 tv�� ������ on �Ҽ��� �ְ� off �Ҽ��� �ִ�.
 
 
 */

public class Tv {
	
	public int ch;//public int ch=1;
    public String brandname;
    public boolean power;
	  
	public void ch_up() {
		//member field ���� ��
	    ch++;	
	}
	
	public void ch_down() {
		//member field ���� ��
	    ch--;	
	}
	
   public void power_on() {
	   
         power = true;  
	   
   }
   
   public void power_down(){
	   
       power = false; 
	   
 }
   
}
