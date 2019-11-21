
package gropProject;


import javax.swing.*;// gives us access 

//this will be the main driver of the program
public class gradeAnalyzer
{

	public static void main(String args[])
	{
		int low=0;//lowest possible grade
		int high=100;//Highest possible grade

		backend back = new backend(low, high);
	}
	
}
