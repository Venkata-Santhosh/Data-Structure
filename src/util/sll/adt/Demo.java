package util.sll.adt;

class Box{
	private int length;
	private int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
}
public class Demo {

	public static void main(String[] args) {
		
				LinkedList<Integer> inte = new SinglyLinkedList<>();
				inte.insertData(9);
				inte.insertData(12);
				inte.insertData(12);
				inte.insertData(6);
				inte.insertData(7);
				inte.insertData(8);
				inte.insertDataAt(2, 2);
				inte.displayData();
				inte.reverseList();
				
				Integer[] a = inte.toArray(new Integer[inte.size()]);
				System.out.println(a[2]);
				LinkedList<String> stringData = new SinglyLinkedList<>();
				stringData.insertData("hello");
				stringData.insertData("hello hf");
				stringData.displayData();

		
		Box box1  = new Box();
		box1.setLength(20);
		box1.setWidth(10);
		Box box2 = box1;
		Box box3 = new Box();
		box3.setLength(1000);
		box3.setWidth(3000);
		box2.setWidth(30);
		System.out.println(box2.getWidth());
		box2 = box3;
		System.out.println(box2.getWidth());
		System.out.println(box1.getWidth());
		
		Box b = null;
		Box c = b;
		c = new Box();
		c.setLength(203);
		c.setWidth(30);
	//	System.out.println(b.getLength());

	}
}
