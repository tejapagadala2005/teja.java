package com;
class node1{
	int data;
	node1 next;
	node1 prev;
	node1(int val){
		data=val;
		next=null;
		prev=null;
	}
}
public class backwardtraversal {
	public static void backward_traversal(node1 tail) {
		node1 curr=tail;
		while(curr!=null) {
			System.out.println(curr.data+" ");
			curr=curr.prev;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		node1 head=new node1(403);
		node1 second=new node1(406);
		node1 third=new node1(411);
		head.next=second;
		second.prev=head;
		second.next=third;
		third.prev=second;
		System.out.println("backward traversal:");
		backward_traversal(third);
		}

}


