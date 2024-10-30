package com.mj.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _224_基本计算器 {
	// 逆波兰
    public int evalRPN(String[] tokens) {
    int v,w;
    Stack<Integer> stack = new Stack<>();
    for (String s : tokens) {
        if ("+".equals(s)) { // +
            v = stack.pop();
            w = stack.pop(); // "当前"数字
            stack.push(v+w);
        } else if ("-".equals(s)) {
            v = stack.pop();
            w = stack.pop(); 
            stack.push(w-v);
        } else if ("*".equals(s)) {
            v = stack.pop();
            w = stack.pop(); 
            stack.push(v*w);
        } else if ("/".equals(s)) {
            v = stack.pop();
            w = stack.pop(); 
            stack.push(w/v);
        } else {
            stack.push(Integer.valueOf(s));
        }
    }
    return stack.pop(); // 最终得分
    }
	public int calculate(String s) {
	    // 新建stack
		Stack<Character> stack = new Stack<>();
		List<String> input = new ArrayList<>();
	    // 中缀转后缀
	    for(char n : s.toCharArray()) {
	    	if(isNumber(n)) {
	    		input.add(Character.toString(n));
	    	} else if('(' == n) {
	            stack.push(n);
	        } else if(' ' == n) {
	            continue;
	        } else if('+' == n || '-' == n) {
	        	if(stack.isEmpty()) {
	        		stack.push(n);
	        	} else if('+' == stack.peek() || '-' == stack.peek()) {
	            	input.add(Character.toString(stack.pop()));
	                stack.push(n);
	            } else {
	            	stack.push(n);
	            }
	        } else if(')' == n) {
	        	while(stack.peek() != '(') {
	        		input.add(Character.toString(stack.pop()));
	        	}
                stack.pop();
	        } else {
	            //
	        }
	    }
	    String[] array = input.toArray(new String[0]);
		return evalRPN(array);
	}
	private boolean isNumber(char c) {
		return c >= '0' && c <= '9';
	}
}
