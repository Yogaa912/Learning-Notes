package com.mj.chapter11;

import java.util.Random;

interface Selector {
	boolean end();
	Object current();
	void next();
}

public class Sequence {
	private int size;
	private int num;
	private Object[] items;
	Sequence(int size) {
		this.size = size;
		items = new Object[size];
		Random rand = new Random(47);
		for(int i = 0; i < size; i ++) {
			items[i] = rand.nextInt(9);
			System.out.println("The items are "+items[i]);
		}
	}
	class SequenceSelector implements Selector{

		@Override
		public boolean end() {
			return num >= size;
		}

		@Override
		public Object current() {
			return items[num];
		}

		@Override
		public void next() {
			if(!end()) num ++;
		}
	}
	public SequenceSelector selector() {
		return new SequenceSelector();
	}
	public static void main(String[] args) {
		Sequence sequence = new Sequence(4);
		Selector s = sequence.selector();
		while(!s.end()) {
			System.out.println("names are " + s.current());
			s.next();
		}
	}
}
