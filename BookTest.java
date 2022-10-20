package com.exception.bll;

public class BookTest {
	public static void main(String[] args) {

		//Create 5 book objects
		Book book1 = new Book(1,"Let Us C");
		Book book2 = new Book(2,"Learn C the Hard Way");
		Book book3 = new Book(3,"Getting Inside JAVA");
		Book book4 = new Book(4,"Basic Computer");
		Book book5 = new Book(5,"Operating System");
		
		//Store all books details in books array
		Book books[] = {book1,book2,book3,book4,book5};
		
		//Find book By Id
		try {
			if(findById(books,5)) {
				System.out.println("Book is present");
			}
			else{
				throw new BookNotFoundException("Book with the given id is not present");
			}
		}catch(BookNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//Function for search book
	public static boolean findById(Book[] books , int id) {
		for(Book b:books) {
			if(b.getId()==id)
			return true;
		}
		return false;
	}
}


