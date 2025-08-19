package com;
import java.util.Stack;
public class stack_example {
	public static void main(String[] args) {
		Stack<Integer>Stack=new Stack<>();
		Stack.push(10);
		Stack.push(20);
		Stack.push(30);
		Stack.push(40);
		System.out.println("stack:"+Stack);
		System.out.println("top elements:"+Stack.peek());
		System.out.println("popped:"+Stack.pop());
		System.out.println("stack after pop:"+Stack);
		System.out.println("positionmof 10:"+Stack.search(10));
		System.out.println("Is stack empty?"+Stack.isEmpty());
		System.out.println("size:"+Stack.size());
	}

}
