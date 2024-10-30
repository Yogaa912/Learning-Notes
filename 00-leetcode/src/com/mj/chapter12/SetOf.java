package com.mj.chapter12;
import java.util.*;

public class SetOf {
	public static void main(String[] args) {
		// SetOfInteger
		Random rand = new Random(47);
		Set<Integer> intSet = new HashSet<>();
		for(int i = 0; i < 10000; i ++) {
			intSet.add(rand.nextInt(30));
		}
		System.out.println(intSet);
		// SetOfString
		Set<String> colors = new HashSet<>(); // 无序
		for(int i = 0; i <10; i ++) {
			colors.add("Yellow");
			colors.add("Red");
			colors.add("Blue");
			colors.add("Purple");
			colors.add("Black");
			colors.add("White");
		}
		System.out.println(colors);
		// SortedSetOfString 如果要对结果排序
		Set<String> sortedColors = new TreeSet<>();
		for(int i = 0; i <10; i ++) {
			sortedColors.add("Yellow");
			sortedColors.add("Red");
			sortedColors.add("Blue");
			sortedColors.add("Purple");
			sortedColors.add("Black");
			sortedColors.add("White");
		}
		System.out.println(sortedColors);
		// SetOperations
		Set<String> set1 = new HashSet<>();
		Collections.addAll(set1, "A,B,C,D,E,F,G,H,I,J,K,L".split(","));
		set1.add("M");
		System.out.println("H: " + set1.contains("H"));
		System.out.println("N: " + set1.contains("N"));
		Set<String> set2 = new HashSet<>();
		Collections.addAll(set2, "H,I,J,K,L".split(","));
		System.out.println("set2 in set1: " + set1.containsAll(set2));
		set1.remove("H"); // none
		System.out.println("set1: " + set1);
		set1.removeAll(set2);
		System.out.println("set2 removed from set1: " + set1);
		Collections.addAll(set1, "X,Y,Z".split(","));
		System.out.println("'X,Y,Z' added to set1: " + set1);
	}
}
