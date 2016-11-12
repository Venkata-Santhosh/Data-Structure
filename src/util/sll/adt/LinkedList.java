package util.sll.adt;
/**
 * 
 * @author VenkataSanthosh
 *
 * Linked List is a data structure used for storing collection of data
 * 
 * @param <T>
 */
public interface LinkedList<T>{
	
	 void insertData(T node);
	 void insertDataAt(T nodeData,int position);
	 void displayData();
	 void reverseList();
	 T[] toArray(T[] array);
	 void deleteDataAt(int position);
	 int size();
	 
}