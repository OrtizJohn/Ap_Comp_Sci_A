//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Guessing Game - How many numbers? ");
		int num = keyboard.nextInt();
		GuessingGame g = new GuessingGame(num);
		g.playGame();
		System.out.println(g);

		System.out.println("Do you want to play again");
		char response = keyboard.next().charAt(0);
		while (response != 'n'){
			System.out.println("Guessing Game - How many numbers? ");
			int num1 = keyboard.nextInt();
			GuessingGame g1 = new GuessingGame(num1);
			g1.playGame();
			System.out.println(g1);
			System.out.println("Do you want to play again");
			response = keyboard.next().charAt(0);
		}
		

		
		




	}
}