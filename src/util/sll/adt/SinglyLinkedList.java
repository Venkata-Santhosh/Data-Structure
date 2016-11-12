package util.sll.adt;

/**
 * 
 * @author VenkataSanthosh
 * SinglyLinkedList is one type of LinkedList
 * @param <T>
 */
public class SinglyLinkedList<T> implements LinkedList<T> {
	/**
	 * Node class 
	 * @author VenkataSanthosh
	 *
	 */
	class Node{
		T data;
		Node nextNode;
	}
	
	private Node headNode;
	/**
	 * Constructor 
	 */
	public SinglyLinkedList() {
		headNode = null;
	}
	/**
	 * insert data at the ends
	 */
	@Override
	public void insertData(T nodeData) {
		Node newNode;
		if(nodeData!=null)
		{
			newNode = new Node();
			newNode.data = nodeData;	
		}else{
			return;
		}
		if(headNode == null){
			headNode = newNode;
		}else{
			Node temp = headNode;
			while(temp.nextNode!=null){
				temp = temp.nextNode;
			}
			temp.nextNode  = newNode;
		}
	}
	
	/**
	 * Display collection of objects
	 */
	@Override
	public void displayData() {
		Node currentNode = headNode;
		while(currentNode!=null){
			System.out.println(currentNode.data);
			currentNode = currentNode.nextNode;
		}
	}

	/**
	 * reverse display
	 * doesnt have any change to original linked list
	 */
	@Override
	public void reverseList() {
		Node reverseTemp  = headNode;
		reverseDisplay(reverseTemp);
	}

	private void reverseDisplay(Node headNode){
		if(headNode!=null){
			reverseDisplay(headNode.nextNode);
			System.out.println(headNode.data);
		}else{
			return;
		}
	}

	/**
	 * insert data at particular position
	 */
	@Override
	public void insertDataAt(T nodeData, int position) {
		Node newNode;
		if(nodeData!=null){
			newNode = new Node();
			newNode.data = nodeData;
		}else{
			return;
		}
		if(position == 1){
			newNode.nextNode = headNode;
			headNode = newNode;
		}else{
			int positionCount = 0;
			Node temp = headNode;
			Node prev = null;
			while(temp!=null && positionCount < position - 1){
				positionCount++;
				prev = temp;
				temp = temp.nextNode;
			}
			if(temp == null){
				prev.nextNode = newNode;
				newNode.nextNode = null;
			}else{
				prev.nextNode = newNode;
				newNode.nextNode = temp;
			}
		}
		
		
	}

	/**
	 * delete data at particular position
	 */
	@Override
	public void deleteDataAt(int position) {
		
		Node temp = headNode;
		Node prev = null;
		int count = 0;
		if(position == 1){
			Node temp1 = temp.nextNode;
			headNode = null;
			headNode = temp1;
			
		}else{
			while(temp!=null && count <position - 1){
				count++;
				prev = temp;
				temp = temp.nextNode;
			}
			if(temp==null){
				System.out.println("No data found");
			}else{
				prev.nextNode = temp.nextNode;
			}
		}
		
		
	}
	/**
	 * @return size
	 */
	@Override
	public int size() {
		Node currentNode = headNode;
		int count = 0;
		while(currentNode!=null){
			count++;
			currentNode = currentNode.nextNode;
		}
		return count;
	}

	/**
	 * converts singly linked list to array
	 * @param T[] array 
	 * @return T[] 
	 */
	@Override
	public T[] toArray(T[] array) {
		
		Node temp = headNode;
		int count =0;
		while(temp!=null && count < array.length)
		{
			array[count++] = temp.data;
			temp = temp.nextNode;
		}
		return array;
	}
	
}
