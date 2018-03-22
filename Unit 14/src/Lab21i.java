//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner chop = new Scanner(new File("C:\\Users\\ortizj4473\\Desktop\\JohnOrtizAp-Compsci-REAL\\Unit 14\\src\\lab21i.dat"));
		while (chop.hasNextLine()){
			int num = chop.nextInt();
			chop.nextLine();
			String s = chop.nextLine();
			Maze m1 = new Maze(num,s);
			System.out.println(m1);
		}
		
		
	}
}