//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = 1.0*(fahrenheit - 32)*(5.0/9);
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.println(fahrenheit +" degrees Fahrenheit == " + getCelsius() + " degrees Celsius");
	}
}