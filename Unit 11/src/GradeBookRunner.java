//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.io.File;
import java.io.FileNotFoundException;

public class GradeBookRunner
{
   public static void main( String args[] ) throws FileNotFoundException
   {
	     out.println("Welcome to the Class Stats program!");
	     Scanner keyboard = new Scanner(System.in);
	     System.out.print("What is the name of the class? ");
	     String className = keyboard.nextLine();
	     System.out.println();
	     System.out.print("How many students are in the class? ");
	     int numStudents = keyboard.nextInt();
	     System.out.println();
	     Class students = new Class(className, numStudents);
	     for(int i = 0; i < numStudents; i++)
	     {
	    	 System.out.print("Enter the name of student : ");
	    	 String studName = keyboard.nextLine();
	    	 System.out.print("Enter the grades for " + studName + "\nUse the format x-grades (2 - 100 100) : ");
	    	 String studInfo = keyboard.nextLine();
	    	 //System.out.println();
	    	 Student s = new Student(studName, studInfo);
	    	 students.addStudent(i,s);
	     }
	     System.out.println(students);
		 System.out.println("Failure List = " + students.getFailureList(70));
		 System.out.println("Highest Average = " + students.getStudentWithHighestAverage());
		 System.out.println("Lowest Average = " + students.getStudentWithLowestAverage());
		 System.out.println("Class Average = " + students.getClassAverage());
		
	}		
}