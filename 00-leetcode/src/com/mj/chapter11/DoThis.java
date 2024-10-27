package com.mj.chapter11;

public class DoThis {
	void f() {System.out.println("Do this f()");}
	
	public class Inner {
		public DoThis outer() {
			return DoThis.this;
		}
		public DoThis other() {
			return new DoThis();
		}
	}
	public Inner inner() {return new Inner();}
	public static void main(String[] args) {
		DoThis dt = new DoThis();
		DoThis.Inner in = dt.inner();
		DoThis.Inner in2 = dt.new Inner(); 
		in.other().f(); // 简简单单一个新的外部实例
		in.outer().f(); // 一个是当前内部实例所依附的外部实例
		
	}
}
