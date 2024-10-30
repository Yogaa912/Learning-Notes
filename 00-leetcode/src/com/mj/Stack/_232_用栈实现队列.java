package com.mj.Stack;
import java.util.Stack;

public class _232_用栈实现队列 {
	private Stack<Integer> inStack;
	private Stack<Integer> outStack;
	public _232_用栈实现队列() {
		inStack = new Stack<>();
		outStack = new Stack<>();
	}
	public void push(int x) {
		inStack.push(x);
	}
	public int pop() {
		int peek = peek();
		outStack.pop();
		return peek;
	}
	public int peek() {
		if(!outStack.isEmpty()) return outStack.peek();
		if(inStack.isEmpty()) return -1;
		while(!inStack.isEmpty()) {
			outStack.push(inStack.pop());
		}
		return outStack.peek();
	}
	public boolean empty() {
		return inStack.isEmpty() && outStack.isEmpty();
	}
}
