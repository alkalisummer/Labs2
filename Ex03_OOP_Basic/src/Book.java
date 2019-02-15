
public class Book {

	public String author;
	public String bookTitle;
	public String publisher;
	public String ISBN;
	public int price;
	public int pageNum;
	public int currentPage;
	public int totalPage;
     
	public String getAuthor() { //저자를 읽어옴
		
		return this.author;
	}
	
	public String getBookTitle() { // 책이름을 읽어옴
	
		return this.bookTitle;
	}
	
	public String getPublishier() {// 출판사를 읽어옴

		return this.publisher;
	}
	
	public String getISBN() {// ISBN의 정보를 읽어옴
		return this.ISBN;
	}
	
	public int getPrice() {// ISBN의 정보를 읽어옴
		return this.price;
	}
	
	
	public int setPage(int page) {
		
		this.pageNum = page;
		return this.pageNum;
	}
	
	public void bookOpen(){
		
	   boolean read = true; 
	   System.out.println(currentPage+"쪽 부터 독서를 시작합니다.");
		
	}
	
	public void bookClose(int pageNum){
		
		   int currentPage = pageNum;
		   boolean read = false; 
		   System.out.println("독서를 종료합니다.");
		   
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
		 System.out.println("마지막 페이지 입니다.");
}
		
	}


