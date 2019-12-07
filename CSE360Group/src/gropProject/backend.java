package gropProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.bufferedWriter;

public class backend
{
	int low;//lowerbound
	int high;//upperbound
	String log;//to log events
	String errorlog;//a log of errors
	ArrayList<Float> allgrades;
	
	//returns all grades added to display or use for graph
	public ArrayList<Float> getgrades()
	{
		log = log + "Displaying grades\n";
		return allgrades;
	}
	
	//Constructor that takes in a lower and upper 
	public backend(int l, int h)
	{
		low = l;//load in lowerbound
		high = h;//load in upperbound
		log = "";//begin log
		errorlog = "";
		allgrades = new ArrayList<Float>();
	}
	
	//takes string filename to read in files from file
	public void loadfile(String filename) throws IOException
	{	//Note that the filename can be full path
		allgrades.clear();	//Clears ArrayList for new set of data
		File data = new File(filename);	//Creates File using name
		if(data.isFile())	//Ensures that, there is a file using the name
		{
			log = log + "inporting " + filename + "\n";
			BufferedReader br = new BufferedReader(new FileReader(data));
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
			br.close();
		}
		else	//If there is no file, prints error
			System.out.println("Error: File Not Found.");
	}
	
	//adds value x to the arrayList
	public void append(float addThis)
	{
		if(addThis >= low && addThis <= high)
		{
			allgrades.add(addThis);
			log = log + addThis + " has been added to the data set\n";
		}
		errorlog = errorlog + "Error: " + addThis + "is not within the bounds\n";
		log = log + "Error: " + addThis + "is not within the bounds\n";
	}
	
	//deletes first appearance of a value from allgrades
	public void deleteValue(float delThis)
	{
		
		for(int trav=0; trav<=allgrades.size()-1; trav++)
		{
			if(allgrades.get(trav)==delThis)
			{
				allgrades.remove(trav);
				log=log+delThis+" has been deleted from the data set";
				break;
			}
		}
		errorlog = errorlog + "Error: "+ delThis + " is not in data set and can not be deleted\n";
		log = log + "Error: " + delThis + " is not in data set and can not be deleted\n";
	}
	
	//reset the boundaries to given values
	public void setBounds(int l, int h)
	{
		if(l < h)
		{		
			low = l;
			high = h;
			log = log + "lower bounds has been set to " + l +"\n";
			log = log +" upper bounds has been set to " + h +"\n";
		}
		errorlog = errorlog + "Error:" + l + " is greater than " + h + " , the boundaries will not be changed\n"; 
		log = log + "Error:" + l + " is greater than " + h + " , the boundaries will not be changed\n"; 
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
		log = log + "the mean of the dataset it " + sum/allgrades.size() + "\n";
		return sum/allgrades.size();
	}
	
	//returns high of data set
	public float getHigh()
	{
		float max = allgrades.get(0);
		for(int i = 0; i < allgrades.size(); i++)
			if(max < allgrades.get(i))
				max = allgrades.get(i);
		log = log + "the high of the dataset is " + max + "\n";
		return max;
	}

	//returns low of data set
	public float getLow()
	{
		float low = allgrades.get(0);
		for(int i = 0; i < allgrades.size(); i++)
			if(low > allgrades.get(i))
				low = allgrades.get(i);
		log = log + "the low of the dataset is " + low + "\n";
		return low;
	}
	
	//returns median of data set
	public float getMedian()
	{
		int median;	//This is the index(int) of the value that is the median(float)
		median = ((int)(allgrades.size()/2 + 0.5 - 1));	//Will take ceiling. Ex: 3/2 = 1.5 + 0.5 = 2 ; 4/2 = 2 + 0.5 = 2 becuase int drops .05
		log = log + "the median of the dataset is" + median + "\n";
		return allgrades.get(median);	//Returns the value at median index
	}
	
	//returns mode of data sets
	public float getMode()
	{
		int i, occur = 0;
		float num, absoccur = 0, mode = 0;
		ArrayList<Float> temp = (ArrayList<Float>) allgrades.clone();//Clones allgrades to not intefere with original data
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
		log = log + "the mode of the dataset is " + mode + "\n";
		return mode;	//Returns value with highest occurences
	}
	
	//returns log of events
	public string getlog()
	{
		return log;
	}
	//return log of errors
	public string geterrors()
	{
		return errorlog;
	}

	//creates report, requires filename 
	public void createReport(String filename)
	{
		if(filename.contains(.txt))//if filename does have .txt open file
		{
			BufferedWriter writer = new BufferedWriter( new FileWriter(filename));
		}	
		else//else add .txt to filename then open it
		{
			BufferedWriter writer = new BufferedWriter( new FileWriter(filename+".txt"));
		}
		writer.write(log);
		writer.close();
	}
	
	
}

