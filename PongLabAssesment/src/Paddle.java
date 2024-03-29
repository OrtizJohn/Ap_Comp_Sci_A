
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {
	// instance variables
	private int speed;

	public Paddle() {
		super(10, 10);
		setSpeed(5);
	}

	// add the other Paddle constructors
	public Paddle(int x, int y) {
		super(x, y);
		setSpeed(5);
	}

	public Paddle(int x, int y, int s) {
		super(x, y);
		setSpeed(s);
	}

	public Paddle(int x, int y, int w, int h, int s) {
		super(x, y, w, h);
		setSpeed(s);
	}

	public Paddle(int x, int y, int w, int h, Color col, int s) {
		super(x, y, w, h, col);
		setSpeed(s);
	}

	public void setSpeed(int s) {
		speed = s;
	}
	
	// add get methods
	public int getSpeed() {
		return speed;
	}

	public boolean equals(Object obj) {
		Paddle other = (Paddle) obj;
		return super.equals(other) && this.getSpeed() == other.getSpeed();
	}

	public String toString() {
		return super.toString() + " " + getSpeed();
	}

	// add a toString() method
}