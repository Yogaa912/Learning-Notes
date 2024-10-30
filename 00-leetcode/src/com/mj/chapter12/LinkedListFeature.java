package com.mj.chapter12;
import java.util.*;
import com.mj.pets.*;

public class LinkedListFeature {
	public static void main(String[] args) {
		LinkedList<Pet> pets = new LinkedList<>(new PetCreator().list(5));
		System.out.println(pets);
		// Totally same
		System.out.println("pets.getFirsts() " + pets.getFirst());
		System.out.println("pets.element() " + pets.element());
		// only differs in return type 
		System.out.println("pets.peek() " + pets.peek());
		System.out.println("pets.remove() " + pets.remove());
		System.out.println("pets.removeFirst() " + pets.removeFirst());
		// Only differs in empty-list behavior:
	    System.out.println("pets.poll(): " + pets.poll());
	    System.out.println(pets);
	    pets.addFirst(new Rat()); // 在列表的开头插入了一个元素
	    System.out.println("After addFirst(): " + pets);
	    // pets.offer(Pets.get());
	    pets.offer(new Rat());
	    System.out.println("After offer(): " + pets);
	    // pets.add(Pets.get());
	    pets.add(new Rat());
	    System.out.println("After add(): " + pets);
	    pets.addLast(new Hamster());
	    System.out.println("After addLast(): " + pets);
	    System.out.println(
	      "pets.removeLast(): " + pets.removeLast());
	}
}
