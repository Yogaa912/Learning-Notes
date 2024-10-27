package com.mj.chapter11;

interface Destination {
	String readLabel();
}

interface Contents {
	int value();
}
public class Parcel2 {
	// 在这里面实现两个接口
	private class pContents implements Contents {
		private int i = 11;
		@Override
		public int value() {
			return i;
		}
	}
	protected final class pDestination implements Destination {
		private String label;
		pDestination(String whereTo) {
			label = whereTo;
		}
		@Override
		public String readLabel() {
			return label;
		}
	}
    public Destination destination(String s) {
        return new pDestination(s);
    }
    public Contents contents() {
        return new pContents();
    }
	public static void main(String[] args) {
		Parcel2 p = new Parcel2(); 
	}
}
