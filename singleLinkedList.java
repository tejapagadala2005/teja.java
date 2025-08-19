package com;
class Node{
	int data;
	Node next;
	Node(int new_data){
		this.data=new_data;
		this.next=null;
	}
}
public class singleLinkedList {
	public static void traverselist(Node head) {
		while(head!=null) {
			System.out.println(head.data+"");
			head=head.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		head.next.next.next.next.next=new Node(60);
		traverselist(head);
	}

}
