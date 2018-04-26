//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Laser extends Ammo 
{
	public Laser() {super();
	}

	public Laser(int x, int y) {
		super(x, y, 5);
	}

	public Laser(int x, int y, int s) {
		super(x,y,s);
	}

	public void draw(Graphics window) {
		window.setColor(Color.YELLOW);
		window.fillRect(getX(), getY(), 5, 15);
	}
}

