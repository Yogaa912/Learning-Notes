package com.mj.chapter10;

class Shared {
	private long refCount = 0;
	private static long counter = 0;
	private final long id = counter ++;
	Shared(){
		System.out.println("Creating" + this);
	}
	public String toString() {
		return "Shared" + id;
	}
	public void dispose() {
		if(--refCount == 0) {
			System.out.println("disposing shared" + this);
		}
	}
	public void refAdd() {
		refCount++;
	}
}

class Composing {
	private static long refCount = 0;
	private static long counter = 0;
	private final long id = counter ++;
	private Shared shared;
	Composing(Shared shared) {
		System.out.println("Creating" + this);
		this.shared = shared;
		shared.refAdd();
	}
	public void dispose() {
		System.out.println("disposing" + this);
		shared.dispose();
	}
	public String toString() {
		return "Composing" + id;
	}
}

public class ComposeShared {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] compose = {
			new Composing(shared),
			new Composing(shared),
			new Composing(shared),
			new Composing(shared),
			new Composing(shared)
		};
		for(Composing c:compose) {
			c.dispose();
		}
	}
}