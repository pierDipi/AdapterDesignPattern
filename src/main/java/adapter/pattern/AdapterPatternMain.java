package adapter.pattern;

public class AdapterPatternMain {

	public static void main(String[] args) {

		Person person = new Person();
		
		person.read(new Book("Book"));		// Use compatible classes
		person.turnPage();
		person.turnPage();
		
		System.out.println("\n");
		
		// Adapter Pattern Usage
		person.read(new EReaderAdapter(new Kindle("Kindle book"))); // Use incompatible classes and adapt them.
		person.turnPage();
		person.turnPage();
		person.turnPage();
		
	}

}
