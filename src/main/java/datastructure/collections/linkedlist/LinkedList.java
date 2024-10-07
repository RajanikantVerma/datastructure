package datastructure.collections.linkedlist;

public class LinkedList {
	
	private Node head;
	
	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(head);
		this.head = newNode;
	}
	
	public int length() {
		int len = 0;
		
		Node current = this.head;
		while(current!= null) {
			len++;
			current = current.getNextNode();
		}
		return len;
	}
	
	public void deleteFromHead() {
		this.head= this.head.getNextNode();
	}
	
	public Node find(int data) {
		Node current = this.head;
		
		while(current!=null) {
			if(current.getData()==data)
				return current;
			current = current.getNextNode();
		}
		return null;
	}

	@Override
	public String toString() {
		String result = " LinkedList { ";
		
		Node current = this.head;
		while(current!= null) {
			result += current.toString() + " ,";
			current = current.getNextNode();
		}
		result += "}";
		return result;
	}
	
	

}
