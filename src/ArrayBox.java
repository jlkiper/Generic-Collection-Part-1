
public class ArrayBox<T> implements BoxInterface<T>{

	private int capacity;//holds the capacity of the collection
	private final T[] box; //array to hold the objects in the collection
	private int numberOfEntries;//number of slots in the array that actually have an object
	
	/**
	 * Constructor checks to ensure capacity
	 * is at least 10; sets the capacity of the
	 * collection.
	 * @param capacity
	 */
	public ArrayBox(int capacity) {
		
		if(capacity>=10)
			this.capacity = capacity;
		else
			this.capacity = 10;
		
		box = (T[])new Object[capacity]; //cast warning - you can ignore.
		numberOfEntries = 0;//object has no entries at instantiation.
	}

	
	@Override
	public boolean add(T newEntry) {
		boolean result = true;
		
		if(isArrayFull()) {
			result = false;
		}
		else
		{
			box[numberOfEntries] = newEntry;
			numberOfEntries++;
		}
		return result;
	}

	@Override
	public T remove() {
		T result = box[numberOfEntries-1];
		box[numberOfEntries-1] = null;
		numberOfEntries--;
		return result;
	}

	@Override
	public int getCurrentSize() {
		
		return numberOfEntries;
	}

	@Override
	public boolean isEmpty() {
		return numberOfEntries == 0;
	}

	@Override
	public void clear() {
		while(!isEmpty())
			remove();
		
	}
	
	/**
	 * Method to see if underlying array is full.
	 * @return
	 */
	private boolean isArrayFull() {
		return numberOfEntries>=box.length;
	}
	
	/**
	 * Returns the capacity of the collection.
	 * @return
	 */
	public int getCapacity() {
		return capacity;
	}
	
}//end class
