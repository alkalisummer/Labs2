package kr.or.bit;
/*
å�� å�̸��� ������ ������ �ִ�.
å�� ���ǵǸ� �ݵ�� å�� å�� �̸��� ������ ������ �־���Ѵ�. 
å�� �̸��� ���������� Ư������� ���ؼ��� ���� �ְ�  ���ǵ� ���Ŀ��� �����Ҽ� ����.
å�̸��� ���������� ���� ������ �������� �ִ�. 
 */




public class Book {

	private String bookName;
	private int bookPrice;
	
	public Book(String bookName,int bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	public void printInfo(){
		System.out.println("å�� �̸�: " +bookName+"å�� ����: "+bookPrice);
	}

	public String getBookName() {
		return bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}	
}





