
public interface BoxInterface<T> {

	/**
	 * Add new entry to the collection
	 * @param newEntry
	 * @return
	 */
	public boolean add(T newEntry);
	
	/**
	 * Remove an element from the collection.
	 * @return
	 */
	public T remove();

	/**
	 * Get number of elements in the collection.
	 * (Not size of underlying data structure)
	 * @return
	 */
	public int getCurrentSize();
	
	/**
	 * Check to see if collection is empty.
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * Clear all elements out of the collection
	 */
	public void clear();
	
}//end interface
