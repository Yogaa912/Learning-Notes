package com.mj.chapter10;

class Glyph {
	Glyph() {
		System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
	}
	public void draw() {
		System.out.println("draw");
	}
}
class RoundGlyph extends Glyph {
	private int radium = 1;
	RoundGlyph(int r) {
		radium = r;
		draw();
		System.out.println("Creating RoundGlyph with r = " + radium);
	}
	public void draw() {
		System.out.println("draw RoundGlyph");
	}
}
public class ComposeRound {
	public static void main(String[] args) {
		new RoundGlyph(3);
	}
}
