package com;
import java.util.LinkedList;
import java.util.Queue;
public class queue_example {
	public static void main(String[] args) {
		Queue<Integer>Queue=new LinkedList<>();
		Queue.add(10);
		Queue.add(20);
		System.out.println("Queue:"+Queue);
		System.out.println("front elements:"+Queue.peek());
		System.out.println("removed:"+Queue.remove());
		System.out.println("queue after removed:"+Queue);
		System.out.println("polled"+Queue.poll());
		System.out.println("queue after poll:"+Queue);
		System.out.println("size:"+Queue.size());
		System.out.println("is Queue empty?"+Queue.isEmpty());
		}

}
