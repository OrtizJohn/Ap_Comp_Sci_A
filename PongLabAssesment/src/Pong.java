
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
//import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.Font;

//import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable {

	/**
	 * IF YOU WANT TO PLAY COLOR-CHANGING BALL TYPE 'c' IN "PLAY" INSTANCE IF
	 * YOU WANT TO PLAY REGULAR BALL TYPE 'r' IN "PLAY" INSTANCE
	 */

	char play = 'r';

	// instance variables
	private static final long serialVersionUID = 1L;

	private Ball ball;

	private Block block;
	private Paddle Paddle;
	private Wall leftWall;
	private Wall rightWall;
	private Wall bottomWall;
	private Wall topWall;

	private int timer = 0;

	private boolean[] keys;
	private BufferedImage back;
	private int Score;

	// starting position of ball
	private static final int BALL_Xi = 380;
	private static final int BALL_Yi = 265;

	public Pong() {
		createBall();

		// set up variables

		Paddle = new Paddle(350, 350, 40, 40, Color.BLUE, 4);
		for (int i = 0; i < 3; i++) {
			int ct = 0;
			if (ct == 1) {
				block.setY(block.getY() - 30);
			}
			for (int j = 0; j < 12; j++) {
				block = new Block();

			}
		}
		leftWall = new Wall(0, 0, 10, 550, Color.BLACK);
		rightWall = new Wall(760, 0, 10, 550, Color.BLACK);
		bottomWall = new Wall(0, 540, 770, 10, Color.BLACK);
		topWall = new Wall(0, 0, 770, 10, Color.BLACK);
		keys = new boolean[4];
		Score = 0;

		setBackground(Color.WHITE);
		setVisible(true);

		new Thread(this).start();
		addKeyListener(this); // starts the key thread to log key strokes
	}

	// REFACTORING METHODS
	public void createBall() {
		if (play == 'c')
			ball = new BlinkyBall(BALL_Xi, BALL_Yi, 10, 10, Color.RED, 3, 1);
		else if (play == 'r')
			ball = new Ball(BALL_Xi, BALL_Yi, 10, 10, Color.RED, 3, 1);
	}

	public void subIncSpeed() {
		timer++;
		if (timer == 4) {
			timer = 0;
		}
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		// set up the double buffering to make the game animation nice and
		// smooth
		Graphics2D twoDGraph = (Graphics2D) window;

		// take a snap shop of the current screen and save it as an image
		// that is the exact same width and height as the current screen
		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));

		// create a graphics reference to the back ground image
		// we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		// MOVEMENT FOR PADDLES
		if (keys[0] == true) {// move up
			Paddle.setY(Paddle.getY() - Paddle.getSpeed());
		}
		if (keys[1] == true) {// move down
			Paddle.setY(Paddle.getY() + Paddle.getSpeed());
		}

		if (keys[2] == true) {// move right player
			Paddle.setX(Paddle.getX() + Paddle.getSpeed());
		}
		if (keys[3] == true) {// move left player
			Paddle.setX(Paddle.getX() - Paddle.getSpeed());
		}
		
		// IF BALL COLLIDE Left and RIGHT WALL
				if (ball.didCollideRight(leftWall) || ball.didCollideLeft(rightWall)) {
					ball.setXSpeed(-ball.getXSpeed());

				}

				// IF BALL COLLIDE WITH TOP AND BOTTOM WALLS
				if (ball.didCollideTop(bottomWall) || ball.didCollideBottom(topWall)) {
					ball.setYSpeed(-ball.getYSpeed());

				}

				// IF BALL COLLIDE PADDLE
				if (ball.didCollideLeft(Paddle) || ball.didCollideRight(Paddle)) {
					ball.setXSpeed(-ball.getXSpeed());
				}
				if (ball.didCollideTop(Paddle) || ball.didCollideBottom(Paddle)) {
					ball.setYSpeed(-ball.getYSpeed());
				}
		
		// update objects
		ball.update(graphToBack);

		
		// CLEAR BACKGROUND
		graphToBack.clearRect(0, 0, TheGame.WIDTH, TheGame.HEIGHT);
		
		// draw lower wall
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(leftWall.getX(), leftWall.getY(), leftWall.getWidth(), leftWall.getHeight());
		graphToBack.fillRect(rightWall.getX(), rightWall.getY(), rightWall.getWidth(), rightWall.getHeight());
		graphToBack.fillRect(bottomWall.getX(), bottomWall.getY(), bottomWall.getWidth(), bottomWall.getHeight());
		graphToBack.fillRect(topWall.getX(), topWall.getY(), topWall.getWidth(), topWall.getHeight());

		// draw scoring
		graphToBack.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		graphToBack.clearRect(52, 556, 708, 248);
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawString("Blocks Left: " + Score, 120, 590);

		ball.draw(graphToBack, Color.RED);
		Paddle.draw(graphToBack);
		

		System.out.println(ball.getXSpeed() + " " + ball.getYSpeed());

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = true;
			break;
		case 'S':
			keys[1] = true;
			break;
		case 'D':
			keys[2] = true;
			break;
		case 'A':
			keys[3] = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = false;
			break;
		case 'S':
			keys[1] = false;
			break;
		case 'D':
			keys[2] = false;
			break;
		case 'A':
			keys[3] = false;
			break;
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	// PROGRAM RUNNER
	public void run() {
		try {
			while (true) {
				Thread.currentThread();
				Thread.sleep(8);
				repaint();
			}
		} catch (Exception e) {
			System.out.println("oops");
		}
	}
}