package adapter.pattern;

/**
 * The Kindle class provide an implementation of EReaderInterface.
 */
public class Kindle implements EReaderInterface {

	private String name;
	
	private Integer page;
	
	public Kindle(String name) {
		this.name = name;
		page = 0;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void turnOn() {
		System.out.println("Turn on the kindle : " + name);
		page = 0;
	}

	/**
	 * {@inheritDoc}
	 */
	public void nextPage() {
		page++;
		System.out.println(name + ": go to the next page : " + page );
	}

}
