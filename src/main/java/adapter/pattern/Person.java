/**
 * 
 */
package adapter.pattern;

/**
 * A person can read a book and then turn page of the book.
 */
public class Person {
	
	BookInterface book;
	
	public void read(BookInterface book) {
		setBook(book);
		book.open();
	}
	
	/**
	 * Turn the page of the book
	 * @throws UnsupportedOperationException if this didn't read a book yet.
	 */
	public void turnPage() throws UnsupportedOperationException {		
		if(book == null)
			throw new UnsupportedOperationException("First you should read a book");
		
		book.turnPage();
	}
	
	protected void setBook(BookInterface book) throws IllegalArgumentException {
		
		if(book == null)
			throw new IllegalArgumentException("The book argument mustn't be a null object");
		
		this.book = book;
	}
}
