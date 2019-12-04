package gropProject;

import java.io.*;
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
		allgrades = new ArrayList<Float>();
	}
	
	//takes string filename to read in files from file
	public void loadfile(String filename)
	{
		allgrades.clear();	//Clears ArrayList for new set of data
		File data = new File(filename);	//Creates File using name
		if(data.isFile())	//Ensures that, there is a file using the name
		{
			BufferedReader br = new BufferedReader(data);
			String str;
			if(filename.endsWith(".txt"))	//Checks if file is .txt...
			{
				while((str = br.readLine()) != null)	//Reads every line of file...
					allgrades.add(Float.parseFloat(str));	//... ands adds it to the ArrayList
			}
			else	//... or .csv
			{
				while((str = br.readLine()) != null)
					{
						String[] temp = str.split(",");	//Saves line of CSVs
						for(int i = 0; i < temp.length; i++)//Goes through the line of CSVs...
							allgrades.add(Float.parseFloat(temp[i]));	//... and adds them to ArrayList
					}
			}
		}
		else	//If there is no file, prints error
			System.out.println("Error: File Not Found.");
	}
	
	//adds value x to the arrayList
	public void append(float addThis)
	{
		allgrades.add(addThis);
	}
	
	//deletes first appearance of a value from allgrades
	public void deleteValue(float delThis)
	{
		for(int trav=0; trav<=allgrades.size()-1; trav++)
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
		float sum = 0;
		for(int i = 0; i < allgrades.size(); i++)
			sum += allgrades.get(i);
		return sum/allgrades.size();
	}
	
	//returns high of data set
	public float getHigh()
	{
		float max = allgrades.get(0);
		for(int i = 0; i < allgrades.size(); i++)
			if(max < allgrades.get(i))
				max = allgrades.get(i);
		return max;
	}

	//returns low of data set
	public float getLow()
	{
		float low = allgrades.get(0);
		for(int i = 0; i < allgrades.size(); i++)
			if(low > allgrades.get(i))
				low = allgrades.get(i);
		return low;
	}
	
	//returns median of data set
	public float getMedian()
	{
		int median;
		median = ((int)(allgrades.size()/2 + 0.5 - 1));	//Will take ceiling. Ex: 3/2 = 1.5 + 0.5 = 2 ; 4/2 = 2 + 0.5 = 2 becuase int drops .05
		return allgrades.get(median);
	}
	
	//returns mode of data sets
	public float getMode()
	{
		int i, occur = 0;
		float num, absoccur = 0, mode = 0;
		ArrayList<Float> temp = allgrades.clone();//Clones allgrades to not intefere with original data
		while(temp.size() != 0)
		{
			num = temp.get(0);	//Gets the float of the first index; will be different because original 1 gets removed.
			while((i = temp.indexOf(num)) != -1)	//-1 is index not found, searches for indexes equal to value of index one
			{
				temp.remove(i);	//First run will remove index 1; Subsequent runs will remove all other occurences of the value
				occur++;	//To help decide which appears most
			}
			if(occur > absoccur)	//Checks current iterations mode to the absolute mode
			{
				absoccur = occur;	//If current iteration is greater, than current is now absolute
				mode = num;	//new mode, equal to current value
			}
			occur = 0;	//Resets occurences
		}
		return mode;	//Returns value with highest occurences
	}
	
}
