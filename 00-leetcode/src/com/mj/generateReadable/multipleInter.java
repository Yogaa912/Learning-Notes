package com.mj.generateReadable;
import java.nio.CharBuffer;
import java.util.Scanner;

public class multipleInter implements RandomDoubles, Readable {
	private int count;
	public multipleInter(int count) {
		this.count = count;
	}
	RandomDoubles rd = new RandomDoubles(){};
	@Override
	public int read(CharBuffer cb) {
		if(count-- == 0) {
			return -1;
		}
		String result = Double.toString(rd.next()) + " ";
		cb.append(result);
		return result.length();
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(new multipleInter(10));
		while(s.hasNextDouble()) {
			System.out.println(s.nextDouble());
		}
	}

}
