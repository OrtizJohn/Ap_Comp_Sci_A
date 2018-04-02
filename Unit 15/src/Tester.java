//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;
import java.awt.Component;

public class Tester extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Tester()
	{
		super("PONG TESTER");
		setSize(WIDTH,HEIGHT);
		
		
	
		
		PaddleTestTwo padTest = new PaddleTestTwo();
		((Component)padTest).setFocusable(true);			
		getContentPane().add(padTest);
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		Tester run = new Tester();

	}
}