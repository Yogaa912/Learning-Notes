package com.mj.chapter11;

public class Parcel {
	class Contents {
		private String name;
		Contents(String name) {
			this.name = name;
		}
		public String getContent() {
			return name;
		}
	}
	class Destination {
		private String label;
		Destination(String label) {
			this.label = label;
		}
		public String whereTo() {
			return label;
		}
	}
	public Destination to(String label) {
		return new Destination(label);
	}
	public Contents is(String label) {
		return new Contents(label);
	}
	public void ship(String place, String name) {
		Destination d = to(place);
		Contents c = is(name);
		System.out.println("Parcel " + c.getContent() + " have been shipped, to " + d.whereTo() +".\n");
	}
	public static void main(String[] args) {
		Parcel p = new Parcel();
		p.ship("Tokyo", "Laptop");
	}
}
