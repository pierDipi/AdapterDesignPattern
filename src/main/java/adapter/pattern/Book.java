package adapter.pattern;

/**
 * The book class provide an implementation of book interface.
 */
public class Book implements BookInterface {

	private String name;
	
	private Integer page;
	
	public Book(String name) {
		this.name = name;
		page = 0;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void open() {
		System.out.println("Open the book : " + name);
		page = 0;
	}

	/**
	 * {@inheritDoc}
	 */
	public void turnPage() {
		page++;
		System.out.println(name + ": go to the next page : " + page);		
	}

}
