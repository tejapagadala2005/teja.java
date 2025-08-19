package com;
class node{
	int data;
	node next;
	node prev;
	node(int val){
		data=val;
		next=null;
		prev=null;
	}
}
public class forwardtraversal{
	public static void forward_traversal (node head) {
		node curr=head;
		while(curr!=null) {
			System.out.println(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		node head=new node(403);
		node second=new node(406);
		node third=new node(411);
		head.next=second;
		second.prev=head;
		second.next=third;
		third.prev=second;
		System.out.println("forward traversal:");
		forward_traversal(head);
		}

}
