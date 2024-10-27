package com.mj.chapter12;
import java.util.*;
import com.mj.pets.*;

public class CrossCollectionIterator {
	public static void display(Iterator<Pet> it) {
		while(it.hasNext()) {
			Pet p = it.next();
			System.out.print(p.id() + " : " + p + " ");
		}
	}
	public static void main(String[] args) {
		List<Pet> pets = new PetCreator().list(8);
		LinkedList<Pet> petsLL = new LinkedList<>(pets);
		HashSet<Pet> petsHS = new HashSet<>(pets);
		TreeSet<Pet> petsTS = new TreeSet<>(pets);
		display(pets.iterator());
		display(petsLL.iterator());
		display(petsHS.iterator());
		display(petsTS.iterator());
	}
}
