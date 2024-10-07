package datastructure.collections.linkedlist;

public class LinkedListDemo {
	
	private static LinkedList list = new LinkedList();
	
	public static void main(String[] args) {
		
		insert();
		length();
		deleteFromHead();
		length();
		findByData();
	}
	
	public static void insert() {

		list.insertAtHead(0);
		list.insertAtHead(10);
		list.insertAtHead(11);
		list.insertAtHead(12);
		list.insertAtHead(13);
		list.insertAtHead(14);
		list.insertAtHead(16);
		list.insertAtHead(180);
		list.insertAtHead(9800);
		list.insertAtHead(124);
		System.out.println(list);
	}
	
	public static void length() {
		System.out.println(list.length());
	}
	
	public static void deleteFromHead() {
		list.deleteFromHead();
		System.out.println(list);
	}
	
	public static void findByData() {
		System.out.println(list.find(10));
		System.out.println(list.find(109));

	}

}
