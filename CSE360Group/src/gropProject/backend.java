package gropProject;

import java.util.*;

public class backend
{
	int low;//lowerbound
	int high;//upperbound
	String log;//to log events
	ArrayList<Float> allgrades;
	
	
	//Constructor that takes in a lower and upper 
	public backend(int l, int h)
	{
		low = l;//load in lowerbound
		high = h;//load in upperbound
		log = "";//begin log
		ArrayList<Float> allgrades = new ArrayList<Float>();//
	}
	
	//takes string filename to read in files from file
	public void loadfile(String filename)
	{
		allgrades.clear();
	}
	
	//adds value x to the arrayList
	public void append(float addThis)
	{
		allgrades.add(addThis);
	}
	
	//deletes first appearance of a value from allgrades
	public void deleteValue(float delThis)
	{
		for(int trav=0; trav<allgrades.size()-1; trav++)
		{
			if(allgrades.get(trav)==delThis)
			{
				allgrades.remove(trav);
				break;
			}
		}
	}
	
	//reset the boundaries to given values
	public void setBounds(int l, int h)
	{
		low =l;
		high=h;
	}
	
	//return number of entries in dataset
	public int getNumofEntries()
	{
		return allgrades.size();
	}
	
	// returns mean of data set
	public float getMean()
	{
		return 0;
	}
	
	//returns high of data set
	public float getHigh()
	{
		return 0;
	}
	
	//returns median of data set
	public float getMedian()
	{
		return 0;	
	}
	
	//returns mode of data sets
	public float getMode()
	{
		return 0;
	}
	
	
	
	
	
	
	
	
	
}
