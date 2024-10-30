package com.mj.chapter12;
import java.util.ArrayDeque;
import java.util.Deque;

public class Stack<T> {
	private Deque<T> storage  = new ArrayDeque<>();
	// what storage can do? peek push pop isEmpty
	public T peek() {
		return storage.peek();
	}
	public T pop() {
		return storage.pop();
	}
	public void push(T v) {
		storage.push(v);
	}
	public boolean isEmpty() {
		return storage.isEmpty();
	}
	@Override
	public String toString() {
		return storage.toString();
	}
	public static void main(String[] args) {
		Deque<Integer> stack  = new ArrayDeque<>();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.pop());
		Deque<String> stack2  = new ArrayDeque<>();
		for(String s : "My dogs has fleas".split(" ")) {
			stack2.push(s);
		}
		while(!stack2.isEmpty()) {
			System.out.println(stack2.pop());
		}
		// test Stack
		Stack<String> stack3 = new Stack<>();
		for(String s : "My dogs has fleas".split(" ")) {
			stack3.push(s);
		}
		while(!stack3.isEmpty()) {
			System.out.println(stack3.pop());
		}
	}
}
