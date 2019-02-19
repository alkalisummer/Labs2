package kr.or.bit;
/*
책은 책이름과 가격을 가지고 있다.
책이 출판되면 반드시 책은 책의 이름과 가격을 가지고 있어야한다. 
책의 이름과 가격정보는 특정기능을 통해서만 볼수 있고  출판된 이후에는 수정할수 없다.
책이름과 가격정보는 각각 정보를 읽을수는 있다. 
 */




public class Book {

	private String bookName;
	private int bookPrice;
	
	public Book(String bookName,int bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	public void printInfo(){
		System.out.println("책의 이름: " +bookName+"책의 가격: "+bookPrice);
	}

	public String getBookName() {
		return bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}	
}





