package com.mj.chapter10;

import java.util.Arrays;

class processor {
	public String name() {
		return getClass().getSimpleName();
	}
	public Object process(Object s) {
		return s;
	}
}

class upperProcessor extends processor{
	@Override
	public Object process(Object s) {
		return ((String)s).toUpperCase();
	}
}

class lowerProcessor extends processor{
	@Override
	public Object process(Object s) {
		return ((String)s).toLowerCase();
	}
}

class splitProcessor extends processor{
	@Override
	public Object process(Object s) {
		return Arrays.toString(((String)s).split(" "));
	}
}

public class ProcessString {
	public static void applyProcessor(processor p, Object s) {
		System.out.println("The processor is " + p.name());
		System.out.println("The result is " + p.process(s));
	}
	public static void main(String[] args) {
		String s = "To be or not to be ,that is a question.";
		applyProcessor(new upperProcessor(), s);
		applyProcessor(new lowerProcessor(), s);
		applyProcessor(new splitProcessor(), s);
	}
}
