//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		setTriangle(0," ");
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(count,let);
	}

	public void setTriangle( int sz, String let)
	{
		size =sz;
		letter= let;
	}

	public String getLetter()
	{
		for (int i = 0; i <size+1; i++){
			
		}
		return "#";
	}

	public String toString()
	{
		String output="";
		return output+"\n";
	}
}