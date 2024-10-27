package com.mj.chapter12;
import java.util.*;
import com.mj.pets.*;

public class SimpleIterator {
	public static void main(String[] args) {
		// 新建一个Pet List
		List<Pet> pets = new PetCreator().list(12);
		Iterator<Pet> it = pets.iterator(); // 一个Pet类型的iterator，通过刚刚生成的pets实例对象来调用生成，绑定在pets上？
		while(it.hasNext()) {
			Pet p = it.next();
			System.out.println(p.id() + " : " + p + " ");
		}
		for(Pet p : pets) {
			System.out.println(p.id() + " : " + p + " ");
		}
		it = pets.iterator(); // 重置一下
		for(int i = 0; i < 6; i ++) {
			it.next();
			it.remove();
		}
		System.out.println(pets);
	}
}
