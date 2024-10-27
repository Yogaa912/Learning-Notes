package com.mj.chapter10;

interface Game {
	void name();
	void play();
	boolean move();
}

interface GameFactory {
	Game getGame();
}

class Chess implements Game {
	private int moves = 0;
	private static final int MOVES = 4;
	@Override
	public void name() {
		System.out.println("This is Chess game");	
	}

	@Override
	public void play() {
		System.out.println("Play Chess game");
	}

	@Override
	public boolean move() {
		System.out.println("Chess move " + moves);
		return ++moves != MOVES;
	}
}

class Checkers implements Game {
	private int moves = 0;
	private static final int MOVES = 3;
	@Override
	public void name() {
		System.out.println("This is Checkers game");
	}

	@Override
	public void play() {
		System.out.println("Play Checkers game");	
	}

	@Override
	public boolean move() {
		System.out.println("Checkers move " + moves);
		return ++moves != MOVES;
	}
}

class ChessFactory implements GameFactory {

	@Override
	public Game getGame() {
		return new Chess();
	}
}

class CheckersFactory implements GameFactory {

	@Override
	public Game getGame() {
		return new Checkers();
	}
}

class Board {
	// 棋盘
	Board(Game g) {
		g.name();
		g.play();
		g.move();
	}
}

public class Games {
	public static void main(String[] args) {
		new Board(new CheckersFactory().getGame());
	}
}
