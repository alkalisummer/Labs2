
public class Book {

	public String author;
	public String bookTitle;
	public String publisher;
	public String ISBN;
	public int price;
	public int pageNum;
	public int currentPage;
	public int totalPage;
     
	public String getAuthor() { //���ڸ� �о��
		
		return this.author;
	}
	
	public String getBookTitle() { // å�̸��� �о��
	
		return this.bookTitle;
	}
	
	public String getPublishier() {// ���ǻ縦 �о��

		return this.publisher;
	}
	
	public String getISBN() {// ISBN�� ������ �о��
		return this.ISBN;
	}
	
	public int getPrice() {// ISBN�� ������ �о��
		return this.price;
	}
	
	
	public int setPage(int page) {
		
		this.pageNum = page;
		return this.pageNum;
	}
	
	public void bookOpen(){
		
	   boolean read = true; 
	   System.out.println(currentPage+"�� ���� ������ �����մϴ�.");
		
	}
	
	public void bookClose(int pageNum){
		
		   int currentPage = pageNum;
		   boolean read = false; 
		   System.out.println("������ �����մϴ�.");
		   
		}
	
	public int next_Page(int pageNum) {
		
		this.pageNum = pageNum+1;
		return this.pageNum;
	}
	
public int pre_Page(int pageNum) {
		
		this.pageNum = pageNum-1;
		return this.pageNum;
	}

public void end_Page(int currentPage, int totalPage) {
	
	if (currentPage == totalPage)
		 System.out.println("������ ������ �Դϴ�.");
}
		
	}


