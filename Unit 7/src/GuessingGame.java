//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int count;
	private double percent;
	private int answer;


	public GuessingGame(int stop)
	{
		upperBound = stop;


	}

	public void playGame()
	{
		count = 0;
		Scanner keyboard = new Scanner(System.in);
		answer = (int) (Math.random()*upperBound+ 1);
		System.out.println("Enter a number between 1 and " + upperBound);
		int guess = keyboard.nextInt();
		while (guess != answer){
			count += 1;
			System.out.print("Enter a number between 1 and " + upperBound);
			guess = keyboard.nextInt();
			if (guess < 1 || guess > upperBound){
				System.out.println("Number out of range!!!!");
			}
		}
		count ++;
		percent = 100-(1.0/(count) * 100.0);


	}

	public String toString()
	{
		String output="It took " + count + " guesses to guess " + answer + "\n" + "You guessed wrong " + percent + "% of the time." ;
		return output;
	}
}