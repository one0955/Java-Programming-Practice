package java2;

class Book{
	int states=0;   //returned =0 , borrowed=1
}
class Library{
	Book[] books=new Book[10];
	
	Library() {
		for(int i = 0; i<10;i++) {
			books[i] = new Book();
		}
	}
	void borrowBook(int n) {
		if(books[n-1].states==1) {
			System.out.println("error");
		}
		else books[n-1].states=1;
	}
	
	void returnBook(int n) {
		if(books[n-1].states==0) {
			System.out.println("error");
		}
		else books[n-1].states=0;
	}
}
public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		return;
	}

}
