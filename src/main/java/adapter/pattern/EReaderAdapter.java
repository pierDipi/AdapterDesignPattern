package adapter.pattern;

/**
 * Convert the interface of a class into another expected interface. 
 * Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 * Now we can support electronic readable book through the eReaderInterface.
 */
public class EReaderAdapter implements BookInterface {

	EReaderInterface eReader;
	
	public EReaderAdapter(EReaderInterface eReader) {
		this.eReader = eReader;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void open() {
		this.eReader.turnOn();
	}

	/**
	 * {@inheritDoc}
	 */
	public void turnPage() {
		this.eReader.nextPage();;
	}
	
	

}
