package useful.controller;

import java.util.List;
import java.util.ArrayList;

import useful.model.Donut;
import useful.view.PopupDisplay;

public class ListController
{
	private List<Donut> donutList;
	private PopupDisplay display;

	public ListController()
	{
		donutList = new ArrayList<Donut>(); // this is how to initialize the list for donut.
		display = new PopupDisplay();
	}

	public void start()
	{
		Donut temp = new Donut();
		ArrayList<String> tempList = new ArrayList<String>();
		tempList.add("this is a word sequence");
		tempList.add("DonutTests.zip");
		tempList.add("I love dinosarurs");
		tempList.add(" The emoji movie july twenty eight go see it with your fellow broskis A DAB");
		tempList.add("I am a sausage mcmuffin.");
		
		display.displayText("The longest string in the templList is: " + maxLength(tempList) + display.displayText(tempList));
		
		
		donutList.add(new Donut()); // Added a new donut into the list.
		fillTheList();
		// showTheList();
		changeTheList();
	}

	private void showTheList()
	{
		String favorite = "chocolate and more chocolate";
		for (int index = 0; index < donutList.size(); index += 1)
		{
		//Public int maxLength(arraylist<string> me list)
			// {   int max = 0;
			//for (int index = 0; index < myList.size() ); index +=1
			//{
				// if (max < myList.get(index).length()
					//{
						//max = myList.get(index)length);
					//}
			//}
			
			//return max;
			//}
			
			String currentFlavor = donutList.get(index).getFlavor();
			Donut currentDonut = donutList.get(index);
			String flavor = currentDonut.getFlavor();
			if (currentFlavor.equals(favorite))
			{
				for (int woop = 0; woop < 5; woop += 1)
				{
					display.displayText("MMMMMM My favorite");
				}
				for (int currentLetterIndex = 0; currentLetterIndex < currentFlavor.length(); currentLetterIndex += 1)
				{
					display.displayText(currentFlavor.substring(currentLetterIndex, currentLetterIndex + 1));
				}
				display.displayText(donutList.get(index));
			}

		}

	}

	private void fillTheList()

	{
		Donut jellyFilled = new Donut("jelly filled");
		Donut glazedSprinkles = new Donut("Glazed and Sprinkles");
		Donut chocolate = new Donut("Chocolate");
		Donut mapleBar = new Donut("Rectangle, Maple, 0");

		donutList.add(jellyFilled);
		donutList.add(glazedSprinkles);
		donutList.add(chocolate);
		donutList.add(mapleBar);

	}

	private void changeTheList()
	{
		display.displayText("The list is this big: " + donutList.size());
		Donut removed = donutList.remove(0);
		display.displayText(removed.getFlavor() + " was removed from the list");
		display.displayText("Now it is this big: " + donutList.size());
		donutList.add(removed);

		display.displayText("The list is still contains: " + donutList.size() + " items.");
		removed = donutList.set(3, new Donut());
		display.displayText("The donut with flavor " + removed.getFlavor() + " has been removed");

		display.displayText("The list is this big: " + donutList.size());

	}
	
	public int maxLength(ArrayList<String> myList)
	{
		int max = 0;
		
		for(int index = 0; index < myList.size(); index += 1)
		{
			if (max <myList.get(index).length())
			{
				max = myList.get(index).length();
			}
		}
		
		
		return max;
	}
	
	public String getLongestString(ArrayList<String> myList) 
	{
		String longest = "";
		int max = 0; 
		
		for (int index = 0; index < myList.size(); index +=1)
		{
			if (myList.get(index).length() > max)
			{
				max = myList.get(index).length();
				longest = myList.get(index);
			}
		}
		
		return longest;
	}

	public ArrayList<Donut> getDonutList()
	{
		return (ArrayList<Donut>) donutList;
	}
	
	public PopupDisplay getDisplay()
	{
		
		return display;
	}

}
