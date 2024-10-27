package com.mj.chapter12;
import java.util.*;
import com.mj.pets.*;

public class AddingGroup {
	public static void main(String[] args) {
		Collection<Integer> collect = new ArrayList<>(Arrays.asList(1,2,3,4,5)); // 使用Arrays.asList()来直接添加元素列表
		Integer[] in = {2,3,4,5,6}; // 一个封装类型数组
		Collections.addAll(collect, in); // 返回值是boolean，这里是将一串数组/分割好的列表加入到已经有的Collection类型中
		Collections.addAll(collect, 12,13,14,15);
		// next example
		Random rand = new Random(47);
		List<Pet> pets = new PetCreator().list(7); // 调用PetCreator()，新生成一个对象，调用这个对象的方法list(7)，生成pets对象，类型是Pet List
		System.out.println("1: " +  pets);
		Hamster h = new Hamster();
		pets.add(h); // Automatically resize as it is list
		System.out.println("2: " + pets);
		System.out.println("3: " + pets.contains(h)); // return boolean, from list
		pets.remove(h); // remove object
		Pet p = pets.get(2); // get object using index
		System.out.println("4: " + p + " the index is " + pets.indexOf(p));
		Pet cymric = new Cymric();
		System.out.println("5: " + pets.indexOf(cymric)); // object does not contained in Pets list
		System.out.println("6: " + pets.remove(cymric));
		System.out.println("7: " + pets.remove(p));
		System.out.println("8: " + pets);
		pets.add(3, new Mouse());
		System.out.println("9: " + pets);
		List<Pet> sub = pets.subList(1,4);
		System.out.println("10: " + pets.containsAll(sub));
		Collections.sort(sub);
		System.out.println("sorted list is " + sub);
		System.out.println("11: " + pets.containsAll(sub)); // 说明检查有没有不看顺序
		Collections.shuffle(sub, rand);
		System.out.println("shuffled sublist: " + sub);
		System.out.println("12: " + pets.containsAll(sub));
		@SuppressWarnings("rawtypes")
		List<Pet> copy = new ArrayList(pets); // 通过用pets创建一个新的ArrayList来再生成一个Pet List
		sub = Arrays.asList(pets.get(1), pets.get(4)); // asList用来将elements重新组成list
		System.out.println("sub " + sub);
		copy.retainAll(sub); // 除了sub以外的元素全删
		System.out.println("13: " + copy);
		copy = new ArrayList<>(pets); // a new copy
		copy.remove(2);
		System.out.println("14: " + copy);
		copy.removeAll(sub);
		System.out.println("15: " + copy);
	} 
}
