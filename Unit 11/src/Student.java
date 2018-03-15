//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student implements Comparable<Student>
{
	private String myName;
	private Grades myGrades;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		myGrades = new Grades(gradeList);
		setName(name);
		setGrades(gradeList);
	}
	
	public void setName(String name)
	{
		myName = name;


	}	
	
	public void setGrades(String gradeList)
	{
		myGrades.setGrades(gradeList);
	
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot,grade);


	}

	public String getName()
	{
		
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		return (myGrades.getSum())/(myGrades.getNumGrades());
	}

	public double getAverageMinusLow()
	{
		double dif = myGrades.getSum() - myGrades.getLowGrade();
		return dif/(myGrades.getNumGrades()-1);
	}
	
	public double getHighGrade()
	{
		
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
	public String toString()
	{
		String output = "";
		output += getName() + " = " + myGrades;
		return output;
	}

	
	public boolean equals(Student s){
		if (s.getAverage() == this.getAverage() && s.getName().equals(this.getName())){
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Student s ){
		if (s.getAverage() == this.getAverage()){
			return 0;
		}
		else if (s.getAverage() < this.getAverage()){
			return 1;
		}
		else{
			return -1;
		}
	}

	
}
